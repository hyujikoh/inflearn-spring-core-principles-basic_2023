package ohj.core.springoop.domain.discount;

import ohj.core.springoop.domain.member.entity.Grade;
import ohj.core.springoop.domain.member.entity.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc : 금액비율에 따른 할인 서비스 구현체
 */
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }
        else{
            return 0;
        }
    }
}
