package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RelativeSortArraySolutionTest {

    private RelativeSortArraySolution relativeSortArraySolution;
    private int[] array1;
    private int[] array2;

    @Before
    public void setUp() throws Exception {
        relativeSortArraySolution = new RelativeSortArraySolution();
        array1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        array2 = new int[]{2, 1, 4, 3, 9, 6};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void relativeSortArray() {
        int[] result = relativeSortArraySolution.relativeSortArray(array1, array2);
        int[] expected = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        Assert.assertArrayEquals(expected, result);

        array1 = null;
        array2 = new int[]{2, 1, 4, 3, 9, 6};
        result = relativeSortArraySolution.relativeSortArray(array1, array2);
        expected = new int[0];
        Assert.assertArrayEquals(expected, result);

        array1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        array2 = null;
        result = relativeSortArraySolution.relativeSortArray(array1, array2);
        expected = new int[0];
        Assert.assertArrayEquals(expected, result);

        array1 = new int[0];
        array2 = new int[]{2, 1, 4, 3, 9, 6};
        result = relativeSortArraySolution.relativeSortArray(array1, array2);
        expected = new int[0];
        Assert.assertArrayEquals(expected, result);

        array1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        array2 = new int[0];
        result = relativeSortArraySolution.relativeSortArray(array1, array2);
        expected = new int[0];
        Assert.assertArrayEquals(expected, result);
    }
}