package de.frankrollmann.designpattern.strategy;

public class MultiplyOperationStrategy implements IStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
