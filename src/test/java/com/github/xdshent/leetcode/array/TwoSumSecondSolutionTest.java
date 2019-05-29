package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumSecondSolutionTest {

    private TwoSumSecondSolution twoSumSecondSolution;
    private int[] numbers;
    private int target;

    @Before
    public void setUp() throws Exception {
        twoSumSecondSolution = new TwoSumSecondSolution();
        numbers = new int[]{2, 7, 11, 15};
        target = 9;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void twoSum() {
        int[] result = twoSumSecondSolution.twoSum(numbers, target);
        int[] expected = {1, 2};
        Assert.assertArrayEquals(expected, result);

        numbers = new int[0];
        target = 4;
        result = twoSumSecondSolution.twoSum(numbers, target);
        expected = new int[2];
        Assert.assertArrayEquals(expected, result);

        numbers = new int[]{1};
        target = 4;
        result = twoSumSecondSolution.twoSum(numbers, target);
        expected = new int[2];
        Assert.assertArrayEquals(expected, result);

        numbers = new int[]{1, 5, 7, 9, 12};
        target = 14;
        result = twoSumSecondSolution.twoSum(numbers, target);
        expected = new int[]{2, 4};
        Assert.assertArrayEquals(expected, result);

        numbers = new int[]{1, 5, 6, 10, 12};
        target = 14;
        result = twoSumSecondSolution.twoSum(numbers, target);
        expected = new int[2];
        Assert.assertArrayEquals(expected, result);

        numbers = null;
        target = 4;
        result = twoSumSecondSolution.twoSum(numbers, target);
        expected = new int[2];
        Assert.assertArrayEquals(expected, result);
    }
}