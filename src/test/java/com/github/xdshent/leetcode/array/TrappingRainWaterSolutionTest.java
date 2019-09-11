package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrappingRainWaterSolutionTest {

    private TrappingRainWaterSolution trappingRainWaterSolution;
    private int[] height;

    @Before
    public void setUp() throws Exception {
        trappingRainWaterSolution = new TrappingRainWaterSolution();
        height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void trapFirst() {
        int result = trappingRainWaterSolution.trapFirst(height);
        int expected = 6;
        Assert.assertEquals(expected, result);

        height = new int[]{};
        result = trappingRainWaterSolution.trapFirst(height);
        expected = 0;
        Assert.assertEquals(expected, result);

        height = null;
        result = trappingRainWaterSolution.trapFirst(height);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void trapSecond() {
        int result = trappingRainWaterSolution.trapSecond(height);
        int expected = 6;
        Assert.assertEquals(expected, result);

        height = new int[]{};
        result = trappingRainWaterSolution.trapSecond(height);
        expected = 0;
        Assert.assertEquals(expected, result);

        height = null;
        result = trappingRainWaterSolution.trapSecond(height);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void trapThird() {
        int result = trappingRainWaterSolution.trapThird(height);
        int expected = 6;
        Assert.assertEquals(expected, result);

        height = new int[]{};
        result = trappingRainWaterSolution.trapThird(height);
        expected = 0;
        Assert.assertEquals(expected, result);

        height = null;
        result = trappingRainWaterSolution.trapThird(height);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}