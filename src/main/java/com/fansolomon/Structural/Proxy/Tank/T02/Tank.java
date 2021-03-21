package com.fansolomon.Structural.Proxy.Tank.T02;

import com.fansolomon.Structural.Proxy.Tank.Movable;

import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 动态代理
 *
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 * 分离代理行为与被代理对象
 * 使用jdk的动态代理
 */
public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();

        //反射 reflection 通过二进制字节码分析类的属性和方法

        // 通过反射观察生成的代理对象
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class}, //tank.class.getInterfaces()
                new LogHandler(tank)
        );

        m.move();
    }
}
