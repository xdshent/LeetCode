package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseVowelsOfAStringSolutionTest {

    private ReverseVowelsOfStringSolution reverseVowelsOfAStringSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        reverseVowelsOfAStringSolution = new ReverseVowelsOfStringSolution();
        s = "hello";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseVowels() {
        String expected = "holle";
        String result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);

        s = "leetcode";
        expected = "leotcede";
        result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);

        s = "aeiou";
        expected = "uoiea";
        result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);

        s = "ibcdfo";
        expected = "obcdfi";
        result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);

        s = "";
        expected = "";
        result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);

        s = null;
        expected = null;
        result = reverseVowelsOfAStringSolution.reverseVowels(s);
        Assert.assertEquals(expected, result);
    }
}