package com.hzit.dao.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.vo.CardCouponVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
@Controller
@RequestMapping("cardCoupon")
public class CardCouponController {
    @Autowired
    private CardCouponServices cardCouponServices;

    /**
     * 分页查询卡券信息表
     * @param page page参数代表当前页面的页数，默认是为0
     * @return 返回当前页面所有的卡券信息的JSON字符串
     */
    @RequestMapping("/findByPage")
    @ResponseBody
    public  Object findByPage(@RequestParam(name="page",defaultValue = "0")Integer page){
        if(page<=0){
            page=0;
        }
        /**
         * page是页数；
         * 10代表一页显示多少行；
         */
        Page<CardCouponVo> cardCouponVoPage=cardCouponServices.findByPages(page, 10);
        return cardCouponVoPage;
    }
    @RequestMapping("/findOneCardCoupon")
    @ResponseBody
    public  Object findOneCardCoupon(@RequestParam("cardUuid")String cardUuid,HttpSession httpSession){
       CardCouponVo cardCouponVo=cardCouponServices.findOneCardCoupon(cardUuid);
        System.out.println(cardCouponVo.toString());
        httpSession.setAttribute("cardCouponVo",cardCouponVo);
        return cardCouponVo;
    }
    @RequestMapping("/insetCardCoupon")
    @ResponseBody
    public  int insetCardCoupon(CardCoupon cardCoupon){
        int i=cardCouponServices.insertCardCoupon(cardCoupon);
        return i;
    }
    @RequestMapping("/toInsetCardCoupon")
    public  String toInsetCardCoupon(CardCoupon cardCoupon){
        return "addCardCoupon";
    }
    @RequestMapping("/findByLike")
    @ResponseBody
    public  Object findByLike(@RequestParam("cardName")String cardName){
        return cardCouponServices.findByCardName(cardName);
    }
}
