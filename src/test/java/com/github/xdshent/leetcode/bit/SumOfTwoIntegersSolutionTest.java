package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOfTwoIntegersSolutionTest {

    private SumOfTwoIntegersSolution sumOfTwoIntegersSolution;

    @Before
    public void setUp() throws Exception {
        sumOfTwoIntegersSolution = new SumOfTwoIntegersSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSum() {
        int a = 1;
        int b = 2;
        int sum = sumOfTwoIntegersSolution.getSum(a, b);
        int expected = 3;
        Assert.assertEquals(expected, sum);

        a = 0;
        b = 2;
        sum = sumOfTwoIntegersSolution.getSum(a, b);
        expected = 2;
        Assert.assertEquals(expected, sum);

        a = -1;
        b = 0;
        sum = sumOfTwoIntegersSolution.getSum(a, b);
        expected = -1;
        Assert.assertEquals(expected, sum);

        a = -1;
        b = 2;
        sum = sumOfTwoIntegersSolution.getSum(a, b);
        expected = 1;
        Assert.assertEquals(expected, sum);

        a = -1;
        b = 3;
        sum = sumOfTwoIntegersSolution.getSum(a, b);
        expected = 2;
        Assert.assertEquals(expected, sum);
    }
}