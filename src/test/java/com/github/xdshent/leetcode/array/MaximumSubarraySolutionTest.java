package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumSubarraySolutionTest {

    private MaximumSubarraySolution maximumSubarraySolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        maximumSubarraySolution = new MaximumSubarraySolution();
        array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxSubArray() {
        int result = maximumSubarraySolution.maxSubArray(array);
        int expected = 6;
        Assert.assertEquals(expected, result);

        array = new int[]{-2, 1, -3, 4, -5, 2, 1, 5, 4};
        expected = 12;
        result = maximumSubarraySolution.maxSubArray(array);
        Assert.assertEquals(expected, result);

        array = new int[]{-2, -1, 3, 4, -5, 2, 1, -5, 4};
        expected = 7;
        result = maximumSubarraySolution.maxSubArray(array);
        Assert.assertEquals(expected, result);
    }
}