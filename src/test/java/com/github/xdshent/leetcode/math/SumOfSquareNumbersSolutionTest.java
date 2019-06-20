package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOfSquareNumbersSolutionTest {

    private SumOfSquareNumbersSolution sumOfSquareNumbersSolution;
    private int c;

    @Before
    public void setUp() throws Exception {
        sumOfSquareNumbersSolution = new SumOfSquareNumbersSolution();
        c = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void judgeSquareSum() {
        boolean result = sumOfSquareNumbersSolution.judgeSquareSum(c);
        Assert.assertTrue(result);

        c = 10;
        result = sumOfSquareNumbersSolution.judgeSquareSum(c);
        Assert.assertTrue(result);

        c = 11;
        result = sumOfSquareNumbersSolution.judgeSquareSum(c);
        Assert.assertFalse(result);

        c = -1;
        result = sumOfSquareNumbersSolution.judgeSquareSum(c);
        Assert.assertFalse(result);
    }
}