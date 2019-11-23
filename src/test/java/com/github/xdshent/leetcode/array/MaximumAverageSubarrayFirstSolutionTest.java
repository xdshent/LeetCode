package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumAverageSubarrayFirstSolutionTest {

    private MaximumAverageSubarrayFirstSolution maximumAverageSubarrayFirstSolution;
    private int[] nums;
    private int k;

    @Before
    public void setUp() throws Exception {
        maximumAverageSubarrayFirstSolution = new MaximumAverageSubarrayFirstSolution();
        nums = new int[]{1, 12, -5, -6, 50, 3};
        k = 4;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findMaxAverage() {
        double delta = 0.00001;

        double result = maximumAverageSubarrayFirstSolution.findMaxAverage(nums, k);
        double expected = 12.75;
        Assert.assertEquals(expected, result, delta);

        nums = new int[]{-1,-5,3,4,5,6,-6};
        expected = 4.5;
        result = maximumAverageSubarrayFirstSolution.findMaxAverage(nums, k);
        Assert.assertEquals(expected, result, delta);

        nums = new int[]{};
        expected = 0.0;
        result = maximumAverageSubarrayFirstSolution.findMaxAverage(nums, k);
        Assert.assertEquals(expected, result, delta);

        nums = null;
        expected = 0.0;
        result = maximumAverageSubarrayFirstSolution.findMaxAverage(nums, k);
        Assert.assertEquals(expected, result, delta);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        k = 0;
        expected = 0.0;
        result = maximumAverageSubarrayFirstSolution.findMaxAverage(nums, k);
        Assert.assertEquals(expected, result, delta);
    }
}