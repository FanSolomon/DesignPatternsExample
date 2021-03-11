package Structural.Bridge.Shape;

/**
 * Implementor
 * 定义实现类的接口，该接口不一定要与Abstraction的接口完全一致，
 * 事实上这两个接口可以完全不同。
 * 一般来讲，这里只提供基本操作，而Abstraction则定义基于这些基本操作的较高层次的操作
 */
public interface DrawAPI {
    void drawColor(String content);
}
