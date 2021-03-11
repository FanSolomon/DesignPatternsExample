package Creational.Singleton;

/**
 * 静态内部类/登记式
 * JVM可保证其线程安全
 * 加载外部类时不会加载内部类，实现了懒加载
 */
public class Singleton05 {

    private Singleton05() {};

    private static class SingletonHolder{
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }
}
