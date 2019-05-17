package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOfFourSolutionTest {

    private PowerOfFourSolution powerOfFourSolution;
    private int num;

    @Before
    public void setUp() throws Exception {
        powerOfFourSolution = new PowerOfFourSolution();
        num = 16;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPowerOfFour() {
        boolean result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertTrue(result);

        num = 32;
        result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertFalse(result);

        num = 64;
        result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertTrue(result);

        num = 8;
        result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertFalse(result);

        num = -1;
        result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertFalse(result);

        num = 3;
        result = powerOfFourSolution.isPowerOfFour(num);
        Assert.assertFalse(result);
    }
}