package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumSolutionTest {

    private int[] array;

    @Before
    public void setUp() throws Exception {
        array = new int[]{2, 7, 11, 15};
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void twoSum() {
        int target = 9;
        int[] result = TwoSumSolution.twoSum(array, target);
        Assert.assertTrue(result.length > 0);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, result);

        target = 20;
        result = TwoSumSolution.twoSum(array, target);
        Assert.assertTrue(result.length == 0);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{};
        result = TwoSumSolution.twoSum(array, target);
        Assert.assertTrue(result.length == 0);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);
    }
}