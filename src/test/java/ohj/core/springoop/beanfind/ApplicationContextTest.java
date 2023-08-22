package ohj.core.springoop.beanfind;

import ohj.core.springoop.config.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-22
 * Desc :
 */
public class ApplicationContextTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for(String beanDefinitionName : beanDefinitionNames){
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object = " + bean);
        }
    }

    @Test
    @DisplayName("어플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for(String beanDefinitionName : beanDefinitionNames){
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            // ROLE_APPLICATION : 내가 개발하기 위해 등록한 빈일 경우 출력
            // ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            if(beanDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE){
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);
            }
        }
    }
}
