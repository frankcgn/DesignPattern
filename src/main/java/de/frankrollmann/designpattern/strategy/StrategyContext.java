package de.frankrollmann.designpattern.strategy;

public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
