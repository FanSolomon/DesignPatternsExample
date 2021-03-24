package com.fansolomon.Behavioral.Observer.Scale;

/**
 * 观察者模式
 * 事件处理模型 （常常为 观察者 + 责任链）
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
