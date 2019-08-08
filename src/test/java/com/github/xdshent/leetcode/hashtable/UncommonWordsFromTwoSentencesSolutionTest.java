package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UncommonWordsFromTwoSentencesSolutionTest {

    private UncommonWordsFromTwoSentencesSolution uncommonWordsFromTwoSentencesSolution;
    private String a;
    private String b;

    @Before
    public void setUp() throws Exception {
        uncommonWordsFromTwoSentencesSolution = new UncommonWordsFromTwoSentencesSolution();
        a = "this apple is sweet";
        b = "this apple is sour";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void uncommonFromSentences() {
        String[] result = uncommonWordsFromTwoSentencesSolution.uncommonFromSentences(a, b);
        String[] expected = new String[]{"sweet", "sour"};
        Assert.assertArrayEquals(expected, result);

        a = "apple apple";
        b = "banana";
        result = uncommonWordsFromTwoSentencesSolution.uncommonFromSentences(a, b);
        expected = new String[]{"banana"};
        Assert.assertArrayEquals(expected, result);
    }
}