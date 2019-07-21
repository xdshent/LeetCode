package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountPrimesSolutionTest {

    private CountPrimesSolution countPrimesSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        countPrimesSolution = new CountPrimesSolution();
        n = 5;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countPrimes() {
        int result = countPrimesSolution.countPrimes(n);
        int expected = 2;
        Assert.assertEquals(expected, result);

        n = 10;
        result = countPrimesSolution.countPrimes(n);
        expected = 4;
        Assert.assertEquals(expected, result);

        n = 2;
        result = countPrimesSolution.countPrimes(n);
        expected = 0;
        Assert.assertEquals(expected, result);

        n = 200;
        result = countPrimesSolution.countPrimes(n);
        expected = 46;
        Assert.assertEquals(expected, result);
    }
}