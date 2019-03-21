package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberSolutionTest {

    private SingleNumberSolution singleNumberSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        singleNumberSolution = new SingleNumberSolution();
        array = new int[]{1, 2, 2, 3, 4, 4, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void singleNumber() {
        int result = singleNumberSolution.singleNumber(array);
        Assert.assertEquals(1, result);
    }
}