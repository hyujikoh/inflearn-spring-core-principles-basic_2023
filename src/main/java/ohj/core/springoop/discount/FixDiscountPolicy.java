package ohj.core.springoop.discount;

import ohj.core.springoop.member.Grade;
import ohj.core.springoop.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
@Qualifier("fixDiscountPolicy")
@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
