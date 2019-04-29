package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordPatternSolutionTest {

    private WordPatternSolution wordPatternSolution;
    private String pattern;
    private String str;

    @Before
    public void setUp() throws Exception {
        wordPatternSolution = new WordPatternSolution();
        pattern = "abba";
        str = "dog cat cat dog";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void wordPattern() {
        boolean result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertTrue(result);

        pattern = "abba";
        str = "dog cat cat fish";
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);

        pattern = "aaaa";
        str = "dog cat cat fish";
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);

        pattern = "abba";
        str = "dog dog dog dog";
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);

        pattern = "aaa";
        str = "dog dog dog dog";
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);

        pattern = "abba";
        str = "";
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);

        pattern = "abba";
        str = null;
        result = wordPatternSolution.wordPattern(pattern, str);
        Assert.assertFalse(result);
    }
}