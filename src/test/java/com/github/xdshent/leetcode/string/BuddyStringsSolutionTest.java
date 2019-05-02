package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuddyStringsSolutionTest {

    private BuddyStringsSolution buddyStringsSolution;
    private String a;
    private String b;

    @Before
    public void setUp() throws Exception {
        buddyStringsSolution = new BuddyStringsSolution();
        a = "ab";
        b = "ab";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void buddyStrings() {
        boolean result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "ab";
        b = "ba";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertTrue(result);

        a = "aaaaaaabc";
        b = "aaaaaaabc";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertTrue(result);

        a = "";
        b = "ab";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "abcde";
        b = "abbfg";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "abcde";
        b = "abdce";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertTrue(result);

        a = "abcde";
        b = "abcce";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "abcde";
        b = "abccd";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "abcdc";
        b = "abccf";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "abcdc";
        b = "abccc";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = null;
        b = "ab";
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);

        a = "ab";
        b = null;
        result = buddyStringsSolution.buddyStrings(a, b);
        Assert.assertFalse(result);
    }
}