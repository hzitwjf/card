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
import java.util.UUID;

/**
 * @author wjf
 * Created  on 2016/10/29.
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

    @Override
    public int updateCardCoupon(CardCoupon cardCoupon) {
        try {
            cardCouponMapper.updateCardCoupon(cardCoupon);
            return 1;
        }catch (Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @Override
    public int insertCardCoupon(CardCoupon cardCoupon) {
        try {
            cardCoupon.setCardUuid(UUID.randomUUID().toString());
            cardCoupon.setCardState("1");
            cardCouponMapper.insertCardCoupon(cardCoupon);
            return  1;
        }catch (Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<CardCouponVo> findByCardName(String cardName) {
        List<CardCouponVo> cardCouponVoList=cardCouponMapper.searchCardCouponByLike(cardName);
        return cardCouponVoList;
    }
}
