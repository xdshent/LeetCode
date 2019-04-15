package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTwoSolutionTest {

    private ReverseStringTwoSolution reverseStringIISolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        reverseStringIISolution = new ReverseStringTwoSolution();
        s = "abcdefg";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStr() {
        String result = reverseStringIISolution.reverseStr(s, 2);
        String expected = "bacdfeg";
        Assert.assertEquals(expected, result);

        s = "hijklmnop";
        result = reverseStringIISolution.reverseStr(s, 2);
        expected = "ihjkmlnop";
        Assert.assertEquals(expected, result);

        s = "";
        result = reverseStringIISolution.reverseStr(s, 2);
        expected = "";
        Assert.assertEquals(expected, result);

        s = null;
        result = reverseStringIISolution.reverseStr(s, 2);
        expected = null;
        Assert.assertEquals(expected, result);
    }
}