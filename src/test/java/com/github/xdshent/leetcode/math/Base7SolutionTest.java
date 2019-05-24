package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base7SolutionTest {

    private Base7Solution base7Solution;
    private int num;

    @Before
    public void setUp() throws Exception {
        base7Solution = new Base7Solution();
        num = 7;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertToBase7() {
        String result = base7Solution.convertToBase7(num);
        String expected = "10";
        Assert.assertEquals(expected, result);

        num = -7;
        result = base7Solution.convertToBase7(num);
        expected = "-10";
        Assert.assertEquals(expected, result);

        num = 100;
        result = base7Solution.convertToBase7(num);
        expected = "202";
        Assert.assertEquals(expected, result);
    }
}