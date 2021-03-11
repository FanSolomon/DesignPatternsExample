package Structural.Bridge.Shape;

/**
 * Abstraction
 * 定义抽象类接口
 */
public abstract class Shape {
    // 维护一个对drawAPI的实例对象
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
