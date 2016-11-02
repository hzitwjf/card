package com.hzit.dao.controller;

import com.hzit.dao.services.CardTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
@Controller
@RequestMapping("cardType")
public class CardTypeController {
    @Autowired
    private CardTypeServices cardTypeServices;
    @RequestMapping("findAll")
    @ResponseBody
    public Object findAllCardType(){
        return cardTypeServices.findAllCardType();
    }
}
