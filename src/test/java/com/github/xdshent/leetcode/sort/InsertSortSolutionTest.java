package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertSortSolutionTest {

    private InsertSortSolution insertSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        insertSortSolution = new InsertSortSolution();
        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        insertSortSolution.insertSort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{};
        insertSortSolution.insertSort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        insertSortSolution.insertSort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        insertSortSolution.insertSort(array);
        Assert.assertArrayEquals(array, array);
    }
}