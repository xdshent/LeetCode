package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsSubsequenceSolutionTest {

    private IsSubsequenceSolution isSubsequenceSolution;
    private String s;
    private String t;

    @Before
    public void setUp() throws Exception {
        isSubsequenceSolution = new IsSubsequenceSolution();
        s = "abc";
        t = "ahbgdc";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isSubsequence() {
        boolean result = isSubsequenceSolution.isSubsequence(s, t);
        Assert.assertTrue(result);

        s = "axc";
        t = "ahbgdc";
        result = isSubsequenceSolution.isSubsequence(s, t);
        Assert.assertFalse(result);
    }
}