package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SpiralMatrixSolutionTest {

    private int[][] matrix;
    private SpiralMatrixSolution spiralMatrixSolution;

    @Before
    public void setUp() throws Exception {
        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        spiralMatrixSolution = new SpiralMatrixSolution();
    }

    @After
    public void tearDown() throws Exception {
        matrix = null;
    }

    @Test
    public void spiralOrder() {
        List<Integer> result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() > 0);

        Integer[] expected = new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        matrix = null;
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() == 0);
        Assert.assertEquals(Collections.emptyList(), result);

        matrix = new int[][]{};
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() == 0);
        Assert.assertEquals(Collections.emptyList(), result);

        matrix = new int[][]{{}};
        expected = new Integer[]{};
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() == 0);
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        matrix = new int[][]{{2, 5}, {8, 4}, {0, -1}};
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() > 0);
        expected = new Integer[]{2, 5, 4, -1, 0, 8};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        matrix = new int[][]{{1, 2, 3, 4}};
        expected = new Integer[]{1, 2, 3, 4};
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() > 0);
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        matrix = new int[][]{{1}, {2}, {3}, {4}};
        expected = new Integer[]{1, 2, 3, 4};
        result = spiralMatrixSolution.spiralOrder(matrix);
        Assert.assertTrue(result.size() > 0);
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}