package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindAllNumbersDisappearedSolutionTest {

    private FindAllNumbersDisappearedSolution findAllNumbersDisappearedSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        findAllNumbersDisappearedSolution = new FindAllNumbersDisappearedSolution();
        nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findDisappearedNumbersFirst() {
        List<Integer> result = findAllNumbersDisappearedSolution.findDisappearedNumbersFirst(nums);
        Integer[] expected = new Integer[]{5, 6};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{3, 4, 3, 4, 5, 6, 7};
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersFirst(nums);
        expected = new Integer[]{1, 2};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{1};
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersFirst(nums);
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = null;
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersFirst(nums);
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }

    @Test
    public void findDisappearedNumbersSecond() {
        List<Integer> result = findAllNumbersDisappearedSolution.findDisappearedNumbersSecond(nums);
        Integer[] expected = new Integer[]{5, 6};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{3, 4, 3, 4, 5, 6, 7};
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersSecond(nums);
        expected = new Integer[]{1, 2};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = new int[]{1};
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersSecond(nums);
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        nums = null;
        result = findAllNumbersDisappearedSolution.findDisappearedNumbersSecond(nums);
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}