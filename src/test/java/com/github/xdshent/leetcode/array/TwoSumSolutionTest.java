package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumSolutionTest {

    private int[] array;
    private TwoSumSolution twoSumSolution;

    @Before
    public void setUp() throws Exception {
        array = new int[]{2, 7, 11, 15};
        twoSumSolution = new TwoSumSolution();
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void twoSum() {
        int target = 9;
        int[] result = twoSumSolution.twoSum(array, target);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, result);

        target = 20;
        result = twoSumSolution.twoSum(array, target);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{};
        target = 15;
        result = twoSumSolution.twoSum(array, target);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        target = 10;
        result = twoSumSolution.twoSum(null, target);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{5};
        target = 5;
        result = twoSumSolution.twoSum(array, target);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);
    }
}