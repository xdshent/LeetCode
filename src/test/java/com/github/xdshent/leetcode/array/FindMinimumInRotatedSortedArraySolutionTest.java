package com.github.xdshent.leetcode.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xdshen
 */
public class FindMinimumInRotatedSortedArraySolutionTest {

    private int[] array;

    private FindMinimumInRotatedSortedArraySolution findMinimumInRotatedSortedArraySolution;

    @Before
    public void setUp() throws Exception {
        findMinimumInRotatedSortedArraySolution = new FindMinimumInRotatedSortedArraySolution();
        array = new int[]{3, 4, 5, 6, 1, 2, 3};
    }

    @Test
    public void findMin() {
        int result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(1, result);

        array = null;
        result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(-1, result);

        array = new int[0];
        result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(-1, result);

        array = new int[]{1};
        result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(1, result);

        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(1, result);

        array = new int[]{2, 3, 4, 5, 6, 7, 8, 1};
        result = findMinimumInRotatedSortedArraySolution.findMin(array);
        Assert.assertEquals(1, result);
    }
}