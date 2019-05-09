package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxConsecutiveOnesSolutionTest {

    private MaxConsecutiveOnesSolution maxConsecutiveOnesSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        maxConsecutiveOnesSolution = new MaxConsecutiveOnesSolution();
        array = new int[]{1, 0, 1, 1, 1, 0};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findMaxConsecutiveOnes() {
        int result = maxConsecutiveOnesSolution.findMaxConsecutiveOnes(array);
        int expected = 3;
        Assert.assertEquals(expected, result);

        array = new int[]{1, 1, 0, 0, 0};
        result = maxConsecutiveOnesSolution.findMaxConsecutiveOnes(array);
        expected = 2;
        Assert.assertEquals(expected, result);

        array = new int[]{1};
        result = maxConsecutiveOnesSolution.findMaxConsecutiveOnes(array);
        expected = 1;
        Assert.assertEquals(expected, result);

        array = new int[]{};
        result = maxConsecutiveOnesSolution.findMaxConsecutiveOnes(array);
        expected = 0;
        Assert.assertEquals(expected, result);

        array = null;
        result = maxConsecutiveOnesSolution.findMaxConsecutiveOnes(array);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}