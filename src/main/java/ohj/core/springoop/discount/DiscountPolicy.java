package ohj.core.springoop.discount;

import ohj.core.springoop.member.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public interface DiscountPolicy {
    /**
     * 할인대상 금액
     * @param member
     * @param price
     * @return
     */
    int discount(Member member, int price);
}
