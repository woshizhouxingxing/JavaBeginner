package com.woshizhouxingxing.utils;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 2);

        Assert.assertEquals(0, result);
    }

    @Test
    public void ss(){
        int n=Integer.parseInt("10011001",2);
        int m=Integer.parseInt("11000000",2);
        System.out.println(Integer.toBinaryString(8));
        Assert.assertEquals(Integer.toBinaryString(32), Integer.toBinaryString(n+m));
    }
}
