package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheDifferenceSolutionTest {

    private FindTheDifferenceSolution findTheDuplicateNumberSolution;
    private String s;
    private String t;

    @Before
    public void setUp() throws Exception {
        findTheDuplicateNumberSolution = new FindTheDifferenceSolution();
        s = "abc";
        t = "dacb";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findTheDifference() {
        char result = findTheDuplicateNumberSolution.findTheDifference(s, t);
        char expected = 'd';
        Assert.assertEquals(expected, result);

        s = "asdvb";
        t = "axdvbs";
        result = findTheDuplicateNumberSolution.findTheDifference(s, t);
        expected = 'x';
        Assert.assertEquals(expected, result);
    }
}