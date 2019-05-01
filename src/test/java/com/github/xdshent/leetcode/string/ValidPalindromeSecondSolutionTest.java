package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeSecondSolutionTest {

    private ValidPalindromeSecondSolution validPalindromeSecondSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        validPalindromeSecondSolution = new ValidPalindromeSecondSolution();
        s= "aba";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void validPalindrome() {
        boolean result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertTrue(result);

        s="abca";
        result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertTrue(result);

        s="abcbab";
        result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertTrue(result);

        s="vabcba";
        result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertTrue(result);

        s="abbbd";
        result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertFalse(result);

        s="acbbd";
        result= validPalindromeSecondSolution.validPalindrome(s);
        Assert.assertFalse(result);
    }
}