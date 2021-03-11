package Creational.Singleton;

/**
 * 懒汉式，线程不安全
 * 什么时候用就什么时候初始化
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;

    private Singleton02() {};

    public static Singleton02 getInstance() {
        if (INSTANCE == null) {

            // 模拟线程执行时间 1ms
            /*try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }
}
