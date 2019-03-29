package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImplementStrStrSolutionTest {

    private ImplementStrStrSolution implementStrStr;
    private String haystack;
    private String needle;

    @Before
    public void setUp() throws Exception {
        implementStrStr = new ImplementStrStrSolution();
        haystack = "hello";
        needle = "ll";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void strStr() {
        int result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(2, result);

        haystack = "";
        needle = "a";
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(-1, result);

        haystack = null;
        needle = "a";
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(-1, result);

        haystack = "abc";
        needle = null;
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(-1, result);

        haystack = "abcdefgh";
        needle = "efg";
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(4, result);

        haystack = "abcdefgh";
        needle = "";
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(0, result);

        haystack = "abcdefgh";
        needle = "ghi";
        result = implementStrStr.strStr(haystack, needle);
        Assert.assertEquals(-1, result);
    }
}