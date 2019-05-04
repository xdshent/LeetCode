package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPivotIndexSolutionTest {

    private FindPivotIndexSolution findPivotIndexSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        findPivotIndexSolution = new FindPivotIndexSolution();
        nums = new int[]{1, 7, 3, 6, 5, 6};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void pivotIndex() {
        int pivotIndex = findPivotIndexSolution.pivotIndex(nums);
        int expected = 3;
        Assert.assertEquals(expected, pivotIndex);

        nums = new int[]{1, 2, 3};
        pivotIndex = findPivotIndexSolution.pivotIndex(nums);
        expected = -1;
        Assert.assertEquals(expected, pivotIndex);

        nums = new int[]{1, 2, 3, 4};
        pivotIndex = findPivotIndexSolution.pivotIndex(nums);
        expected = -1;
        Assert.assertEquals(expected, pivotIndex);

        nums = new int[]{1, 2};
        pivotIndex = findPivotIndexSolution.pivotIndex(nums);
        expected = -1;
        Assert.assertEquals(expected, pivotIndex);

        nums = null;
        pivotIndex = findPivotIndexSolution.pivotIndex(nums);
        expected = -1;
        Assert.assertEquals(expected, pivotIndex);
    }
}