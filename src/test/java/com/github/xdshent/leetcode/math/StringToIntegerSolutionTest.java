package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringToIntegerSolutionTest {

    private StringToIntegerSolution stringToIntegerSolution;
    private String str;

    @Before
    public void setUp() throws Exception {
        stringToIntegerSolution = new StringToIntegerSolution();
        str = "42";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void myAtoi() {
        int result = stringToIntegerSolution.myAtoi(str);
        int expected = 42;
        Assert.assertEquals(expected, result);

        str = "   -42";
        expected = -42;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "-42bv";
        expected = -42;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "";
        expected = 0;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "-91283472332";
        expected = -2147483648;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "2147483644";
        expected = 2147483644;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "2147483648";
        expected = Integer.MAX_VALUE;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "-e";
        expected = 0;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);

        str = "+";
        expected = 0;
        result = stringToIntegerSolution.myAtoi(str);
        Assert.assertEquals(expected, result);
    }
}