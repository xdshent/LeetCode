package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringSolutionTest {

    private ReverseStringSolution reverseStringSolution;
    private char[] s;

    @Before
    public void setUp() throws Exception {
        reverseStringSolution = new ReverseStringSolution();
        s = new char[]{'h', 'e', 'l', 'l', 'o'};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseString() {
        reverseStringSolution.reverseString(s);
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        Assert.assertArrayEquals(expected, s);

        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseStringSolution.reverseString(s);
        expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        Assert.assertArrayEquals(expected, s);

        s = new char[]{'H'};
        reverseStringSolution.reverseString(s);
        expected = new char[]{'H'};
        Assert.assertArrayEquals(expected, s);

        s = null;
        reverseStringSolution.reverseString(s);
        expected = null;
        Assert.assertArrayEquals(expected, s);
    }
}