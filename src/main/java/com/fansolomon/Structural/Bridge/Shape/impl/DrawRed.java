package com.fansolomon.Structural.Bridge.Shape.impl;

import com.fansolomon.Structural.Bridge.Shape.DrawAPI;

public class DrawRed implements DrawAPI {
    @Override
    public void drawColor(String content) {
        System.out.println("Drawing Circle[ color: red, content: "
                + content +"]");
    }
}
