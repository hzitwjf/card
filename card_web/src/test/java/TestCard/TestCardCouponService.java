package TestCard;


import com.fc.platform.commons.page.Page;
import com.hzit.dao.StartSpring;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.vo.CardCouponVo;
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
        Page<CardCouponVo> cardCouponPage=cardCouponServices.findByPages(0,10);
        for (CardCouponVo cardCouponVo : cardCouponPage ){
            System.out.println(cardCouponVo.toString());
        }
        System.out.println("总页数："+cardCouponPage.getTotalPages());
        System.out.println("总行数："+cardCouponPage.getTotalElements());
    }
    @Test
    public void findOneCardCoupon(){
        CardCouponVo cardCouponVo=cardCouponServices.findOneCardCoupon("83304e29-efb1-4851-84b0-7af691742713");
        System.out.println(cardCouponVo.toString());
    }
    @Test
    public void UpdateCardCoupon(){
        CardCoupon cardCoupon=new CardCoupon();
        cardCoupon.setCardStock(0);
        cardCoupon.setCardId(2);
        int i=cardCouponServices.updateCardCoupon(cardCoupon);
        System.out.println(i);
    }
}
