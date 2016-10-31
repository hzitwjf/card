package TestCard;


import com.fc.platform.commons.page.Page;
import com.hzit.dao.StartSpring;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.services.CardDetailService;
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
public class TestCardDetailService {
    @Autowired
    private CardDetailService cardDetailService;
    @Test
    public void findDetailByPages(){
        Page<CardDetailVo> cardDetailPage=cardDetailService.findDetailByCardId("83304e29-efb1-4851-84b0-7af691742713", 0, 2);
        for (CardDetailVo cardDetail : cardDetailPage){
            System.out.println(cardDetail.toString());
        }
        System.out.println("总页数："+cardDetailPage.getTotalPages());
        System.out.println("总行数："+cardDetailPage.getTotalElements());
    }
    @Test
    public void findDetailByUserId(){
      List<CardDetailVo> cardDetailList= cardDetailService.findDetailByUserId("a4fc6ba2-1c14-4743-a1a5-5b22553644f9");
      for (CardDetailVo cardDetail : cardDetailList ){
          System.out.println(cardDetail.toString());
      }
    }
}
