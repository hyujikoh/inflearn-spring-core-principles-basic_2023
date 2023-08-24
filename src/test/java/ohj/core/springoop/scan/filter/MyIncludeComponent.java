package ohj.core.springoop.scan.filter;

import java.lang.annotation.*;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-24
 * Desc :
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
