package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortSolutionTest {

    private MergeSortSolution mergeSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        mergeSortSolution = new MergeSortSolution();

        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mergeSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        mergeSortSolution.mergeSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        mergeSortSolution.mergeSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{};
        mergeSortSolution.mergeSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        mergeSortSolution.mergeSort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        mergeSortSolution.mergeSort(array);
        Assert.assertArrayEquals(array, array);
    }
}