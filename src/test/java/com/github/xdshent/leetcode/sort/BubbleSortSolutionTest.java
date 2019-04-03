package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortSolutionTest {

    private BubbleSortSolution bubbleSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        bubbleSortSolution = new BubbleSortSolution();

        array = new int[5000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        bubbleSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);
    }
}