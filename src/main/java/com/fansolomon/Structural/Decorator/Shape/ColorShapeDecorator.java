package com.fansolomon.Structural.Decorator.Shape;

public class ColorShapeDecorator extends ShapeDecorator {

    private String color;

    public ColorShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColor(color);
    }

    private void setColor(String color) {
        System.out.println("color set: " + color);
    }
}
