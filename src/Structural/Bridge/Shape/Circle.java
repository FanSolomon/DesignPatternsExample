package Structural.Bridge.Shape;

/**
 * RefinedAbstraction
 * 扩充由Abstraction定义的接口
 */
public class Circle extends Shape {
    private String content;

    public Circle(String content, DrawAPI drawAPI) {
        super(drawAPI);
        this.content = content;
    }

    public void draw() {
        drawAPI.drawColor(content);
    }
}
