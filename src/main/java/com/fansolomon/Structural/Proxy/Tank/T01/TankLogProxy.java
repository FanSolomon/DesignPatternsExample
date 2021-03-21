package com.fansolomon.Structural.Proxy.Tank.T01;

import com.fansolomon.Structural.Proxy.Tank.Movable;

public class TankLogProxy implements Movable {
    // 维护一个需要代理的对象，注意这里类型是 Movable
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}
