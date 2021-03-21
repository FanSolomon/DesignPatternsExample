package com.fansolomon.Behavioral.Command.Order;

/**
 * Receiver
 * 知道如何实施与执行一个请求相关的操作。
 * 任何类都可能作为一个接收者。
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
