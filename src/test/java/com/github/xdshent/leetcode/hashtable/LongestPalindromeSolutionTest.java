package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeSolutionTest {

    private LongestPalindromeSolution longestPalindromeSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        longestPalindromeSolution = new LongestPalindromeSolution();
        s = "abccccdd";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void longestPalindrome() {
        int result = longestPalindromeSolution.longestPalindrome(s);
        int expected = 7;
        Assert.assertEquals(expected, result);

        s = "abcabc";
        result = longestPalindromeSolution.longestPalindrome(s);
        expected = 6;
        Assert.assertEquals(expected, result);

        s = "abc";
        result = longestPalindromeSolution.longestPalindrome(s);
        expected = 1;
        Assert.assertEquals(expected, result);

        s = "a";
        result = longestPalindromeSolution.longestPalindrome(s);
        expected = 1;
        Assert.assertEquals(expected, result);

        s = "";
        result = longestPalindromeSolution.longestPalindrome(s);
        expected = 0;
        Assert.assertEquals(expected, result);

        s = null;
        result = longestPalindromeSolution.longestPalindrome(s);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}