package ohj.core.springoop.domain.discount;

import ohj.core.springoop.domain.member.entity.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc : 할인 정책 역할 인터페이스
 */
public interface DiscountPolicy {

    /**
     * 할인 대상 금액
     * @param member
     * @param price
     * @return
     */
    int discount(Member member, int price);
}
