package com.fansolomon.Structural.Facade.Shape.impl;

import com.fansolomon.Structural.Facade.Shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
