package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberSolutionTest {

    private PalindromeNumberSolution palindromeNumberSolution;

    @Before
    public void setUp() throws Exception {
        palindromeNumberSolution = new PalindromeNumberSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindrome() {
        int x = 121;
        boolean result = palindromeNumberSolution.isPalindrome(x);
        Assert.assertTrue(result);

        x = -121;
        result = palindromeNumberSolution.isPalindrome(x);
        Assert.assertFalse(result);

        x = 60;
        result = palindromeNumberSolution.isPalindrome(x);
        Assert.assertFalse(result);

        x = 0;
        result = palindromeNumberSolution.isPalindrome(x);
        Assert.assertTrue(result);

        x = 123;
        result = palindromeNumberSolution.isPalindrome(x);
        Assert.assertFalse(result);
    }
}