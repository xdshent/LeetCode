package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParitySolutionTest {

    private SortArrayByParitySolution sortArrayByParitySolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        sortArrayByParitySolution = new SortArrayByParitySolution();
        array = new int[]{3, 1, 2, 4};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortArrayByParity() {
        int[] expected = new int[]{2, 4, 3, 1};
        int[] result = sortArrayByParitySolution.sortArrayByParity(array);
        Assert.assertArrayEquals(expected, result);

        array = new int[]{2, 4, 3};
        expected = new int[]{2, 4, 3};
        result = sortArrayByParitySolution.sortArrayByParity(array);
        Assert.assertArrayEquals(expected, result);

        array = new int[]{4, 2};
        expected = new int[]{4, 2};
        result = sortArrayByParitySolution.sortArrayByParity(array);
        Assert.assertArrayEquals(expected, result);

        array = new int[]{2};
        expected = new int[]{2};
        result = sortArrayByParitySolution.sortArrayByParity(array);
        Assert.assertArrayEquals(expected, result);

        array = null;
        expected = null;
        result = sortArrayByParitySolution.sortArrayByParity(array);
        Assert.assertArrayEquals(expected, result);
    }
}