package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeightCheckerSolutionTest {

    private HeightCheckerSolution heightCheckerSolution;
    private int[] heights;

    @Before
    public void setUp() throws Exception {
        heightCheckerSolution = new HeightCheckerSolution();
        heights = new int[]{1, 1, 4, 2, 1, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void heightChecker() {
        int result = heightCheckerSolution.heightChecker(heights);
        int expected = 3;
        Assert.assertEquals(expected, result);

        heights = new int[]{};
        result = heightCheckerSolution.heightChecker(heights);
        expected = 0;
        Assert.assertEquals(expected, result);

        heights = null;
        result = heightCheckerSolution.heightChecker(heights);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}