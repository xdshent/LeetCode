package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    private int x;
    @Before
    public void setUp() throws Exception {
        x = Integer.MAX_VALUE;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        int result = ReverseInteger.reverse(x);
        int expected = 0;
        Assert.assertEquals(expected,result);


        x = Integer.MIN_VALUE;
        result = ReverseInteger.reverse(x);
        expected = 0;
        Assert.assertEquals(expected,result);

        x = 123;
        result = ReverseInteger.reverse(x);
        expected = 321;
        Assert.assertEquals(expected,result);
    }
}