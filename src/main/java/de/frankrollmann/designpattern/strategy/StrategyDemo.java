package de.frankrollmann.designpattern.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new AddOperationStrategy());
        System.out.println(String.format("10 + 5 = %s",context.executeStrategy(10,5)));

        context = new StrategyContext(new SubOperationStrategy());
        System.out.println(String.format("10 - 5 = %s",context.executeStrategy(10,5)));

        context = new StrategyContext(new MultiplyOperationStrategy());
        System.out.println(String.format("10 * 5 = %s",context.executeStrategy(10,5)));

        context = new StrategyContext(new DivisionOperationStrategy());
        System.out.println(String.format("10 * 5 = %s",context.executeStrategy(10,5)));
    }
}
