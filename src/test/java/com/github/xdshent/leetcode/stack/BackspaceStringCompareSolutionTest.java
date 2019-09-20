package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author xdshen
 */
public class BackspaceStringCompareSolutionTest {

    private BackspaceStringCompareSolution backspaceStringCompareSolution;
    private String S;
    private String T;

    @Before
    public void setUp() throws Exception {
        backspaceStringCompareSolution = new BackspaceStringCompareSolution();
        S = "ab#c";
        T = "ad#c";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void backspaceCompareFirst() {
        boolean result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertTrue(result);

        S = "ab##";
        T = "c#d#";
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertTrue(result);

        S = "a#c";
        T = "b";
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertFalse(result);

        S = "a#c";
        T = null;
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertFalse(result);

        S = "###";
        T = "###";
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertTrue(result);

        S = null;
        T = "b";
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertFalse(result);

        S = null;
        T = null;
        result = backspaceStringCompareSolution.backspaceCompareFirst(S, T);
        assertTrue(result);
    }

    @Test
    public void backspaceCompareSecond() {
        boolean result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);

        S = "ab##";
        T = "c#d#";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);

        S = "ab##";
        T = "";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);

        S = "";
        T = "c#d#";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);

        S = "a#c";
        T = "b";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = "ac#";
        T = "b#";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = "a#c";
        T = "vb#";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = "ac#";
        T = "vb#";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = "###";
        T = "###";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);

        S = "###";
        T = "bbbb###";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = "a#c";
        T = null;
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = null;
        T = "b";
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertFalse(result);

        S = null;
        T = null;
        result = backspaceStringCompareSolution.backspaceCompareSecond(S, T);
        assertTrue(result);
    }
}