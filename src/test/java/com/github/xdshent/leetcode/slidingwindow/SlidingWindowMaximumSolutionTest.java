package com.github.xdshent.leetcode.slidingwindow;

import com.github.xdshent.leetcode.slidingwindow.SlidingWindowMaximumSolution;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlidingWindowMaximumSolutionTest {

    private int[] array;
    private SlidingWindowMaximumSolution slidingWindowMaximumSolution;
    private int k;

    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        k = 3;
        slidingWindowMaximumSolution = new SlidingWindowMaximumSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxSlidingWindow() {
        int[] result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        expected = new int[]{3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{7, 6, 5, 4, 3, 2, 1};
        result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        expected = new int[]{7, 6, 5, 4, 3};
        Assert.assertArrayEquals(expected, result);

        k = 10;
        result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        k = 3;
        array = new int[]{};
        result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        array = null;
        result = slidingWindowMaximumSolution.maxSlidingWindow(array, k);
        Assert.assertArrayEquals(expected, result);
    }
}