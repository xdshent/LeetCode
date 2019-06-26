package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysSolutionTest {

    private MedianOfTwoSortedArraysSolution medianOfTwoSortedArraysSolution;
    private int[] nums1;
    private int[] nums2;

    @Before
    public void setUp() throws Exception {
        medianOfTwoSortedArraysSolution = new MedianOfTwoSortedArraysSolution();
        nums1 = new int[]{1, 3};
        nums2 = new int[]{2};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findMedianSortedArrays() {
        double result = medianOfTwoSortedArraysSolution.findMedianSortedArrays(nums1, nums2);
        double expected = 2;
        Assert.assertEquals(expected, result, 0.2);

        nums1 = new int[]{1, 3};
        nums2 = new int[]{2, 4};
        result = medianOfTwoSortedArraysSolution.findMedianSortedArrays(nums1, nums2);
        expected = 2.5;
        Assert.assertEquals(expected, result, 0.2);

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4, 5, 6, 7};
        result = medianOfTwoSortedArraysSolution.findMedianSortedArrays(nums1, nums2);
        expected = 4;
        Assert.assertEquals(expected, result, 0.2);

        nums1 = new int[]{3, 4, 5, 6, 7};
        nums2 = new int[]{1, 2};
        result = medianOfTwoSortedArraysSolution.findMedianSortedArrays(nums1, nums2);
        expected = 4;
        Assert.assertEquals(expected, result, 0.2);
    }
}