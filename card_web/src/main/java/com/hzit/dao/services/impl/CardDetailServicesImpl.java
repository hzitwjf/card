package com.hzit.dao.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.mapper.CardDetailMapper;
import com.hzit.dao.services.CardDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/31.
 */
@Service
public class CardDetailServicesImpl implements CardDetailService {
    @Autowired
    private CardDetailMapper cardDetailMapper;
    @Override
    public Page<CardDetail> findDetailByCardId(String cardUuid, int page, int rowCount) {
        Map map=new HashMap();
        map.put("cardId",cardUuid);
        PageRequest pageRequest=new PageRequest(page,rowCount);
        Page<CardDetail> cardDetailPage=cardDetailMapper.searchCardDetailByParams(map,pageRequest);
        return cardDetailPage;
    }
}
