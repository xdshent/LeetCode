package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xdshen
 */
public class SortColorsSolutionTest {

    private SortColorsSolution sortColorsSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        sortColorsSolution = new SortColorsSolution();
        array = new int[]{1, 0, 2};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortColors() {
        int[] expected = {0, 1, 2};
        sortColorsSolution.sortColors(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 1, 1, 2, 2, 0, 0};
        expected = new int[]{0, 0, 1, 1, 1, 2, 2};
        sortColorsSolution.sortColors(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1, 0, 1, 2, 0, 1, 2};
        expected = new int[]{0, 0, 1, 1, 1, 2, 2};
        sortColorsSolution.sortColors(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{2, 2};
        expected = new int[]{2, 2};
        sortColorsSolution.sortColors(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1};
        expected = new int[]{1};
        sortColorsSolution.sortColors(array);
        Assert.assertArrayEquals(expected, array);

        array = null;
        sortColorsSolution.sortColors(array);
        Assert.assertNull(array);
    }
}