package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOfThreeSolutionTest {

    private PowerOfThreeSolution powerOfThreeSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        powerOfThreeSolution = new PowerOfThreeSolution();
        n = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPowerOfThree() {
        boolean result = powerOfThreeSolution.isPowerOfThree(n);
        Assert.assertTrue(result);

        n = 45;
        result = powerOfThreeSolution.isPowerOfThree(n);
        Assert.assertFalse(result);

        n = 121;
        result = powerOfThreeSolution.isPowerOfThree(n);
        Assert.assertFalse(result);

        n = 9;
        result = powerOfThreeSolution.isPowerOfThree(n);
        Assert.assertTrue(result);

        n = 0;
        result = powerOfThreeSolution.isPowerOfThree(n);
        Assert.assertFalse(result);
    }
}