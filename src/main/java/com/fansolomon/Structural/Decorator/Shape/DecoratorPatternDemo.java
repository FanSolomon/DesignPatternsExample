package com.fansolomon.Structural.Decorator.Shape;

import com.fansolomon.Structural.Decorator.Shape.impl.Circle;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // 既设置边框宽度又设置颜色（叠加使用）
        Shape shape = new BorderShapeDecorator(
                new ColorShapeDecorator(new Circle(), "orange"), 12);

        shape.draw();
    }
}
