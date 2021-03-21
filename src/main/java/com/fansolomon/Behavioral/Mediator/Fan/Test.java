package com.fansolomon.Behavioral.Mediator.Fan;

/**
 * 参考地址：https://www.baeldung.com/java-mediator-pattern
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        System.out.println(mediator.getFan().isOn());
        mediator.getButton().press();
        System.out.println("after press button... " + mediator.getFan().isOn());
        mediator.getButton().press();
        System.out.println("after press button... " + mediator.getFan().isOn());
    }
}
