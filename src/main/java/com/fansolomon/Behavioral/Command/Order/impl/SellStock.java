package com.fansolomon.Behavioral.Command.Order.impl;

import com.fansolomon.Behavioral.Command.Order.Order;
import com.fansolomon.Behavioral.Command.Order.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
