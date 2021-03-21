package com.fansolomon.Behavioral.Command.Order.impl;

import com.fansolomon.Behavioral.Command.Order.Order;
import com.fansolomon.Behavioral.Command.Order.Stock;

/**
 * ConcreteCommand
 * 将一个接收者对象绑定于一个动作
 * 调用接收者相应操作来实现execute
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
