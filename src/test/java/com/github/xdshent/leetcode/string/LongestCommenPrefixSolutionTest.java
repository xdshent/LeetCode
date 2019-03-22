package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommenPrefixSolutionTest {

    private LongestCommonPrefixSolution longestCommenPrefixSolution;
    private String[] strs;

    @Before
    public void setUp() throws Exception {
        longestCommenPrefixSolution = new LongestCommonPrefixSolution();
        strs = new String[]{"flower", "flow", "flight"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void longestCommonPrefix() {
        String result = longestCommenPrefixSolution.longestCommonPrefix(strs);
        String expected = "fl";
        Assert.assertEquals(expected, result);

        strs = new String[]{"flow"};
        result = longestCommenPrefixSolution.longestCommonPrefix(strs);
        expected = "flow";
        Assert.assertEquals(expected, result);

        strs = new String[]{};
        result = longestCommenPrefixSolution.longestCommonPrefix(strs);
        expected = "";
        Assert.assertEquals(expected, result);

        strs = null;
        result = longestCommenPrefixSolution.longestCommonPrefix(strs);
        expected = "";
        Assert.assertEquals(expected, result);
    }
}