package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTrailingZeroesSolutionTest {

    private FactorialTrailingZeroesSolution factorialTrailingZeroesSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        factorialTrailingZeroesSolution = new FactorialTrailingZeroesSolution();
        n = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void trailingZeroes() {
        int result = factorialTrailingZeroesSolution.trailingZeroes(n);
        int expected = 1;
        Assert.assertEquals(expected, result);

        n = 1;
        result = factorialTrailingZeroesSolution.trailingZeroes(n);
        expected = 0;
        Assert.assertEquals(expected, result);

        n = 10;
        result = factorialTrailingZeroesSolution.trailingZeroes(n);
        expected = 2;
        Assert.assertEquals(expected, result);

        n = 100;
        result = factorialTrailingZeroesSolution.trailingZeroes(n);
        expected = 24;
        Assert.assertEquals(expected, result);
    }
}