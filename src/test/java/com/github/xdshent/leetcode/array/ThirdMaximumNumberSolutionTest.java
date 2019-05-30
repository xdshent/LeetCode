package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThirdMaximumNumberSolutionTest {

    private ThirdMaximumNumberSolution thirdMaximumNumberSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        thirdMaximumNumberSolution = new ThirdMaximumNumberSolution();
        nums = new int[]{1, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void thirdMax() {
        int result = thirdMaximumNumberSolution.thirdMax(nums);
        int expected = 1;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 2, -2147483648};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = -2147483648;
        Assert.assertEquals(expected, result);

        nums = new int[]{0};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 4, 6, 8, 0, 2, 15, 13};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 8;
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 4};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 4;
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 4, 3};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 3;
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 4, 3};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 3;
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 5, 4, 4, 1};
        result = thirdMaximumNumberSolution.thirdMax(nums);
        expected = 1;
        Assert.assertEquals(expected, result);
    }
}