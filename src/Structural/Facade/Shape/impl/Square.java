package Structural.Facade.Shape.impl;

import Structural.Facade.Shape.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
