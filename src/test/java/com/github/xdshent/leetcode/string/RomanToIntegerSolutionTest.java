package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerSolutionTest {

    private RomanToIntegerSolution romanToIntegerSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        romanToIntegerSolution = new RomanToIntegerSolution();
        s = "III";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void romanToInt() {
        int result = romanToIntegerSolution.romanToInt(s);
        int expected = 3;
        Assert.assertEquals(expected, result);

        s = "IV";
        result = romanToIntegerSolution.romanToInt(s);
        expected = 4;
        Assert.assertEquals(expected, result);

        s = "IX";
        result = romanToIntegerSolution.romanToInt(s);
        expected = 9;
        Assert.assertEquals(expected, result);

        s = "LVIII";
        result = romanToIntegerSolution.romanToInt(s);
        expected = 58;
        Assert.assertEquals(expected, result);

        s = "MCMXCIV";
        result = romanToIntegerSolution.romanToInt(s);
        expected = 1994;
        Assert.assertEquals(expected, result);

        s = "";
        result = romanToIntegerSolution.romanToInt(s);
        expected = 0;
        Assert.assertEquals(expected, result);

        s = null;
        result = romanToIntegerSolution.romanToInt(s);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}