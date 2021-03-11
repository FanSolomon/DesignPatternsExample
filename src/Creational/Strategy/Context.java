package Creational.Strategy;

/**
 * 上下文
 * 维护一个Strategy对象
 * 可定义一个接口来让Strategy访问它的数据
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
