package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCompressionSolutionTest {

    private StringCompressionSolution stringCompressionSolution;
    private char[] chars;

    @Before
    public void setUp() throws Exception {
        stringCompressionSolution = new StringCompressionSolution();
        chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void compress() {
        int result = stringCompressionSolution.compress(chars);
        int expected = 6;
        Assert.assertEquals(expected, result);

        chars = new char[]{'a'};
        result = stringCompressionSolution.compress(chars);
        expected = 1;
        Assert.assertEquals(expected, result);

        chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        result = stringCompressionSolution.compress(chars);
        expected = 4;
        Assert.assertEquals(expected, result);

        chars = new char[]{};
        result = stringCompressionSolution.compress(chars);
        expected = 0;
        Assert.assertEquals(expected, result);

        chars = null;
        result = stringCompressionSolution.compress(chars);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}