package com.fansolomon.Structural.Facade.Shape.impl;

import com.fansolomon.Structural.Facade.Shape.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
