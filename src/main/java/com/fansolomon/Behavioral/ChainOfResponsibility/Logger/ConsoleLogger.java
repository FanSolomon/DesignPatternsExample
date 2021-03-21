package com.fansolomon.Behavioral.ChainOfResponsibility.Logger;

/**
 * ConcreteHandler
 * 处理它所负责的请求 可访问它的后继者
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
