package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquaresOfSortedArraySolutionTest {

    private SquaresOfSortedArraySolution squaresOfSortedArraySolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        squaresOfSortedArraySolution = new SquaresOfSortedArraySolution();
        array = new int[]{-4, -1, 0, 3, 10};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortedSquares() {
        int[] expected = new int[]{0, 1, 9, 16, 100};
        int[] result = squaresOfSortedArraySolution.sortedSquares(array);
        Assert.assertArrayEquals(expected, result);

        array = new int[]{-7, -3, 2, 3, 11};
        expected = new int[]{4, 9, 9, 49, 121};
        result = squaresOfSortedArraySolution.sortedSquares(array);
        Assert.assertArrayEquals(expected, result);

        array = new int[]{};
        expected = new int[]{};
        result = squaresOfSortedArraySolution.sortedSquares(array);
        Assert.assertArrayEquals(expected, result);

        array = null;
        expected = null;
        result = squaresOfSortedArraySolution.sortedSquares(array);
        Assert.assertArrayEquals(expected, result);
    }
}