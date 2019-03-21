package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberSolutionTest {

    private MissingNumberSolution missingNumberSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        missingNumberSolution = new MissingNumberSolution();
        array = new int[]{3, 0, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void missingNumberFirst() {
        int expected = 2;
        int result = missingNumberSolution.missingNumberFirst(array);
        Assert.assertEquals(expected, result);

        expected = 8;
        array = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        result = missingNumberSolution.missingNumberFirst(array);
        Assert.assertEquals(expected, result);

        expected = 1;
        array = new int[]{0};
        result = missingNumberSolution.missingNumberFirst(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void missingNumberSecond() {
        int expected = 2;
        int result = missingNumberSolution.missingNumberSecond(array);
        Assert.assertEquals(expected, result);

        expected = 8;
        array = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        result = missingNumberSolution.missingNumberSecond(array);
        Assert.assertEquals(expected, result);

        expected = 1;
        array = new int[]{0};
        result = missingNumberSolution.missingNumberSecond(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void missingNumberThird() {
        int expected = 2;
        int result = missingNumberSolution.missingNumberThird(array);
        Assert.assertEquals(expected, result);

        expected = 8;
        array = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        result = missingNumberSolution.missingNumberThird(array);
        Assert.assertEquals(expected, result);

        expected = 1;
        array = new int[]{0};
        result = missingNumberSolution.missingNumberThird(array);
        Assert.assertEquals(expected, result);
    }
}