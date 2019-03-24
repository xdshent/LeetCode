package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArraySolutionTest {

    private RotateArraySolution rotateArraySolution;
    private int[] array;
    private int k;

    @Before
    public void setUp() throws Exception {
        rotateArraySolution = new RotateArraySolution();
        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        k = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void rotateFirst() {
        rotateArraySolution.rotateFirst(array, k);
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2};
        rotateArraySolution.rotateFirst(array, 2);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, array);

        array = null;
        rotateArraySolution.rotateFirst(array, 2);
        expected = null;
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        rotateArraySolution.rotateFirst(array, 1);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        rotateArraySolution.rotateFirst(array, 1);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateFirst(array, 3);
        expected = new int[]{5, 6, 7, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateFirst(array, 4);
        expected = new int[]{4, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void rotateSecond() {
        rotateArraySolution.rotateSecond(array, k);
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2};
        rotateArraySolution.rotateSecond(array, 2);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, array);

        array = null;
        rotateArraySolution.rotateSecond(array, 2);
        expected = null;
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        rotateArraySolution.rotateSecond(array, 1);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        rotateArraySolution.rotateSecond(array, 1);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateSecond(array, 3);
        expected = new int[]{5, 6, 7, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateSecond(array, 4);
        expected = new int[]{4, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void rotateThird() {
        rotateArraySolution.rotateThird(array, k);
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2};
        rotateArraySolution.rotateThird(array, 2);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, array);

        array = null;
        rotateArraySolution.rotateThird(array, 2);
        expected = null;
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        rotateArraySolution.rotateThird(array, 1);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        rotateArraySolution.rotateThird(array, 1);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateThird(array, 3);
        expected = new int[]{5, 6, 7, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateThird(array, 4);
        expected = new int[]{4, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void rotateFourth() {
        rotateArraySolution.rotateFourth(array, k);
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2};
        rotateArraySolution.rotateFourth(array, 2);
        expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, array);

        array = null;
        rotateArraySolution.rotateFourth(array, 2);
        expected = null;
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        rotateArraySolution.rotateFourth(array, 1);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        rotateArraySolution.rotateFourth(array, 1);
        expected = new int[]{};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateFourth(array, 3);
        expected = new int[]{5, 6, 7, 4};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{4, 5, 6, 7};
        rotateArraySolution.rotateFourth(array, 4);
        expected = new int[]{4, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);
    }
}