package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtSolutionTest {

    private SqrtSolution sqrtSolution;

    @Before
    public void setUp() throws Exception {
        sqrtSolution = new SqrtSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mySqrt() {
        int result = sqrtSolution.mySqrt(-5);
        Assert.assertEquals(0, result);

        result = sqrtSolution.mySqrt(8);
        Assert.assertEquals(2, result);

        result = sqrtSolution.mySqrt(10);
        Assert.assertEquals(3, result);

        result = sqrtSolution.mySqrt(25);
        Assert.assertEquals(5, result);

        result = sqrtSolution.mySqrt(24);
        Assert.assertEquals(4, result);
    }
}