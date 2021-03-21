package com.fansolomon.Structural.Bridge.Shape.impl;

import com.fansolomon.Structural.Bridge.Shape.DrawAPI;

/**
 * ConcreteImplementor
 * 实现Implementor接口并定义它的具体实现
 */
public class DrawGreen implements DrawAPI {
    @Override
    public void drawColor(String content) {
        System.out.println("Drawing Circle[ color: green, content: "
                + content +"]");
    }
}
