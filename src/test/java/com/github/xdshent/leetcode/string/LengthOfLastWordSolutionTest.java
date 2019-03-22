package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordSolutionTest {

    private LengthOfLastWordSolution lengthOfLastWordSolution;
    private String str;

    @Before
    public void setUp() throws Exception {
        lengthOfLastWordSolution = new LengthOfLastWordSolution();
        str = "Hello World";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lengthOfLastWord() {
        int result = lengthOfLastWordSolution.lengthOfLastWord(str);
        int expected = 5;
        Assert.assertEquals(expected, result);

        str = "world";
        result = lengthOfLastWordSolution.lengthOfLastWord(str);
        expected = 5;
        Assert.assertEquals(expected, result);

        str = " world hello ";
        result = lengthOfLastWordSolution.lengthOfLastWord(str);
        expected = 5;
        Assert.assertEquals(expected, result);

        str = "";
        result = lengthOfLastWordSolution.lengthOfLastWord(str);
        expected = 0;
        Assert.assertEquals(expected, result);

        str = null;
        result = lengthOfLastWordSolution.lengthOfLastWord(str);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}