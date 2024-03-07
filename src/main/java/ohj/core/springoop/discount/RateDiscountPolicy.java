package ohj.core.springoop.discount;

import ohj.core.springoop.member.Grade;
import ohj.core.springoop.member.Member;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-04
 * Desc :
 */
@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10; //10% 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
