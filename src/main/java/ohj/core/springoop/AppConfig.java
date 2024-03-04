package ohj.core.springoop;

import ohj.core.springoop.discount.DiscountPolicy;
import ohj.core.springoop.discount.FixDiscountPolicy;
import ohj.core.springoop.member.respository.MemberRepository;
import ohj.core.springoop.member.respository.MemoryMemberRepository;
import ohj.core.springoop.member.service.MemberService;
import ohj.core.springoop.member.service.MemberServiceImpl;
import ohj.core.springoop.order.OrderService;
import ohj.core.springoop.order.OrderServiceImpl;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-04
 * Desc :
 */
public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


}
