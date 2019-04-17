package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryWithAlternatingBitsSolutionTest {

    private BinaryWithAlternatingBitsSolution binaryWithAlternatingBitsSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        binaryWithAlternatingBitsSolution = new BinaryWithAlternatingBitsSolution();
        n = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hasAlternatingBits() {
        boolean result = binaryWithAlternatingBitsSolution.hasAlternatingBits(n);
        Assert.assertTrue(result);

        n = 7;
        result = binaryWithAlternatingBitsSolution.hasAlternatingBits(n);
        Assert.assertFalse(result);

        n = 11;
        result = binaryWithAlternatingBitsSolution.hasAlternatingBits(n);
        Assert.assertFalse(result);

        n = 10;
        result = binaryWithAlternatingBitsSolution.hasAlternatingBits(n);
        Assert.assertTrue(result);
    }
}