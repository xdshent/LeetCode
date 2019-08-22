package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueMorseCodeWordsSolutionTest {

    private UniqueMorseCodeWordsSolution uniqueMorseCodeWordsSolution;
    private String[] words;

    @Before
    public void setUp() throws Exception {
        uniqueMorseCodeWordsSolution = new UniqueMorseCodeWordsSolution();
        words = new String[]{"gin", "zen", "gig", "msg"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void uniqueMorseRepresentations() {
        int result = uniqueMorseCodeWordsSolution.uniqueMorseRepresentations(words);
        int expected = 2;
        Assert.assertEquals(expected, result);

        words = new String[]{};
        result = uniqueMorseCodeWordsSolution.uniqueMorseRepresentations(words);
        expected = 0;
        Assert.assertEquals(expected, result);

        words = null;
        result = uniqueMorseCodeWordsSolution.uniqueMorseRepresentations(words);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}