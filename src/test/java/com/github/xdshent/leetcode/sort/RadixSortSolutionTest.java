package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RadixSortSolutionTest {

    private RadixSortSolution radixSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        radixSortSolution = new RadixSortSolution();
        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        radixSortSolution.radixSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{60, 45, 33, 123, 64};
        temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        radixSortSolution.radixSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{};
        temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        radixSortSolution.radixSort(array);
        Assert.assertArrayEquals(temp, array);

        array = null;
        radixSortSolution.radixSort(array);
        Assert.assertNull(array);
    }
}