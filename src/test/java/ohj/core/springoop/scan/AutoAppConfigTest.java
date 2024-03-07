package ohj.core.springoop.scan;

import ohj.core.springoop.AutoAppConfig;
import ohj.core.springoop.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-07
 * Desc :
 */
public class AutoAppConfigTest {
    @Test
    void basicScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
