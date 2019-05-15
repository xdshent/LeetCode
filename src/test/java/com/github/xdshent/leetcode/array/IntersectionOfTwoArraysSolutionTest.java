package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysSolutionTest {

    private IntersectionOfTwoArraysSolution intersectionOfTwoArraysSolution;
    private int[] nums1;
    private int[] nums2;

    @Before
    public void setUp() throws Exception {
        intersectionOfTwoArraysSolution = new IntersectionOfTwoArraysSolution();
        nums1 = new int[]{1, 2, 2, 1};
        nums2 = new int[]{2, 2};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void intersectionFirst() {
        int[] result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        int[] expected = new int[]{2};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{1, 3, 4, 1};
        nums2 = new int[]{2, 4};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{4};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{1, 3, 4, 1};
        nums2 = new int[]{2, 4};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{4};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{4, 9};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{};
        nums2 = new int[]{9, 4, 9, 8, 4};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = null;
        nums2 = new int[]{4, 9, 5};
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{4, 9, 5};
        nums2 = null;
        result = intersectionOfTwoArraysSolution.intersection(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);
    }
}