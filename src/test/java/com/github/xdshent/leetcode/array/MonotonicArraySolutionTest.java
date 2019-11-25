package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonotonicArraySolutionTest {

    private MonotonicArraySolution monotonicArraySolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        monotonicArraySolution = new MonotonicArraySolution();
        nums = new int[]{};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isMonotonic() {
        boolean result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertTrue(result);

        nums = new int[]{1, 2};
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertTrue(result);

        nums = null;
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertTrue(result);

        nums = new int[]{1, 2, 3, 4, 5};
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertTrue(result);

        nums = new int[]{1, 2, 3, 1, 4, 5};
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertFalse(result);

        nums = new int[]{5, 4, 3, 2, 1};
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertTrue(result);

        nums = new int[]{5, 4, 3, 1, 2, 1};
        result = monotonicArraySolution.isMonotonic(nums);
        Assert.assertFalse(result);
    }
}