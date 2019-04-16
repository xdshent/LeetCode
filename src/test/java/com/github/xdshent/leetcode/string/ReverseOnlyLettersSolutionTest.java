package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseOnlyLettersSolutionTest {

    private ReverseOnlyLettersSolution reverseOnlyLettersSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        reverseOnlyLettersSolution = new ReverseOnlyLettersSolution();
        s = "ab-cd";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseOnlyLetters() {
        String expected = "dc-ba";
        String result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = "a-bC-dEf-ghIj";
        expected = "j-Ih-gfE-dCba";
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = "Test1ng-Leet=code-Q!";
        expected = "Qedo1ct-eeLg=ntse-T!";
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = "!----!";
        expected = "!----!";
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = "l----!";
        expected = "l----!";
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = "";
        expected = "";
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);

        s = null;
        expected = null;
        result = reverseOnlyLettersSolution.reverseOnlyLetters(s);
        Assert.assertEquals(expected, result);
    }
}