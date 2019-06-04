package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidMountainArraySolutionTest {

    private ValidMountainArraySolution validMountainArraySolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        validMountainArraySolution = new ValidMountainArraySolution();
        nums = new int[]{0, 3, 2, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void validMountainArray() {
        boolean result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertTrue(result);

        nums = new int[]{0, 1, 2, 3};
        result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertFalse(result);

        nums = new int[]{2, 1, 4, 3};
        result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertFalse(result);

        nums = new int[]{0, 4, 3, 5};
        result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertFalse(result);

        nums = null;
        result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertFalse(result);

        nums = new int[]{2, 3};
        result = validMountainArraySolution.validMountainArray(nums);
        Assert.assertFalse(result);
    }
}