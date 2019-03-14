package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerSolutionTest {

    private int x;
    private ReverseIntegerSolution reverseIntegerSolution;

    @Before
    public void setUp() throws Exception {
        x = Integer.MAX_VALUE;
        reverseIntegerSolution = new ReverseIntegerSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        int result = reverseIntegerSolution.reverse(x);
        int expected = 0;
        Assert.assertEquals(expected, result);


        x = Integer.MIN_VALUE;
        result = reverseIntegerSolution.reverse(x);
        expected = 0;
        Assert.assertEquals(expected, result);

        x = 123;
        result = reverseIntegerSolution.reverse(x);
        expected = 321;
        Assert.assertEquals(expected, result);
    }
}