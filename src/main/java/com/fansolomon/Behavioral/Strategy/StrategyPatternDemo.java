package com.fansolomon.Behavioral.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(3,4));
    }
}
