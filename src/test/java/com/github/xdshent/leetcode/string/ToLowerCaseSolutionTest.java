package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseSolutionTest {

    private ToLowerCaseSolution toLowerCaseSolution;

    @Before
    public void setUp() throws Exception {
        toLowerCaseSolution = new ToLowerCaseSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toLowerCase() {
        String str = "Hello";
        String expected = "hello";
        String result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals(expected, result);

        str = "HELLO";
        result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals(expected, result);

        str = "hello";
        result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals(expected, result);

        str = "H%llo";
        result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals("h%llo", result);

        str = "";
        result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals(str, result);

        str = null;
        result = toLowerCaseSolution.toLowerCase(str);
        Assert.assertEquals(str, result);
    }
}