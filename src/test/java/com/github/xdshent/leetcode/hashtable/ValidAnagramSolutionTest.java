package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramSolutionTest {

    private ValidAnagramSolution validPerfectSquareSolution;
    private String s;
    private String t;

    @Before
    public void setUp() throws Exception {
        validPerfectSquareSolution = new ValidAnagramSolution();
        s = "anagram";
        t = "anagram";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isAnagramFirst() {
        boolean result = validPerfectSquareSolution.isAnagramFirst(s, t);
        Assert.assertTrue(result);

        s = "rat";
        t = "car";
        result = validPerfectSquareSolution.isAnagramFirst(s, t);
        Assert.assertFalse(result);

        s = "anagram";
        t = "anagra";
        result = validPerfectSquareSolution.isAnagramFirst(s, t);
        Assert.assertFalse(result);

        s = "abcdefg";
        t = "gfedcba";
        result = validPerfectSquareSolution.isAnagramFirst(s, t);
        Assert.assertTrue(result);
    }

    @Test
    public void isAnagramSecond() {
        boolean result = validPerfectSquareSolution.isAnagramSecond(s, t);
        Assert.assertTrue(result);

        s = "rat";
        t = "car";
        result = validPerfectSquareSolution.isAnagramSecond(s, t);
        Assert.assertFalse(result);

        s = "anagram";
        t = "anagra";
        result = validPerfectSquareSolution.isAnagramSecond(s, t);
        Assert.assertFalse(result);

        s = "abcdefg";
        t = "gfedcba";
        result = validPerfectSquareSolution.isAnagramSecond(s, t);
        Assert.assertTrue(result);
    }
}