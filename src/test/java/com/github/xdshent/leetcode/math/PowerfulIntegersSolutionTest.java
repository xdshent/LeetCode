package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PowerfulIntegersSolutionTest {

    private PowerfulIntegersSolution powerfulIntegersSolution;
    private int x;
    private int y;
    private int bound;

    @Before
    public void setUp() throws Exception {
        powerfulIntegersSolution = new PowerfulIntegersSolution();
        x = 2;
        y = 3;
        bound = 10;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void powerfulIntegers() {
        List<Integer> result = powerfulIntegersSolution.powerfulIntegers(x, y, bound);
        Integer[] expected = new Integer[]{2, 3, 4, 5, 7, 9, 10};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        x = 3;
        y = 5;
        bound = 15;
        result = powerfulIntegersSolution.powerfulIntegers(x, y, bound);
        expected = new Integer[]{2, 4, 6, 8, 10, 14};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        x = 3;
        y = 1;
        bound = 15;
        result = powerfulIntegersSolution.powerfulIntegers(x, y, bound);
        expected = new Integer[]{2, 4, 10};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        x = 1;
        y = 5;
        bound = 15;
        result = powerfulIntegersSolution.powerfulIntegers(x, y, bound);
        expected = new Integer[]{2, 6};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }
}