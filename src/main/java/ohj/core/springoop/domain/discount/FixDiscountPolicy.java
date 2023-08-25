package ohj.core.springoop.domain.discount;

import ohj.core.springoop.domain.member.entity.Grade;
import ohj.core.springoop.domain.member.entity.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
@Component
@Qualifier("fixDiscountPolicy")
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인

    /**
     * 회원 등급이 vip 인 경우 1000원 할인
     * @param member
     * @param price
     * @return
     */
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) return discountFixAmount;
        else return 0;
    }
}
