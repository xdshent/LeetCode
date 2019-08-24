package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreatestCommonDivisorOfStringsSolutionTest {

    private GreatestCommonDivisorOfStringsSolution greatestCommonDivisorOfStringsSolution;
    private String str1;
    private String str2;

    @Before
    public void setUp() throws Exception {
        greatestCommonDivisorOfStringsSolution = new GreatestCommonDivisorOfStringsSolution();
        str1 = "ABCABCABC";
        str2 = "ABC";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void gcdOfStrings() {
        String result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        String expected = "ABC";
        Assert.assertEquals(expected, result);

        str1 = "ABCD";
        str2 = "C";
        result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        expected = "";
        Assert.assertEquals(expected, result);

        str1 = "ABABAB";
        str2 = "ABAB";
        result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        expected = "AB";
        Assert.assertEquals(expected, result);

        str1 = "LEFT";
        str2 = "CODE";
        result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        expected = "";
        Assert.assertEquals(expected, result);

        str1 = "ABAB";
        str2 = "ABABAB";
        result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        expected = "AB";
        Assert.assertEquals(expected, result);

        str1 = "ABAB";
        str2 = "A";
        result = greatestCommonDivisorOfStringsSolution.gcdOfStrings(str1, str2);
        expected = "";
        Assert.assertEquals(expected, result);
    }
}