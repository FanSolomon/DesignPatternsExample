package com.fansolomon.Structural.Proxy.Tank.T02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    //getClass.getMethods[]
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start..");
        Object o = method.invoke(tank, args);
        System.out.println("method " + method.getName() + " end!");
        return o;
    }
}
