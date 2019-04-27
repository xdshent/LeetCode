package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UglyNumberSolutionTest {

    private UglyNumberSolution uglyNumberSolution;
    private int num;

    @Before
    public void setUp() throws Exception {
        uglyNumberSolution = new UglyNumberSolution();
        num = 6;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isUgly() {
        boolean result = uglyNumberSolution.isUgly(num);
        Assert.assertTrue(result);

        num = 1;
        result = uglyNumberSolution.isUgly(num);
        Assert.assertTrue(result);

        num = 14;
        result = uglyNumberSolution.isUgly(num);
        Assert.assertFalse(result);

        num = 32;
        result = uglyNumberSolution.isUgly(num);
        Assert.assertTrue(result);

        num = 0;
        result = uglyNumberSolution.isUgly(num);
        Assert.assertFalse(result);
    }
}