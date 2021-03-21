package com.fansolomon.Behavioral.Command.Order;

import com.fansolomon.Behavioral.Command.Order.impl.Broker;
import com.fansolomon.Behavioral.Command.Order.impl.BuyStock;
import com.fansolomon.Behavioral.Command.Order.impl.SellStock;

/**
 * Command模式
 * 支持撤销操作、记录请求日志、对请求排队等
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.execute();
    }
}
