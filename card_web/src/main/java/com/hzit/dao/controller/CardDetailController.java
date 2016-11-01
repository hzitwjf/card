package com.hzit.dao.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.services.CardDetailService;
import com.hzit.dao.vo.CardDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/10/31.
 */
@Controller
@RequestMapping("cardDetail")
public class CardDetailController {
    @Autowired
    private CardDetailService cardDetailService;
    @RequestMapping("findDetailByCardId")
    @ResponseBody
    public Object findDetailByCardId(@RequestParam("cardId") String cardUuid,@RequestParam(name="page",defaultValue = "0")Integer page){
        if(page<=0){
            page=0;
        }
       Page<CardDetailVo> cardDetailPage= cardDetailService.findDetailByCardId(cardUuid, page, 10);
        return cardDetailPage;
    }
    @RequestMapping("findDetailByUserId")
    @ResponseBody
    public Object findDetailByUserId(@RequestParam("userId") String userId){
       List<CardDetailVo> cardDetailVoList= cardDetailService.findDetailByUserId(userId);
        return cardDetailVoList;
    }
    @RequestMapping("insertDetailByCardUuid")
    @ResponseBody
    public Object insertDetailByCardUuid(@RequestParam("cardUuid")String cardUuid){
       return  cardDetailService.addCardDetail(cardUuid);
    }
    @RequestMapping("findMyPackage")
    @ResponseBody
    public Object findCardDetailByCardState(@RequestParam("userId")String userId,@RequestParam(name="cardState",defaultValue = "0")String cardState){
        return  cardDetailService.findCardDetailByCardState(userId,cardState);
    }
}
