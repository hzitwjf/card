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
import java.util.List;



/**
 * @author wjf
 * Created  on 2016/10/29.
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
    public void updateCardCoupon(){
        CardCoupon cardCoupon=new CardCoupon();
        cardCoupon.setCardStock(0);
        cardCoupon.setCardId(2);
        int i=cardCouponServices.updateCardCoupon(cardCoupon);
        System.out.println(i);
    }
    @Test
    public void insertCardCoupon(){
        CardCoupon cardCoupon=new CardCoupon();
        cardCoupon.setCardName("生活用品");
        cardCoupon.setCardBigPicUrl("images/星空1.jpg");
        cardCoupon.setCardSmallPicUrl("images/星空2.jpg");
        cardCoupon.setCardTypeId(2);
        cardCoupon.setCardStartTime("2016-07-01 21:00:00");
        cardCoupon.setCardEndTime("2016-08-01 21:00:00");
        cardCoupon.setCardStock(100);
        cardCoupon.setCardRestrict(1);
        int i=cardCouponServices.insertCardCoupon(cardCoupon);
        System.out.println(i);
    }
    @Test
    public void findByLike(){
        List<CardCouponVo> cardCouponVoList=cardCouponServices.findByCardName("测试");
        for (CardCouponVo cardCouponVo : cardCouponVoList){
            System.out.println(cardCouponVo.getCardName());
        }
    }
}
