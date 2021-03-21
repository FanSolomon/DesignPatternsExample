package com.fansolomon.Creational.Singleton;

/**
 * 懒汉式，线程安全
 * 双重检查 DCL，即 double-checked locking
 */
public class Singleton04 {
    // volatile 防止java语言中的指令重排导致的返回实例为空的问题 JIT优化
    private volatile static Singleton04 INSTANCE;

    private Singleton04() {};

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {

            synchronized (Singleton04.class) {
                // 双重检查
                if (INSTANCE == null) {
                    // 模拟线程执行时间 1ms
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    INSTANCE = new Singleton04();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }
}
