package Creational.Singleton;

/**
 * 枚举方式
 * 线程安全，还可以防止序列化
 * 由于枚举类没有构造方法，所以即使有class文件也没法实例化对象
 */
public enum  Singleton06 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton06.INSTANCE.hashCode());
            }).start();
        }
    }
}
