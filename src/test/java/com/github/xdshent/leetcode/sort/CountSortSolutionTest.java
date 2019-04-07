package com.github.xdshent.leetcode.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CountSortSolutionTest {

    private CountSortSolution countSortSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        countSortSolution = new CountSortSolution();
        array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        countSortSolution.sort(array);
        Assert.assertArrayEquals(temp, array);

        array = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        countSortSolution.sort(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        countSortSolution.sort(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{};
        countSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);

        array = new int[]{1};
        countSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);

        array = null;
        countSortSolution.sort(array);
        Assert.assertArrayEquals(array, array);
    }
}