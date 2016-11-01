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
 * Created by Administrator on 2016/10/29.
 */
@Controller
@RequestMapping("cardCoupon")
public class CardCouponController {
    @Autowired
    private CardCouponServices cardCouponServices;
    @RequestMapping("/findByPage")
    @ResponseBody
    public  Object findByPage(@RequestParam(name="page",defaultValue = "0")Integer page){
        if(page<=0){
            page=0;
        }
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
}
