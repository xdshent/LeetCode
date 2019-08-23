package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProductOfThreeNumbersSolutionTest {

    private MaximumProductOfThreeNumbersSolution maximumProductOfThreeNumbersSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        maximumProductOfThreeNumbersSolution = new MaximumProductOfThreeNumbersSolution();
        nums = new int[]{1, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maximumProduct() {
        int result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        int expected = 6;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2, 3, 4};
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 24;
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 4, 3, 2, 1};
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 60;
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 4, 3, 2, 1, -5, -6};
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 150;
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 3, -5, 5, 2, 1, -6};
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 150;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = null;
        result = maximumProductOfThreeNumbersSolution.maximumProduct(nums);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}