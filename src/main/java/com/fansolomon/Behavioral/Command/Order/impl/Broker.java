package com.fansolomon.Behavioral.Command.Order.impl;

import com.fansolomon.Behavioral.Command.Order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理一个子命令序列
 */
public class Broker implements Order {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    @Override
    public void execute(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
