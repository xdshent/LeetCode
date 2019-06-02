package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FixedPointSolutionTest {

    private FixedPointSolution fixedPointSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        fixedPointSolution = new FixedPointSolution();
        nums = new int[]{0, 1, 2, 3, 4};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fixedPointFirst() {
        int result = fixedPointSolution.fixedPointFirst(nums);
        int expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{-10, -5, 0, 3, 7};
        result = fixedPointSolution.fixedPointFirst(nums);
        expected = 3;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 2, 5, 8, 17};
        result = fixedPointSolution.fixedPointFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{-10, -5, 3, 4, 7, 9};
        result = fixedPointSolution.fixedPointFirst(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = fixedPointSolution.fixedPointFirst(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = fixedPointSolution.fixedPointFirst(nums);
        expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fixedPointSecond() {
        int result = fixedPointSolution.fixedPointSecond(nums);
        int expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{-10, -5, 0, 3, 7};
        result = fixedPointSolution.fixedPointSecond(nums);
        expected = 3;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 2, 5, 8, 17};
        result = fixedPointSolution.fixedPointSecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{-10, -5, 3, 4, 7, 9};
        result = fixedPointSolution.fixedPointSecond(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = fixedPointSolution.fixedPointSecond(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = fixedPointSolution.fixedPointSecond(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

    }
}