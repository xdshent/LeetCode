package com.github.xdshent.leetcode.dp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClimbingStairsSolutionTest {

    private ClimbingStairsSolution climbingStairsSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        climbingStairsSolution = new ClimbingStairsSolution();
        n = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void climbStairs() {
        int result = climbingStairsSolution.climbStairs(n);
        int expected = 3;
        Assert.assertEquals(expected, result);

        n = 1;
        result = climbingStairsSolution.climbStairs(n);
        expected = 1;
        Assert.assertEquals(expected, result);

        n = 5;
        result = climbingStairsSolution.climbStairs(n);
        expected = 8;
        Assert.assertEquals(expected, result);
    }
}