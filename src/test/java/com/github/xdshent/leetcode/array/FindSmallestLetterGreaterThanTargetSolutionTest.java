package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetSolutionTest {

    private FindSmallestLetterGreaterThanTargetSolution findSmallestLetterGreaterThanTargetSolution;
    private char[] letters;
    private char target;

    @Before
    public void setUp() throws Exception {
        findSmallestLetterGreaterThanTargetSolution = new FindSmallestLetterGreaterThanTargetSolution();
        letters = new char[]{'c', 'f', 'j'};
        target = 'a';
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nextGreatestLetter() {
        char result = findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(letters, target);
        char expected = 'c';
        Assert.assertEquals(expected, result);

        letters = new char[]{'c', 'f', 'j'};
        target = 'c';
        result = findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(letters, target);
        expected = 'f';
        Assert.assertEquals(expected, result);

        letters = new char[]{'c', 'f', 'j'};
        target = 'g';
        result = findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(letters, target);
        expected = 'j';
        Assert.assertEquals(expected, result);

        letters = new char[]{'c', 'f', 'j'};
        target = 'j';
        result = findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(letters, target);
        expected = 'c';
        Assert.assertEquals(expected, result);

        letters = new char[]{'c', 'f', 'j'};
        target = 'k';
        result = findSmallestLetterGreaterThanTargetSolution.nextGreatestLetter(letters, target);
        expected = 'c';
        Assert.assertEquals(expected, result);
    }
}