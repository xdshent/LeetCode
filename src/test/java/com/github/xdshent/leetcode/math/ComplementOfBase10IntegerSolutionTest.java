package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplementOfBase10IntegerSolutionTest {

    private ComplementOfBase10IntegerSolution complementOfBase10IntegerSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        complementOfBase10IntegerSolution = new ComplementOfBase10IntegerSolution();
        n = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void bitwiseComplement() {
        int result = complementOfBase10IntegerSolution.bitwiseComplement(n);
        int expected = 2;
        Assert.assertEquals(expected, result);

        n = 7;
        result = complementOfBase10IntegerSolution.bitwiseComplement(n);
        expected = 0;
        Assert.assertEquals(expected, result);

        n = 10;
        result = complementOfBase10IntegerSolution.bitwiseComplement(n);
        expected = 5;
        Assert.assertEquals(expected, result);

        n = 0;
        result = complementOfBase10IntegerSolution.bitwiseComplement(n);
        expected = 1;
        Assert.assertEquals(expected, result);
    }
}