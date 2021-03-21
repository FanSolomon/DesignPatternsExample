package com.fansolomon.Structural.Proxy.Tank.cglib;

import net.sf.cglib.proxy.Enhancer;

import java.util.Random;

/**
 * CGLIB实现动态代理不需要接口
 */
public class Tank {
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
        tank.move();
    }
}
