package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortSolutionTest {

    private QuickSortSolution quickSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {

        quickSortSolution = new QuickSortSolution();
        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void quickSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        quickSortSolution.quickSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{7, 6, 5, 5, 3, 2, 1};
        quickSortSolution.quickSort(array);
        int[] expected = {1, 2, 3, 5, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        quickSortSolution.quickSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        quickSortSolution.quickSort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        quickSortSolution.quickSort(array);
        Assert.assertArrayEquals(array, array);
    }
}