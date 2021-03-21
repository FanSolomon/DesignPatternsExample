package com.fansolomon.spring.v2;

import com.fansolomon.spring.Tank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_auto.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }
}
