package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestHarmoniousSubsequenceSolutionTest {

    private LongestHarmoniousSubsequenceSolution longestHarmoniousSubsequenceSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        longestHarmoniousSubsequenceSolution = new LongestHarmoniousSubsequenceSolution();
        nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findLHSFirst() {
        int result = longestHarmoniousSubsequenceSolution.findLHSFirst(nums);
        int expected = 5;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        result = longestHarmoniousSubsequenceSolution.findLHSFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = null;
        result = longestHarmoniousSubsequenceSolution.findLHSFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void findLHSSecond() {
        int result = longestHarmoniousSubsequenceSolution.findLHSSecond(nums);
        int expected = 5;
        Assert.assertEquals(expected, result);

        nums = new int[]{1};
        result = longestHarmoniousSubsequenceSolution.findLHSSecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = null;
        result = longestHarmoniousSubsequenceSolution.findLHSSecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}