package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseBitsSolutionTest {

    private ReverseBitsSolution reverseBitsSolution;

    private int x;

    @Before
    public void setUp() throws Exception {
        reverseBitsSolution = new ReverseBitsSolution();
        x = 0b00000010100101000001111010011100;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseBits() {
        int result = reverseBitsSolution.reverseBits(x);
        int expected = 0b00111001011110000010100101000000;
        Assert.assertEquals(expected, result);

        x = 0b11111111111111111111111111111101;
        result = reverseBitsSolution.reverseBits(x);
        expected = 0b10111111111111111111111111111111;
        Assert.assertEquals(expected, result);

        x = 0;
        result = reverseBitsSolution.reverseBits(x);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}