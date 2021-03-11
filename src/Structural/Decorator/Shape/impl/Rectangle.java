package Structural.Decorator.Shape.impl;

import Structural.Decorator.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw...");
    }
}
