package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SelfDividingNumbersSolutionTest {

    private SelfDividingNumbersSolution selfDividingNumbersSolution;
    private int left;
    private int right;

    @Before
    public void setUp() throws Exception {
        selfDividingNumbersSolution = new SelfDividingNumbersSolution();
        left = 1;
        right = 22;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selfDividingNumbers() {
        List<Integer> result = selfDividingNumbersSolution.selfDividingNumbers(left, right);
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        left = 22;
        right = 1;
        result = selfDividingNumbersSolution.selfDividingNumbers(left, right);
        expected = new Integer[0];
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}