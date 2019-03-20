package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortedArraySolutionTest {

    private MergeSortedArraySolution mergeSortedArray;
    private int[] nums1;
    private int[] nums2;
    private int m;
    private int n;

    @Before
    public void setUp() throws Exception {
        mergeSortedArray = new MergeSortedArraySolution();
        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        nums2 = new int[]{2, 5, 6};
        m = 3;
        n = 3;
    }

    @After
    public void tearDown() throws Exception {
        nums1 = null;
        nums2 = null;
    }

    @Test
    public void merge() {
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expected, nums1);

        nums1 = new int[]{1, 2, 6, 0, 0, 0, 0, 0};
        nums2 = new int[]{3, 7, 9, 10, 11};
        m = 3;
        n = 5;
        expected = new int[]{1, 2, 3, 6, 7, 9, 10, 11};
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);

        nums1 = new int[]{5, 7, 8, 9, 0, 0, 0};
        nums2 = new int[]{3, 4, 8};
        m = 4;
        n = 3;
        expected = new int[]{3, 4, 5, 7, 8, 8, 9};
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);

        nums2 = null;
        mergeSortedArray.merge(nums1, m, nums2, n);
        expected = nums1;
        Assert.assertArrayEquals(expected, nums1);

        nums2 = new int[]{};
        mergeSortedArray.merge(nums1, m, nums2, n);
        expected = nums1;
        Assert.assertArrayEquals(expected, nums1);
    }
}