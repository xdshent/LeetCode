package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortSolutionTest {

    private HeapSortSolution heapSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        heapSortSolution = new HeapSortSolution();
        array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void heapSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        heapSortSolution.heapSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{7, 6, 5, 4, 3, 2, 1};
        heapSortSolution.heapSort(array);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        heapSortSolution.heapSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        heapSortSolution.heapSort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        heapSortSolution.heapSort(array);
        Assert.assertArrayEquals(array, array);

    }
}