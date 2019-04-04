package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SelectSortSolutionTest {

    private SelectSortSolution selectSortSolution;

    private int[] array;

    @Before
    public void setUp() throws Exception {
        selectSortSolution = new SelectSortSolution();
        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        selectSortSolution.selectSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{};
        selectSortSolution.selectSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        selectSortSolution.selectSort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        selectSortSolution.selectSort(array);
        Assert.assertArrayEquals(array, array);
    }
}