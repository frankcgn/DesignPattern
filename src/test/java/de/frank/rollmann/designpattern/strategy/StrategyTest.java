package de.frank.rollmann.designpattern.strategy;

import de.frankrollmann.designpattern.strategy.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StrategyTest {

    public StrategyTest() {

    }

    @BeforeClass
    void init() {

    }


    @Test(description = "Test addOperation-Strategy")
    public void testAddStrategy() {
        StrategyContext context = new StrategyContext(new AddOperationStrategy());
        int num1 = 10;
        int num2 = 5;
        int resultExpected = 10+5;
        int result = context.executeStrategy(10,5);
        System.out.println(String.format("10 + 5 = %s",result));
        Assert.assertEquals(result, resultExpected);
    }

    @Test(description = "Test subOperation-Strategy")
    public void testSubStrategy() {
        StrategyContext context = new StrategyContext(new SubOperationStrategy());
        int num1 = 10;
        int num2 = 5;
        int resultExpected = 10-5;
        int result = context.executeStrategy(10,5);
        System.out.println(String.format("10 - 5 = %s",result));
        Assert.assertEquals(result, resultExpected);
    }

    @Test(description = "Test multiplyOperation-Strategy")
    public void testMultiplyStrategy() {
        StrategyContext context = new StrategyContext(new MultiplyOperationStrategy());
        int num1 = 10;
        int num2 = 5;
        int resultExpected = 10*5;
        int result = context.executeStrategy(10,5);
        System.out.println(String.format("10 * 5 = %s",result));
        Assert.assertEquals(result, resultExpected);
    }

    @Test(description = "Test divisionOperation-Strategy")
    public void testDivisionStrategy() {
        StrategyContext context = new StrategyContext(new DivisionOperationStrategy());
        int num1 = 10;
        int num2 = 5;
        int resultExpected = 10/5;
        int result = context.executeStrategy(10,5);
        System.out.println(String.format("10 / 5 = %s",result));
        Assert.assertEquals(result, resultExpected);
    }
}
