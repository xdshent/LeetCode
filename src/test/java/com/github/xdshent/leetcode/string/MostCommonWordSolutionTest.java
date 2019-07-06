package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MostCommonWordSolutionTest {

    private MostCommonWordSolution mostCommonWordSolution;
    private String paragraph;
    private String[] banned;

    @Before
    public void setUp() throws Exception {
        mostCommonWordSolution = new MostCommonWordSolution();
        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        banned = new String[]{"hit"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mostCommonWord() {
        String result = mostCommonWordSolution.mostCommonWord(paragraph, banned);
        String expected = "ball";
        Assert.assertEquals(expected, result);

        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        banned = new String[]{"ball"};
        result = mostCommonWordSolution.mostCommonWord(paragraph, banned);
        expected = "hit";
        Assert.assertEquals(expected, result);

        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        banned = new String[]{"ball", "hit"};
        result = mostCommonWordSolution.mostCommonWord(paragraph, banned);
        expected = "bob";
        Assert.assertEquals(expected, result);
    }
}