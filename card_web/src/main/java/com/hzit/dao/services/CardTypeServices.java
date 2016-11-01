package com.hzit.dao.services;

import com.hzit.dao.entity.CardType;

import java.util.List;

/**
 * Created by wjf13 on 2016/11/1.
 */
public interface CardTypeServices {
    /**
     * 查询所有卡券类型
     * @return  返回卡券类型表里所有数据，并把他封装到了一个List集合里面
     */
    List<CardType> findAllCardType();
}
