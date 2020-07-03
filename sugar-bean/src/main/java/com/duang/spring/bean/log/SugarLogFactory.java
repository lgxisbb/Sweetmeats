package com.duang.spring.bean.log;

import com.duang.spring.bean.log.std.StdLogImpl;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 20:54
 * @Description <p> </p>
 */
public class SugarLogFactory {

    // TODO
    // 实现 log4j log4j2 slf4j jdkLog 版本日志输出
    public static Log getLog(Class clazz) {
        return new StdLogImpl();
    }

    public static Log getLog(String log) {
        return new StdLogImpl();
    }
}
