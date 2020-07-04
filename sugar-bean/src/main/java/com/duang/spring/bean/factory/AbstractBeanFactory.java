package com.duang.spring.bean.factory;

import com.duang.spring.bean.log.Log;
import com.duang.spring.bean.log.SugarLogFactory;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 22:32
 * @Description <p> </p>
 */
public abstract class AbstractBeanFactory implements SugarBeanFactory {

    private static final Log log = SugarLogFactory.getLog(AbstractBeanFactory.class);

    private Map<String, Object> beanMap = new ConcurrentHashMap<String, Object>();

    @Override
    public <T> T getBeanByClass(Class<T> clazz) {
        return null;
    }

    @Override
    public <T> T getBeanByBeanName(String name) {
        return null;
    }

    @Override
    public <T> List<T> getBeansByClass(Class<T> clazz) {
        return null;
    }

    @Override
    public boolean registerBean(String beanName, Object obj) {
        // 如果已经存在同名的bean的话
        if (Objects.isNull(beanMap.get(beanName))) {
            beanMap.put(beanName, obj);
            if (log.debugEnable()) {
                log.debug("register bean [" + beanName + "] [" + obj.getClass() + "]");
            }
            return true;
        }
        return false;
    }
}
