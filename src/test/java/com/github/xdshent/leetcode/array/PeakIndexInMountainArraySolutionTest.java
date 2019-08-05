package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeakIndexInMountainArraySolutionTest {

    private PeakIndexInMountainArraySolution peakIndexInMountainArraySolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        peakIndexInMountainArraySolution = new PeakIndexInMountainArraySolution();
        nums = new int[]{0, 1, 0};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void peakIndexInMountainArray() {
        int result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        int expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 2, 1, 0};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 2, 2, 1, 0};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 5, 4, 3, 2, 1};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 1, 2, 3, 5, 4};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 1, 2, 3, 4, 5};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = peakIndexInMountainArraySolution.peakIndexInMountainArray(nums);
        expected = -1;
        Assert.assertEquals(expected, result);
    }
}