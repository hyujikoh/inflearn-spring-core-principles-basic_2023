package ohj.core.springoop.autowired;

import ohj.core.springoop.domain.member.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-25
 * Desc : autowired 테스트
 */
public class AutowiredTest {

    @Test
    void AutowiredOption(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext((TestBean.class));
    }

    static class TestBean{

        @Autowired(required = false) //자동 주입할 대상이 없으면 수정자 메서드 자체가 호출 안됨
        public void setNoBean1(Member noBean1){
            System.out.println("setNoBean1 = " + noBean1);
        }

        @Autowired// 자동 주입할 대상이 없으면 null이 입력된다.
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("setNoBean2 = " + noBean2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("setNoBean3 = " + noBean3);
        }
    }
}
