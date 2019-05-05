package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortestUnsortedSubarraySolutionTest {

    private ShortestUnsortedSubarraySolution shortestUnsortedSubarraySolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        shortestUnsortedSubarraySolution = new ShortestUnsortedSubarraySolution();
        nums = new int[]{2, 6, 4, 8, 10, 9, 15};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findUnsortedSubarrayFirst() {
        int result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        int expected = 5;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 8, 6, 5, 4};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{8, 2, 8, 6, 5, 1};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        expected = 6;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 1, 1, 1};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{3};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = null;
        result = shortestUnsortedSubarraySolution.findUnsortedSubarrayFirst(nums);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void findUnsortedSubarraySecond() {
        int result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        int expected = 5;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 8, 6, 5, 4};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{8, 2, 8, 6, 5, 1};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 6;
        Assert.assertEquals(expected, result);

        nums = new int[]{2, 1, 3, 4, 5, 6, 7, 8};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 1, 1, 1};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 3, 2, 1};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{3};
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = null;
        result = shortestUnsortedSubarraySolution.findUnsortedSubarraySecond(nums);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}