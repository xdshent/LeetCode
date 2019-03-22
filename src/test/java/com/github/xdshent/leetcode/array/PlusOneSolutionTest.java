package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneSolutionTest {

    private PlusOneSolution plusOneSolution;
    private int[] digits;

    @Before
    public void setUp() throws Exception {
        plusOneSolution = new PlusOneSolution();
        digits = new int[]{1, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void plusOne() {
        int[] result = plusOneSolution.plusOne(digits);
        int[] expected = new int[]{1, 2, 4};
        Assert.assertArrayEquals(expected, result);

        digits = new int[]{9, 9, 9};
        result = plusOneSolution.plusOne(digits);
        expected = new int[]{1, 0, 0, 0};
        Assert.assertArrayEquals(expected, result);

        digits = new int[]{1};
        result = plusOneSolution.plusOne(digits);
        expected = new int[]{2};
        Assert.assertArrayEquals(expected, result);

        digits = new int[]{9, 9};
        result = plusOneSolution.plusOne(digits);
        expected = new int[]{1, 0, 0};
        Assert.assertArrayEquals(expected, result);
    }
}