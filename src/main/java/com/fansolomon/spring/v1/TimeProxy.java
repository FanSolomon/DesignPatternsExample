package com.fansolomon.spring.v1;

/**
 * xml方式配置AOP
 */
public class TimeProxy {
    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }
}
