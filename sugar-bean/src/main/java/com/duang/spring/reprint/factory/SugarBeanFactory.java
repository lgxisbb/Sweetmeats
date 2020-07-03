package com.duang.spring.reprint.factory;

import java.util.List;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 19:37
 * @Description <p> </p>
 */
public interface SugarBeanFactory {

    <T> T getBeanByClass(Class<T> clazz);

    <T> T getBeanByBeanName(String name);

    <T> List<T> getBeansByClass(Class<T> clazz);

}
