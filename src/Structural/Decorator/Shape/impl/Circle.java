package Structural.Decorator.Shape.impl;

import Structural.Decorator.Shape.Shape;

/**
 * ConcreteComponent
 * 定义一个对象（可以给这个对象动态地添加职责）
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw...");
    }
}
