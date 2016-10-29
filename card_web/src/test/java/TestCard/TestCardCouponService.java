package TestCard;


import com.fc.platform.commons.page.Page;
import com.hzit.dao.StartSpring;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.services.CardCouponServices;
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
public class TestCardCouponService {
    @Autowired
    private CardCouponServices cardCouponServices;
    @Test
    public void findByPages(){
        Page<CardCoupon> cardCouponPage=cardCouponServices.findByPages(0,2);
        for (CardCoupon cardCoupon : cardCouponPage ){
            System.out.println(cardCoupon.toString());
        }
    }
}
