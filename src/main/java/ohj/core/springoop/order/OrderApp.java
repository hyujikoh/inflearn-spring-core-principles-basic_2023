package ohj.core.springoop.order;

import ohj.core.springoop.AppConfig;
import ohj.core.springoop.member.Grade;
import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-04
 * Desc :
 */
public class OrderApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 42000);
        System.out.println("order = " + order);
    }
}
