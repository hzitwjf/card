package TestCard;


import com.fc.platform.commons.page.Page;
import com.hzit.dao.StartSpring;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.services.CardDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2016/10/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(StartSpring.class)
public class TestCardDetailService {
    @Autowired
    private CardDetailService cardDetailService;
    @Test
    public void findByPages(){
        Page<CardDetail> cardDetailPage=cardDetailService.findDetailByCardId("83304e29-efb1-4851-84b0-7af691742713", 0, 2);
        for (CardDetail cardDetail : cardDetailPage){
            System.out.println(cardDetail.toString());
        }
        System.out.println("总页数："+cardDetailPage.getTotalPages());
        System.out.println("总行数："+cardDetailPage.getTotalElements());
    }
}
