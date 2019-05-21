package com.github.xdshent.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberComplementSolutionTest {

    private NumberComplementSolution numberComplementSolution;
    private int num;

    @Before
    public void setUp() throws Exception {
        numberComplementSolution = new NumberComplementSolution();
        num = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findComplement() {
        int result = numberComplementSolution.findComplement(num);
        int expected = 2;
        Assert.assertEquals(expected, result);

        num = 1;
        result = numberComplementSolution.findComplement(num);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}