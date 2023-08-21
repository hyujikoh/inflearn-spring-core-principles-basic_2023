package ohj.core.springoop.order;

import ohj.core.springoop.config.AppConfig;
import ohj.core.springoop.domain.member.entity.Grade;
import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.service.MemberService;
import ohj.core.springoop.domain.member.service.MemberServiceImpl;
import ohj.core.springoop.domain.order.Order;
import ohj.core.springoop.domain.order.service.OrderService;
import ohj.core.springoop.domain.order.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
public class OrderServiceTest {
    MemberService memberService;

    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();

        orderService = appConfig.orderService();;
    }
    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
