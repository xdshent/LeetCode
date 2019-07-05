package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicateZerosSolutionTest {

    private DuplicateZerosSolution duplicateZerosSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        duplicateZerosSolution = new DuplicateZerosSolution();
        array = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void duplicateZeros() {
        int[] result = duplicateZerosSolution.duplicateZeros(array);
        int[] expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{1, 2, 3};
        result = duplicateZerosSolution.duplicateZeros(array);
        expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{1, 2, 3, 0};
        result = duplicateZerosSolution.duplicateZeros(array);
        expected = new int[]{1, 2, 3, 0};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{0, 0, 0, 0, 1};
        result = duplicateZerosSolution.duplicateZeros(array);
        expected = new int[]{0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, result);

        array = new int[]{};
        result = duplicateZerosSolution.duplicateZeros(array);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, result);

        array = null;
        result = duplicateZerosSolution.duplicateZeros(array);
        expected = null;
        Assert.assertArrayEquals(expected, result);
    }
}