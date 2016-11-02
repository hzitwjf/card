package com.hzit.dao.services.impl;

import com.hzit.dao.entity.CardType;
import com.hzit.dao.mapper.CardTypeMapper;
import com.hzit.dao.services.CardTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
@Service
public class CardTypeServicesImpl implements CardTypeServices {
    @Autowired
    private CardTypeMapper cardTypeMapper;
    @Override
    public List<CardType> findAllCardType() {
        List<CardType> cardTypeList=cardTypeMapper.searchCardTypeByParams(null);
        return cardTypeList;
    }
}
