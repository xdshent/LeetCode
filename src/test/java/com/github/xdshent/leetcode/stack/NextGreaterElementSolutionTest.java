package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author xdshen
 */
public class NextGreaterElementSolutionTest {

    private NextGreaterElementSolution nextGreaterElementSolution;
    private int[] nums1;
    private int[] nums2;

    @Before
    public void setUp() throws Exception {
        nextGreaterElementSolution = new NextGreaterElementSolution();
        nums1 = new int[]{4, 1, 2};
        nums2 = new int[]{1, 3, 4, 2};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nextGreaterElementFirst() {
        int[] result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        int[] expected = new int[]{-1, 3, -1};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        expected = new int[]{3, -1};
        assertArrayEquals(expected, result);

        nums1 = new int[]{};
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = null;
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = new int[]{};
        result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = null;
        result = nextGreaterElementSolution.nextGreaterElementFirst(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    public void nextGreaterElementSecond() {
        int[] result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        int[] expected = new int[]{-1, 3, -1};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        expected = new int[]{3, -1};
        assertArrayEquals(expected, result);

        nums1 = new int[]{};
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = null;
        nums2 = new int[]{1, 2, 3, 4};
        result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = new int[]{};
        result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);

        nums1 = new int[]{2, 4};
        nums2 = null;
        result = nextGreaterElementSolution.nextGreaterElementSecond(nums1, nums2);
        expected = new int[]{};
        assertArrayEquals(expected, result);
    }
}