package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayPartitionOneSolutionTest {

    private ArrayPartitionOneSolution arrayPartitionOneSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        arrayPartitionOneSolution = new ArrayPartitionOneSolution();
        array = new int[]{1, 4, 3, 2};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void arrayPairSumOne() {
        int result = arrayPartitionOneSolution.arrayPairSumOne(array);
        int expected = 4;
        Assert.assertEquals(expected, result);

        array = new int[]{12, 56, 77, 90, 128, 6};
        result = arrayPartitionOneSolution.arrayPairSumOne(array);
        expected = 152;
        Assert.assertEquals(expected, result);

        array = new int[]{8, 23, 15, 7, 3, 66};
        result = arrayPartitionOneSolution.arrayPairSumOne(array);
        expected = 34;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayPairSumTwo() {
        int result = arrayPartitionOneSolution.arrayPairSumTwo(array);
        int expected = 4;
        Assert.assertEquals(expected, result);

        array = new int[]{12, 56, 77, 90, 128, 6};
        result = arrayPartitionOneSolution.arrayPairSumTwo(array);
        expected = 152;
        Assert.assertEquals(expected, result);

        array = new int[]{8, 23, 15, 7, 3, 66};
        result = arrayPartitionOneSolution.arrayPairSumTwo(array);
        expected = 34;
        Assert.assertEquals(expected, result);
    }
}