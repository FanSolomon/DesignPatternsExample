package Structural.Facade.Shape.impl;

import Structural.Facade.Shape.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
