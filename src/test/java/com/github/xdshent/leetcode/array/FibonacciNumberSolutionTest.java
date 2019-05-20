package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciNumberSolutionTest {

    private FibonacciNumberSolution fibonacciNumberSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        fibonacciNumberSolution = new FibonacciNumberSolution();
        n = 2;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibFirst() {
        int result = fibonacciNumberSolution.fibFirst(n);
        int expected = 1;
        Assert.assertEquals(expected, result);

        n = 3;
        result = fibonacciNumberSolution.fibFirst(n);
        expected = 2;
        Assert.assertEquals(expected, result);

        n = 4;
        result = fibonacciNumberSolution.fibFirst(n);
        expected = 3;
        Assert.assertEquals(expected, result);

        n = 1;
        result = fibonacciNumberSolution.fibFirst(n);
        expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fibSecond() {
        int result = fibonacciNumberSolution.fibSecond(n);
        int expected = 1;
        Assert.assertEquals(expected, result);

        n = 3;
        result = fibonacciNumberSolution.fibSecond(n);
        expected = 2;
        Assert.assertEquals(expected, result);

        n = 4;
        result = fibonacciNumberSolution.fibSecond(n);
        expected = 3;
        Assert.assertEquals(expected, result);

        n = 1;
        result = fibonacciNumberSolution.fibSecond(n);
        expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fibThird() {
        int result = fibonacciNumberSolution.fibThird(n);
        int expected = 1;
        Assert.assertEquals(expected, result);

        n = 3;
        result = fibonacciNumberSolution.fibThird(n);
        expected = 2;
        Assert.assertEquals(expected, result);

        n = 4;
        result = fibonacciNumberSolution.fibThird(n);
        expected = 3;
        Assert.assertEquals(expected, result);

        n = 1;
        result = fibonacciNumberSolution.fibThird(n);
        expected = 1;
        Assert.assertEquals(expected, result);
    }
}