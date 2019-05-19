package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysSecondSolutionTest {

    private IntersectionOfTwoArraysSecondSolution intersectionOfTwoArraysSecondSolution;
    private int[] nums1;
    private int[] nums2;

    @Before
    public void setUp() throws Exception {
        intersectionOfTwoArraysSecondSolution = new IntersectionOfTwoArraysSecondSolution();
        nums1 = new int[]{1, 2, 2, 3, 4};
        nums2 = new int[]{2, 2, 3, 5};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void intersect() {
        int[] result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        int[] expected = new int[]{2, 2, 3};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{2, 3, 4};
        nums2 = new int[]{0, 3, 4, 2, 5};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{2, 3, 4};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{9, 4, 9, 8, 4};
        nums2 = new int[]{4, 9, 5};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{4, 9};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{3, 2, 1};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{};
        nums2 = new int[]{0, 3, 4, 2, 5};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{1, 2, 2, 3, 4};
        nums2 = new int[]{};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = null;
        nums2 = new int[]{1, 2, 3};
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        nums1 = new int[]{1, 2, 2, 3, 4};
        nums2 = null;
        result = intersectionOfTwoArraysSecondSolution.intersect(nums1, nums2);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);
    }
}