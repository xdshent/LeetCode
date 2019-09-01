package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepeatedSubstringPatternSolutionTest {

    private RepeatedSubstringPatternSolution repeatedSubstringPatternSolution;
    private String str;

    @Before
    public void setUp() throws Exception {
        repeatedSubstringPatternSolution = new RepeatedSubstringPatternSolution();
        str = "abab";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void repeatedSubstringPattern() {
        boolean result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertTrue(result);

        str = "aba";
        result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertFalse(result);

        str = "abcabcabcabc";
        result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertTrue(result);

        str = "abcabcabcabcd";
        result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertFalse(result);

        str = "";
        result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertFalse(result);

        str = null;
        result = repeatedSubstringPatternSolution.repeatedSubstringPattern(str);
        Assert.assertFalse(result);
    }
}