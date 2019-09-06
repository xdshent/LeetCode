package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterSolutionTest {

    private ContainerWithMostWaterSolution containerWithMostWaterSolution;
    private int[] height;

    @Before
    public void setUp() throws Exception {
        containerWithMostWaterSolution = new ContainerWithMostWaterSolution();
        height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxAreaFirst() {
        int result = containerWithMostWaterSolution.maxAreaFirst(height);
        int expected = 49;
        Assert.assertEquals(expected, result);

        height = null;
        result = containerWithMostWaterSolution.maxAreaFirst(height);
        expected = 0;
        Assert.assertEquals(expected, result);

        height = new int[]{};
        result = containerWithMostWaterSolution.maxAreaFirst(height);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxAreaSecond() {
        int result = containerWithMostWaterSolution.maxAreaSecond(height);
        int expected = 49;
        Assert.assertEquals(expected, result);

        height = null;
        result = containerWithMostWaterSolution.maxAreaSecond(height);
        expected = 0;
        Assert.assertEquals(expected, result);

        height = new int[]{};
        result = containerWithMostWaterSolution.maxAreaSecond(height);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}