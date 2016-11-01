package TestCard;


import com.fc.platform.commons.page.Page;
import com.hzit.dao.StartSpring;
import com.hzit.dao.entity.CardType;
import com.hzit.dao.services.CardDetailService;
import com.hzit.dao.services.CardTypeServices;
import com.hzit.dao.vo.CardDetailVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by Administrator on 2016/10/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(StartSpring.class)
public class TestCardTypeService {
    @Autowired
    private CardTypeServices cardTypeServices;
    @Test
    public void findAllCardType(){
       List<CardType> cardTypeList=cardTypeServices.findAllCardType();
        for (CardType cardType : cardTypeList){
            System.out.println(cardType.toString());
        }
    }
}
