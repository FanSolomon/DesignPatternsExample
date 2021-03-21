package com.fansolomon.Structural.Flyweight.Shape;

/**
 * ConcreteFlyweight
 * 实现Flyweight接口，并为内部状态增加存储空间
 */
public class Circle implements Shape {
    // 这里color姑且算为内部状态（但其实不应该允许外部来改变） 其他都是外部状态
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
