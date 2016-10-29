package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.CardType;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CardTypeMapper {

	void insertCardType(CardType cardType);

	void deleteCardTypeByCardTypeId(Integer cardTypeId);

	void updateCardType(CardType cardType);

	Page<CardType> searchCardTypeByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<CardType> searchCardTypeByParams(@Param("map") Map<String, String> map);

} 
