package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonDecreasingArraySolutionTest {

    private NonDecreasingArraySolution nonDecreasingArraySolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        nonDecreasingArraySolution = new NonDecreasingArraySolution();
        nums = new int[]{4, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkPossibility() {
        boolean result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);

        nums = new int[]{4, 2, 1};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertFalse(result);

        nums = new int[]{0, 2, 3, 1, 0};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertFalse(result);

        nums = new int[]{0, 2, 3, 4, 0};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);

        nums = new int[]{0, 2, 3, 4, 5};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);

        nums = new int[]{0, 2, 5, 4, 5};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);

        nums = new int[]{4};
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);

        nums = null;
        result = nonDecreasingArraySolution.checkPossibility(nums);
        Assert.assertTrue(result);
    }
}