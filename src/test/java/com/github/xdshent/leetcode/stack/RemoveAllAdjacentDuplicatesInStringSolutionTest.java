package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringSolutionTest {

    private RemoveAllAdjacentDuplicatesInStringSolution removeAllAdjacentDuplicatesInStringSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        removeAllAdjacentDuplicatesInStringSolution = new RemoveAllAdjacentDuplicatesInStringSolution();
        s = "abbacd";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeDuplicatesFirst() {
        String result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesFirst(s);
        String expected = "cd";
        assertEquals(expected, result);

        s = "abbaca";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesFirst(s);
        expected = "ca";
        assertEquals(expected, result);

        s = "abbacaca";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesFirst(s);
        expected = "caca";
        assertEquals(expected, result);

        s = "";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesFirst(s);
        expected = "";
        assertEquals(expected, result);

        s = null;
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesFirst(s);
        expected = null;
        assertEquals(expected, result);
    }

    @Test
    public void removeDuplicatesSecond() {
        String result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesSecond(s);
        String expected = "cd";
        Assert.assertEquals(expected, result);

        s = "abbaca";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesSecond(s);
        expected = "ca";
        Assert.assertEquals(expected, result);

        s = "abbacaca";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesSecond(s);
        expected = "caca";
        Assert.assertEquals(expected, result);

        s = "";
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesSecond(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = null;
        result = removeAllAdjacentDuplicatesInStringSolution.removeDuplicatesSecond(s);
        expected = null;
        Assert.assertEquals(expected, result);
    }
}