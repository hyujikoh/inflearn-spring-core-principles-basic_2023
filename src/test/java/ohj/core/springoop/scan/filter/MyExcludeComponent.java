package ohj.core.springoop.scan.filter;

import java.lang.annotation.*;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-07
 * Desc :
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
