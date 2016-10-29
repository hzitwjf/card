package TestCard;


import com.hzit.dao.StartSpring;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.vo.CardCouponVo;
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
public class TestCardCoupon {
    @Autowired
    private CardCouponServices cardCouponServices;
    @Test
    public void findByPages(){
        List<CardCouponVo> cardCouponVoList=cardCouponServices.findByPages();
        for (CardCouponVo cardCouponVo : cardCouponVoList){
            System.out.println(cardCouponVo.toString());
        }
    }
}
