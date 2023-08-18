package ohj.core.springoop.domain.order.service;

import ohj.core.springoop.domain.discount.DiscountPolicy;
import ohj.core.springoop.domain.discount.FixDiscountPolicy;
import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.repository.MemberRepository;
import ohj.core.springoop.domain.member.repository.MemoryMemberRepository;
import ohj.core.springoop.domain.order.Order;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
public class OrderServiceImpl implements  OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
       Member member = memberRepository.findById(memberId);
       int discountPrice = discountPolicy.discount(member, itemPrice);

       return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
