package com.duang.spring.bean.annotation;

import java.lang.annotation.*;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 22:21
 * @Description <p> </p>
 * 被这个注解声明的类, 会被自动加载到容器中
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IocComponent {
}
