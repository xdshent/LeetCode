package com.github.xdshent.leetcode.backtracking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class LetterCasePermutationSolutionTest {

    private LetterCasePermutationSolution letterCasePermutationSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        letterCasePermutationSolution = new LetterCasePermutationSolution();
        s = "a1b2";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void letterCasePermutationFirst() {
        List<String> result = letterCasePermutationSolution.letterCasePermutationFirst(s);
        String[] expected = new String[]{"A1B2", "A1b2", "a1B2", "a1b2"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "3z4";
        result = letterCasePermutationSolution.letterCasePermutationFirst(s);
        expected = new String[]{"3Z4", "3z4"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "12345";
        result = letterCasePermutationSolution.letterCasePermutationFirst(s);
        expected = new String[]{"12345"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "";
        result = letterCasePermutationSolution.letterCasePermutationFirst(s);
        expected = new String[]{};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = null;
        result = letterCasePermutationSolution.letterCasePermutationFirst(s);
        expected = new String[]{};
        assertArrayEquals(expected, result.toArray(new String[0]));
    }

    @Test
    public void letterCasePermutationSecond() {
        List<String> result = letterCasePermutationSolution.letterCasePermutationSecond(s);
        String[] expected = new String[]{"A1B2", "A1b2", "a1B2", "a1b2"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "3z4";
        result = letterCasePermutationSolution.letterCasePermutationSecond(s);
        expected = new String[]{"3Z4", "3z4"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "12345";
        result = letterCasePermutationSolution.letterCasePermutationSecond(s);
        expected = new String[]{"12345"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = "";
        result = letterCasePermutationSolution.letterCasePermutationSecond(s);
        expected = new String[]{};
        assertArrayEquals(expected, result.toArray(new String[0]));

        s = null;
        result = letterCasePermutationSolution.letterCasePermutationSecond(s);
        expected = new String[]{};
        assertArrayEquals(expected, result.toArray(new String[0]));
    }
}