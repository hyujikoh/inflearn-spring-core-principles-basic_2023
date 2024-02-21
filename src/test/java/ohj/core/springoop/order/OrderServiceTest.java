package ohj.core.springoop.order;

import ohj.core.springoop.member.Grade;
import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.service.MemberService;
import ohj.core.springoop.member.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
