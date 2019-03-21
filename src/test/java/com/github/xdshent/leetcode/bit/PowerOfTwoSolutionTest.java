package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoSolutionTest {

    private PowerOfTwoSolution powerOfTwoSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        powerOfTwoSolution = new PowerOfTwoSolution();
        n = 0;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPowerOfTwo() {
        boolean result = powerOfTwoSolution.isPowerOfTwo(n);
        Assert.assertFalse(result);

        n = Integer.MAX_VALUE;
        result = powerOfTwoSolution.isPowerOfTwo(n);
        Assert.assertFalse(result);

        n = 16;
        result = powerOfTwoSolution.isPowerOfTwo(n);
        Assert.assertTrue(result);

        n = 15;
        result = powerOfTwoSolution.isPowerOfTwo(n);
        Assert.assertFalse(result);
    }
}