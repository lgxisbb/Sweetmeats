package com.duang.spring.bean.log.std;

import com.duang.spring.bean.log.Log;

/**
 * @Author You'r Dragon
 * @CreateTime 2020/7/3 22:01
 * @Description <p> </p>
 */
public class StdLogImpl implements Log {

    @Override
    public boolean debugEnable() {
        return true;
    }

    public void debug(String msg) {
        System.out.println(msg);
    }

    public void info(String msg) {
        System.out.println(msg);
    }

    public void error(String msg) {
        System.out.println(msg);
    }

    public void error(String msg, Throwable e) {
        System.err.println(msg);
        e.printStackTrace(System.err);
    }
}
