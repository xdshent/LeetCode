package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInStringSolutionTest {

    private ReverseWordsInStringSolution reverseWordsInStringSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        reverseWordsInStringSolution = new ReverseWordsInStringSolution();
        s = "the sky is blue";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseWordsSecond() {
        String result = reverseWordsInStringSolution.reverseWordsSecond(s);
        String expected = "blue is sky the";
        Assert.assertEquals(expected, result);

        s = "  hello world!  ";
        result = reverseWordsInStringSolution.reverseWordsSecond(s);
        expected = "world! hello";
        Assert.assertEquals(expected, result);

        s = "a good   example";
        result = reverseWordsInStringSolution.reverseWordsSecond(s);
        expected = "example good a";
        Assert.assertEquals(expected, result);

        s = "";
        result = reverseWordsInStringSolution.reverseWordsSecond(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = " ";
        result = reverseWordsInStringSolution.reverseWordsSecond(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = null;
        result = reverseWordsInStringSolution.reverseWordsSecond(s);
        Assert.assertNull(result);

    }

    @Test
    public void reverseWordsFirst() {
        String result = reverseWordsInStringSolution.reverseWordsFirst(s);
        String expected = "blue is sky the";
        Assert.assertEquals(expected, result);

        s = "  hello world!  ";
        result = reverseWordsInStringSolution.reverseWordsFirst(s);
        expected = "world! hello";
        Assert.assertEquals(expected, result);

        s = "a good   example";
        result = reverseWordsInStringSolution.reverseWordsFirst(s);
        expected = "example good a";
        Assert.assertEquals(expected, result);

        s = "";
        result = reverseWordsInStringSolution.reverseWordsFirst(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = " ";
        result = reverseWordsInStringSolution.reverseWordsFirst(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = null;
        result = reverseWordsInStringSolution.reverseWordsFirst(s);
        Assert.assertNull(result);
    }
}