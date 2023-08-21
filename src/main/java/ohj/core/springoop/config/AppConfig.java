package ohj.core.springoop.config;

import ohj.core.springoop.domain.discount.DiscountPolicy;
import ohj.core.springoop.domain.discount.FixDiscountPolicy;
import ohj.core.springoop.domain.discount.RateDiscountPolicy;
import ohj.core.springoop.domain.member.repository.MemberRepository;
import ohj.core.springoop.domain.member.repository.MemoryMemberRepository;
import ohj.core.springoop.domain.member.service.MemberService;
import ohj.core.springoop.domain.member.service.MemberServiceImpl;
import ohj.core.springoop.domain.order.service.OrderService;
import ohj.core.springoop.domain.order.service.OrderServiceImpl;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-21
 * Desc :
 */
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }


}
