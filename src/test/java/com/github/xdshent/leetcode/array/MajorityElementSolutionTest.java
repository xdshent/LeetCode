package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MajorityElementSolutionTest {

    private MajorityElementSolution majorityElementSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        majorityElementSolution = new MajorityElementSolution();
        nums = new int[]{3, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void majorityElement() {
        int result = majorityElementSolution.majorityElement(nums);
        int expected = 3;
        Assert.assertEquals(expected, result);

        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        result = majorityElementSolution.majorityElement(nums);
        expected = 2;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = majorityElementSolution.majorityElement(nums);
        expected = -1;
        Assert.assertEquals(expected, result);

        nums = null;
        result = majorityElementSolution.majorityElement(nums);
        expected = -1;
        Assert.assertEquals(expected, result);
    }
}