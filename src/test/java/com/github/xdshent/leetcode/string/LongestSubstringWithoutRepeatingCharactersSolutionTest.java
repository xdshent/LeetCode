package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersSolutionTest {

    private LongestSubstringWithoutRepeatingCharactersSolution longestSubstringWithoutRepeatingCharactersSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        longestSubstringWithoutRepeatingCharactersSolution = new LongestSubstringWithoutRepeatingCharactersSolution();
        s = "abcabcbb";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lengthOfLongestSubstring() {
        int result = longestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring(s);
        int expected = 3;
        Assert.assertEquals(expected, result);

        s = "bbbbb";
        result = longestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring(s);
        expected = 1;
        Assert.assertEquals(expected, result);

        s = "pwwkew";
        result = longestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring(s);
        expected = 3;
        Assert.assertEquals(expected, result);

        s = "";
        result = longestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring(s);
        expected = 0;
        Assert.assertEquals(expected, result);

        s = null;
        result = longestSubstringWithoutRepeatingCharactersSolution.lengthOfLongestSubstring(s);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}