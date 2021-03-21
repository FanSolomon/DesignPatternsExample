package com.fansolomon.Structural.Decorator.Shape;

/**
 * ConcreteDecorator
 * 向组件添加职责
 */
public class BorderShapeDecorator extends ShapeDecorator {

    private int width;

    public BorderShapeDecorator(Shape decoratedShape, int width) {
        super(decoratedShape);
        this.width = width;
    }

    // 重定义draw方法
    @Override
    public void draw() {
        decoratedShape.draw();
        // 定义了特殊的装饰功能
        setBorder(width);
    }

    private void setBorder(int width) {
        System.out.println("Border set width: " + width);
    }
}
