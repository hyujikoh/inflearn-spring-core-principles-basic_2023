package ohj.core.springoop;

import ohj.core.springoop.discount.DiscountPolicy;
import ohj.core.springoop.discount.FixDiscountPolicy;
import ohj.core.springoop.discount.RateDiscountPolicy;
import ohj.core.springoop.member.respository.MemberRepository;
import ohj.core.springoop.member.respository.MemoryMemberRepository;
import ohj.core.springoop.member.service.MemberService;
import ohj.core.springoop.member.service.MemberServiceImpl;
import ohj.core.springoop.order.OrderService;
import ohj.core.springoop.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-04
 * Desc :
 */
@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {

        //1번
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }


}
