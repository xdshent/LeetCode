package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BitNumberSolutionTest {

    private BitNumberSolution bitNumberSolution;

    @Before
    public void setUp() throws Exception {
        bitNumberSolution = new BitNumberSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHammingWeight() {
        int x = 0b000000000000000001;
        int result = bitNumberSolution.hammingWeight(x);
        Assert.assertEquals(1, result);

        x = 0b11111111111111111111111111111101;
        result = bitNumberSolution.hammingWeight(x);
        Assert.assertEquals(31, result);

        x = 0b00000000000000000000000000001011;
        result = bitNumberSolution.hammingWeight(x);
        Assert.assertEquals(3, result);

        x = 0;
        result = bitNumberSolution.hammingWeight(x);
        Assert.assertEquals(0, result);
    }
}