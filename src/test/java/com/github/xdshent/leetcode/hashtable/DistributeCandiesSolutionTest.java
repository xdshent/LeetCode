package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistributeCandiesSolutionTest {

    private DistributeCandiesSolution distributeCandiesSolution;
    private int[] candies;

    @Before
    public void setUp() throws Exception {
        distributeCandiesSolution = new DistributeCandiesSolution();
        candies = new int[]{1, 1, 2, 2, 3, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void distributeCandies() {
        int result = distributeCandiesSolution.distributeCandies(candies);
        int expected = 3;
        Assert.assertEquals(expected, result);

        candies = new int[]{1, 1, 2, 3};
        result = distributeCandiesSolution.distributeCandies(candies);
        expected = 2;
        Assert.assertEquals(expected, result);

        candies = new int[]{1, 1, 2, 3, 4, 5, 6, 7};
        result = distributeCandiesSolution.distributeCandies(candies);
        expected = 4;
        Assert.assertEquals(expected, result);
    }
}