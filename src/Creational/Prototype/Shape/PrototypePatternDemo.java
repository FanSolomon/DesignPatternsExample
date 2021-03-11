package Creational.Prototype.Shape;

/**
 * Java内部自带原型模式 Object.clone()
 * 实现原型模式需要实现标记型接口Cloneable(标记型接口：其中没有需要实现的方法)
 * 一般会重写clone方法
 * 一般用于一个对象的属性已经确定，需要产生很多相同对象的时候
 * 需要区分深拷贝与浅拷贝
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape4 = ShapeCache.getShape("1");
        System.out.println(clonedShape == clonedShape4);

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
