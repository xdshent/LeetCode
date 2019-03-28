package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosSolutionTest {

    private MoveZerosSolution moveZerosSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        moveZerosSolution = new MoveZerosSolution();
        array = new int[]{0, 1, 4, 0, 6, 0, 5};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void moveZeroes() {
        moveZerosSolution.moveZeroes(array);
        int[] expected = new int[]{1, 4, 6, 5, 0, 0, 0};
        Assert.assertArrayEquals(expected, array);

        array = null;
        moveZerosSolution.moveZeroes(array);
        expected = null;
        Assert.assertEquals(expected, array);

        array = new int[]{};
        moveZerosSolution.moveZeroes(array);
        expected = new int[0];
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        moveZerosSolution.moveZeroes(array);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 0, 6, 7, 0, 9};
        moveZerosSolution.moveZeroes(array);
        expected = new int[]{1, 6, 7, 9, 0, 0};
        Assert.assertArrayEquals(expected, array);
    }
}