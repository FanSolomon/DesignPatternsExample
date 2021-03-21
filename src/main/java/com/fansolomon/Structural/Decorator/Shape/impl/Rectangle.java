package com.fansolomon.Structural.Decorator.Shape.impl;

import com.fansolomon.Structural.Decorator.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw...");
    }
}
