package com.hzit.dao.services;

import com.hzit.dao.vo.CardCouponVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/29.
 */
public interface CardCouponServices {
    List<CardCouponVo> findByPages();
}
