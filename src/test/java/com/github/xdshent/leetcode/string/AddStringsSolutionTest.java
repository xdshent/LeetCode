package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddStringsSolutionTest {

    private AddStringsSolution addStringsSolution;
    private String num1;
    private String num2;

    @Before
    public void setUp() throws Exception {
        addStringsSolution = new AddStringsSolution();
        num1 = "10";
        num2 = "110";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addStrings() {
        String result = addStringsSolution.addStrings(num1, num2);
        String expected = "120";
        Assert.assertEquals(expected, result);

        num1 = "56";
        num2 = "75";
        result = addStringsSolution.addStrings(num1, num2);
        expected = "131";
        Assert.assertEquals(expected, result);

        num1 = "156";
        num2 = "75";
        result = addStringsSolution.addStrings(num1, num2);
        expected = "231";
        Assert.assertEquals(expected, result);
    }
}