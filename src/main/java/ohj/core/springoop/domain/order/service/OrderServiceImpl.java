package ohj.core.springoop.domain.order.service;

import ohj.core.springoop.domain.discount.DiscountPolicy;
import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.repository.MemberRepository;
import ohj.core.springoop.domain.order.Order;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
public class OrderServiceImpl implements  OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
       Member member = memberRepository.findById(memberId);
       int discountPrice = discountPolicy.discount(member, itemPrice);

       return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
