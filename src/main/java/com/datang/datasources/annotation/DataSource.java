package com.datang.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author xuchangjiang
 * @email 13485386017@163.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
