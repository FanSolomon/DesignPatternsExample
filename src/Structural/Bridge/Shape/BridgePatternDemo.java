package Structural.Bridge.Shape;

import Structural.Bridge.Shape.impl.DrawGreen;
import Structural.Bridge.Shape.impl.DrawRed;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle("hello", new DrawRed());
        Shape greenCircle = new Circle("hi", new DrawGreen());

        redCircle.draw();
        greenCircle.draw();
    }
}
