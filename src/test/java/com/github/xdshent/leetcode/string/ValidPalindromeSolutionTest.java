package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeSolutionTest {

    private ValidPalindromeSolution validPalindromeSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        validPalindromeSolution = new ValidPalindromeSolution();
        s= "A man, a plan, a canal: Panama";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindrome() {
        boolean result = validPalindromeSolution.isPalindrome(s);
        Assert.assertTrue(result);

        s="Ana";
        result = validPalindromeSolution.isPalindrome(s);
        Assert.assertTrue(result);

        s="A man, a plan";
        result = validPalindromeSolution.isPalindrome(s);
        Assert.assertFalse(result);

        s= "";
        result = validPalindromeSolution.isPalindrome(s);
        Assert.assertTrue(result);

        s= null;
        result= validPalindromeSolution.isPalindrome(s);
        Assert.assertTrue(result);
    }
}