package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringThreeSolutionTest {

    private ReverseStringThreeSolution reverseStringThreeSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        reverseStringThreeSolution = new ReverseStringThreeSolution();
        s = "Let's take LeetCode contest";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseWords() {
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String result = reverseStringThreeSolution.reverseWords(s);
        Assert.assertEquals(expected, result);

        s = "we are young";
        expected = "ew era gnuoy";
        result = reverseStringThreeSolution.reverseWords(s);
        Assert.assertEquals(expected, result);

        s = "";
        expected = "";
        result = reverseStringThreeSolution.reverseWords(s);
        Assert.assertEquals(expected, result);

        s = null;
        expected = null;
        result = reverseStringThreeSolution.reverseWords(s);
        Assert.assertEquals(expected, result);
    }
}