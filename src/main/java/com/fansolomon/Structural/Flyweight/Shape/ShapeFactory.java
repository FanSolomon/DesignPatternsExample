package com.fansolomon.Structural.Flyweight.Shape;

import java.util.HashMap;

/**
 * FlyweightFactory
 * 创建并管理flyweight对象
 * 当flyweight数量非常多且占用空间较大时，可以考虑进行回收
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        System.out.println("current map size " + circleMap.size());
        return circle;
    }
}
