package com.hzit.dao.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.services.CardDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
       Page<CardDetail> cardDetailPage= cardDetailService.findDetailByCardId(cardUuid, page, 10);
        return cardDetailPage;
    }
}
