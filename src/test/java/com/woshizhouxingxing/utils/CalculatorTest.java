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
    public void ss() {
        int ss = 034;
        System.out.println(ss);
//        Assert.assertTrue(poType.contains("D") || poType.contains("H") || poType.contains("T"));
    }
}
