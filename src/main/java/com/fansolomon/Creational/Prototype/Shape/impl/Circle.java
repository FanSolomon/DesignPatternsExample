package com.fansolomon.Creational.Prototype.Shape.impl;

import com.fansolomon.Creational.Prototype.Shape.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
