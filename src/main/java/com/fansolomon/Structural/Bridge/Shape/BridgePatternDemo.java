package com.fansolomon.Structural.Bridge.Shape;

import com.fansolomon.Structural.Bridge.Shape.impl.DrawGreen;
import com.fansolomon.Structural.Bridge.Shape.impl.DrawRed;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle("hello", new DrawRed());
        Shape greenCircle = new Circle("hi", new DrawGreen());

        redCircle.draw();
        greenCircle.draw();
    }
}
