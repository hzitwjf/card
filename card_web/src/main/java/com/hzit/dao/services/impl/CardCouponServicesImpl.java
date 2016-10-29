package com.hzit.dao.services.impl;

import com.hzit.dao.mapper.CardCouponMapper;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.vo.CardCouponVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/29.
 */
@Service
public class CardCouponServicesImpl implements CardCouponServices{
    @Autowired
    private CardCouponMapper cardCouponMapper;
    @Override
    public List<CardCouponVo> findByPages() {
        cardCouponMapper.searchCardCouponByParams(null);
        return null;
    }
}
