package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInRotatedSortedArraySolutionTest {

    private SearchInRotatedSortedArraySolution searchInRotatedSortedArraySolution;
    private int[] nums;
    private int target;

    @Before
    public void setUp() throws Exception {
        searchInRotatedSortedArraySolution = new SearchInRotatedSortedArraySolution();
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 0;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void search() {
        int expected = 4;
        int result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = -1;
        target = 3;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = 3;
        target = 7;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = 5;
        target = 1;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = 1;
        target = 5;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{1, 2};
        expected = 0;
        target = 1;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 6, 7, 0, 1, 2, 3, 4};
        expected = 2;
        target = 7;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        expected = 2;
        target = 6;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 6, 7, 0, 1, 2, 3, 4};
        expected = 4;
        target = 1;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{6, 7, 0, 1, 2, 3, 4, 5};
        expected = 2;
        target = 0;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);

        nums = new int[]{5, 6, 7, 0, 1, 2, 3, 4};
        expected = 7;
        target = 4;
        result = searchInRotatedSortedArraySolution.search(nums, target);
        Assert.assertEquals(expected, result);
    }
}