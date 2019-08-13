package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OccurrencesAfterBigramSolutionTest {

    private OccurrencesAfterBigramSolution occurrencesAfterBigramSolution;
    private String text;
    private String first;
    private String second;

    @Before
    public void setUp() throws Exception {
        occurrencesAfterBigramSolution = new OccurrencesAfterBigramSolution();
        text = "alice is a good girl she is a good student";
        first = "a";
        second = "good";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findOcurrences() {
        String[] result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        String[] expected = new String[]{"girl", "student"};
        Assert.assertArrayEquals(expected, result);

        text = "we will we will rock you";
        first = "we";
        second = "will";
        result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        expected = new String[]{"we", "rock"};
        Assert.assertArrayEquals(expected, result);

        text = "we will we will rock you";
        first = "we";
        second = "rock";
        result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result);

        text = "we will we will rock you";
        first = "you";
        second = "rock";
        result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result);

        text = "";
        first = "we";
        second = "will";
        result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result);

        text = null;
        first = "we";
        second = "will";
        result = occurrencesAfterBigramSolution.findOcurrences(text, first, second);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result);
    }
}