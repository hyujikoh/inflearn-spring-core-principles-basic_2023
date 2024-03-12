package ohj.core.springoop.order;

import lombok.RequiredArgsConstructor;
import ohj.core.springoop.discount.DiscountPolicy;
import ohj.core.springoop.discount.FixDiscountPolicy;
import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.respository.MemberRepository;
import ohj.core.springoop.member.respository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
