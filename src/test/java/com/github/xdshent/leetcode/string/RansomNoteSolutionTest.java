package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RansomNoteSolutionTest {

    private RansomNoteSolution ransomNoteSolution;
    private String ransomNote;
    private String magazine;

    @Before
    public void setUp() throws Exception {
        ransomNoteSolution = new RansomNoteSolution();
        ransomNote = "ab";
        magazine = "abc";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void canConstruct() {
        boolean result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertTrue(result);

        ransomNote = "aac";
        magazine = "aacbd";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertTrue(result);

        ransomNote = "ac";
        magazine = "bc";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertFalse(result);

        ransomNote = "aac";
        magazine = "abc";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertFalse(result);

        ransomNote = "acd";
        magazine = "bc";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertFalse(result);

        ransomNote = "";
        magazine = "bc";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertTrue(result);

        ransomNote = "";
        magazine = "";
        result = ransomNoteSolution.canConstruct(ransomNote, magazine);
        Assert.assertTrue(result);
    }
}