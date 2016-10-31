package com.hzit.dao.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.mapper.CardCouponMapper;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.vo.CardCouponVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/29.
 */
@Service
public class CardCouponServicesImpl implements CardCouponServices{
    @Autowired
    private CardCouponMapper cardCouponMapper;

    @Override
    public Page<CardCouponVo> findByPages(int page, int rowCount) {
        PageRequest pageRequest=new PageRequest(page,rowCount);
        Page<CardCouponVo> cardCouponVoPage=cardCouponMapper.searchCardCouponByParams(null, pageRequest);
        return cardCouponVoPage;
    }

    @Override
    public CardCouponVo findOneCardCoupon(String cardUuid) {
        Map map=new HashMap();
        map.put("cardUuid",cardUuid);
        List<CardCouponVo> cardCouponVoList=cardCouponMapper.searchCardCouponByParams(map);
        if (cardCouponVoList.size()==1){
            return cardCouponVoList.get(0);
        }else {
            return null;
        }
    }
}
