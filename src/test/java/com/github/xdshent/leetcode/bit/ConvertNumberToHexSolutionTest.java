package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertNumberToHexSolutionTest {

    private ConvertNumberToHexSolution convertNumberToHexSolution;
    private int num;

    @Before
    public void setUp() throws Exception {
        convertNumberToHexSolution = new ConvertNumberToHexSolution();
        num = 10;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toHex() {
        String result = convertNumberToHexSolution.toHex(num);
        String expected = "a";
        Assert.assertEquals(expected, result);

        num = 0;
        result = convertNumberToHexSolution.toHex(num);
        expected = "0";
        Assert.assertEquals(expected, result);

        num = 15;
        result = convertNumberToHexSolution.toHex(num);
        expected = "f";
        Assert.assertEquals(expected, result);

        num = 6;
        result = convertNumberToHexSolution.toHex(num);
        expected = "6";
        Assert.assertEquals(expected, result);
    }
}