package com.duang.spring.bean.log;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 20:53
 * @Description <p> </p>
 */
public interface Log {

    default boolean debugEnable() {
        return false;
    }

    void debug(String msg);

    void info(String msg);

    void error(String msg);

    void error(String msg, Throwable e);
}
