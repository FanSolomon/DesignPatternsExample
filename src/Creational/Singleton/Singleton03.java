package Creational.Singleton;

/**
 * 懒汉式，线程安全
 * 在getInstance方法上加锁，十分影响性能
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() {};

    public static synchronized Singleton03 getInstance() {
        if (INSTANCE == null) {

            // 模拟线程执行时间 1ms
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
