package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPeakElementSolutionTest {

    private FindPeakElementSolution findPeakElementSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        findPeakElementSolution = new FindPeakElementSolution();
        nums = new int[]{1, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findPeakElementFirst() {
        int result = findPeakElementSolution.findPeakElementFirst(nums);
        int expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 3, 1};
        result = findPeakElementSolution.findPeakElementFirst(nums);
        expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        result = findPeakElementSolution.findPeakElementFirst(nums);
        expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        result = findPeakElementSolution.findPeakElementFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = findPeakElementSolution.findPeakElementFirst(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = findPeakElementSolution.findPeakElementFirst(nums);
        expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void findPeakElementSecond() {
        int result = findPeakElementSolution.findPeakElementSecond(nums);
        int expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 3, 1};
        result = findPeakElementSolution.findPeakElementSecond(nums);
        expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        result = findPeakElementSolution.findPeakElementSecond(nums);
        expected = 5;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        result = findPeakElementSolution.findPeakElementSecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = findPeakElementSolution.findPeakElementSecond(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = findPeakElementSolution.findPeakElementSecond(nums);
        expected = -1;
        Assert.assertEquals(expected, result);
    }
}