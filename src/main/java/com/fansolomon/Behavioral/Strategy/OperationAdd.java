package com.fansolomon.Behavioral.Strategy;

/**
 * 具体策略
 * 实现某种具体算法
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
