package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidPerfectSquareSolutionTest {

    private ValidPerfectSquareSolution validPerfectSquareSolution;
    private int num;

    @Before
    public void setUp() throws Exception {
        validPerfectSquareSolution = new ValidPerfectSquareSolution();
        num = 9;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPerfectSquare() {
        boolean result = validPerfectSquareSolution.isPerfectSquare(num);
        Assert.assertTrue(result);

        num = 8;
        result = validPerfectSquareSolution.isPerfectSquare(num);
        Assert.assertFalse(result);

        num = 18;
        result = validPerfectSquareSolution.isPerfectSquare(num);
        Assert.assertFalse(result);

        num = 16;
        result = validPerfectSquareSolution.isPerfectSquare(num);
        Assert.assertTrue(result);

        num = 64;
        result = validPerfectSquareSolution.isPerfectSquare(num);
        Assert.assertTrue(result);
    }
}