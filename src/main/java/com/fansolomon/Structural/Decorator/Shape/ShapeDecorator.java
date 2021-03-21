package com.fansolomon.Structural.Decorator.Shape;

/**
 * Decorator
 * 维持一个指向Component对象的引用，并定义与Component接口一致的接口
 */
public abstract class ShapeDecorator implements Shape {
    // 这里维护一个指向Component对象的引用
    protected Shape decoratedShape;

    // component实例变量在构造方法中初始化
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    // 与Component接口一致的接口，这是一个省略的实现，将请求转发给component实例
    public void draw(){
        decoratedShape.draw();
    }
}
