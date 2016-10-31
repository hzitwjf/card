package com.hzit.dao.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardDetail;

/**
 * Created by Administrator on 2016/10/31.
 */
public interface CardDetailService {
    /**
     *
     * @param cardUuid 用户传入卡劵的业务ID
     * @param page  page代表用户传入的页数;
     * @param rowCount  rowCount代表每页要显示多少条数据;
     * @return  返回一个根据卡劵业务ID所找到的数据
     * 并进行封装过后可迭代的卡劵领取详情实体（CardCoupon）集合
     */
    Page<CardDetail> findDetailByCardId(String cardUuid,int page,int rowCount);
}
