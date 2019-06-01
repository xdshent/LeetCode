package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AddToArrayFromOfIntegerSolutionTest {

    private AddToArrayFromOfIntegerSolution addToArrayFromOfIntegerSolution;
    private int[] nums;
    private int x;

    @Before
    public void setUp() throws Exception {
        addToArrayFromOfIntegerSolution = new AddToArrayFromOfIntegerSolution();
        nums = new int[]{1, 2, 0, 0};
        x = 34;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addToArrayForm() {
        List<Integer> result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        Integer[] expected = new Integer[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{2, 7, 4};
        x = 181;
        result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        expected = new Integer[]{4, 5, 5};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{2, 1, 5};
        x = 806;
        result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        expected = new Integer[]{1, 0, 2, 1};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        x = 1;
        result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        expected = new Integer[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{};
        x = 1;
        result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        expected = new Integer[]{1};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = null;
        x = 1;
        result = addToArrayFromOfIntegerSolution.addToArrayForm(nums, x);
        expected = new Integer[]{1};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}