package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiffPairsInAnArraySolutionTest {

    private DiffPairsInAnArraySolution diffPairsInAnArraySolution;
    private int[] nums;
    private int k;

    @Before
    public void setUp() throws Exception {
        diffPairsInAnArraySolution = new DiffPairsInAnArraySolution();
        nums = new int[]{3, 1, 4, 1, 5};
        k = 2;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findPairsFirst() {
        int result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        int expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 3, 4, 5};
        k = 1;
        result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 3, 1, 5, 4};
        k = 0;
        result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = null;
        k = 0;
        result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        k = 0;
        result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 3, 1, 5, 4};
        k = -1;
        result = diffPairsInAnArraySolution.findPairsFirst(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void findPairsSecond() {
        int result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        int expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 3, 4, 5};
        k = 1;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 3, 1, 5, 4};
        k = 0;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 1, 1, 1};
        k = 0;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = null;
        k = 0;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        k = 0;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 3, 1, 5, 4};
        k = -1;
        result = diffPairsInAnArraySolution.findPairsSecond(nums, k);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}