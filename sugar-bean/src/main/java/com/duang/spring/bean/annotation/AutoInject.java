package com.duang.spring.bean.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 22:20
 * @Description <p> </p>
 * 自动注入注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface AutoInject {
}
