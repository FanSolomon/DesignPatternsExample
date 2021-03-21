package com.fansolomon.Creational.Singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点：不论用到与否，类装载时就会完成实例化
 * 关于懒加载：Class.forName("")
 */
public class Singleton01 {
    // 方式一
    private static final Singleton01 INSTANCE = new Singleton01();

    // 方式二
    /*private static final Singleton01 INSTANCE;
    static {
        INSTANCE = new Singleton01();
    }*/

    private Singleton01() {};

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }
}
