package ohj.core.springoop.order;

import ohj.core.springoop.discount.DiscountPolicy;
import ohj.core.springoop.discount.FixDiscountPolicy;
import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.respository.MemberRepository;
import ohj.core.springoop.member.respository.MemoryMemberRepository;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
