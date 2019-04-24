package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyNumberSolutionTest {

    private HappyNumberSolution happyNumberSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        happyNumberSolution = new HappyNumberSolution();
        n = 1;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isHappyFirst() {
        boolean result = happyNumberSolution.isHappyFirst(n);
        Assert.assertTrue(result);

        n = 19;
        result = happyNumberSolution.isHappyFirst(n);
        Assert.assertTrue(result);

        n = 21;
        result = happyNumberSolution.isHappyFirst(n);
        Assert.assertFalse(result);

        n = 33;
        result = happyNumberSolution.isHappyFirst(n);
        Assert.assertFalse(result);
    }

    @Test
    public void isHappySecond() {
        boolean result = happyNumberSolution.isHappySecond(n);
        Assert.assertTrue(result);

        n = 19;
        result = happyNumberSolution.isHappySecond(n);
        Assert.assertTrue(result);

        n = 21;
        result = happyNumberSolution.isHappySecond(n);
        Assert.assertFalse(result);

        n = 33;
        result = happyNumberSolution.isHappySecond(n);
        Assert.assertFalse(result);
    }
}