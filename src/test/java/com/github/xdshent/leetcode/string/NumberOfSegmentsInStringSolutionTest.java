package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfSegmentsInStringSolutionTest {

    private NumberOfSegmentsInStringSolution numberOfSegmentsInStringSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        numberOfSegmentsInStringSolution = new NumberOfSegmentsInStringSolution();
        s = "Hello, my name is John";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countSegments() {
        int result = numberOfSegmentsInStringSolution.countSegments(s);
        int expected = 5;
        Assert.assertEquals(expected, result);

        s = " a ";
        result = numberOfSegmentsInStringSolution.countSegments(s);
        expected = 1;
        Assert.assertEquals(expected, result);

        s = " Hello, my  name  is John ";
        result = numberOfSegmentsInStringSolution.countSegments(s);
        expected = 5;
        Assert.assertEquals(expected, result);

        s = " a ";
        result = numberOfSegmentsInStringSolution.countSegments(s);
        expected = 1;
        Assert.assertEquals(expected, result);

        s = "    ";
        result = numberOfSegmentsInStringSolution.countSegments(s);
        expected = 0;
        Assert.assertEquals(expected, result);

        s = null;
        result = numberOfSegmentsInStringSolution.countSegments(s);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}