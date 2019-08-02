package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindFirstAndLastPositionOfElementInSortedArraySolutionTest {

    private FindFirstAndLastPositionOfElementInSortedArraySolution findFirstAndLastPositionOfElementInSortedArraySolution;
    private int[] nums;
    private int target;

    @Before
    public void setUp() throws Exception {
        findFirstAndLastPositionOfElementInSortedArraySolution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        nums = new int[]{1, 2, 2, 2, 3, 4, 5};
        target = 2;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchRange() {
        int[] result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        int[] expected = new int[]{1, 3};
        Assert.assertArrayEquals(expected, result);

        target = 1;
        nums = new int[]{1};
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{0, 0};
        Assert.assertArrayEquals(expected, result);

        target = 1;
        nums = new int[]{1, 1, 1, 1, 1, 1};
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{0, 5};
        Assert.assertArrayEquals(expected, result);

        target = 2;
        nums = new int[]{1, 2, 3, 4, 5, 6};
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{1, 1};
        Assert.assertArrayEquals(expected, result);

        target = 9;
        nums = new int[]{5, 7, 7, 8, 8, 10};
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{-1, -1};
        Assert.assertArrayEquals(expected, result);

        target = 1;
        nums = new int[]{};
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{-1, -1};
        Assert.assertArrayEquals(expected, result);

        target = 1;
        nums = null;
        result = findFirstAndLastPositionOfElementInSortedArraySolution.searchRange(nums, target);
        expected = new int[]{-1, -1};
        Assert.assertArrayEquals(expected, result);
    }
}