package com.fansolomon.Creational.Prototype.Shape.impl;

import com.fansolomon.Creational.Prototype.Shape.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
