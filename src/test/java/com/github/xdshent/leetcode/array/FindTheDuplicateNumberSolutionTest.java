package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheDuplicateNumberSolutionTest {

    private int[] array;
    private FindTheDuplicateNumberSolution findTheDuplicateNumberSolution;

    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 3, 4, 2, 2};
        findTheDuplicateNumberSolution = new FindTheDuplicateNumberSolution();
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void findDuplicateFirst() {
        int result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(2, result);

        array = new int[]{3, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(3, result);

        array = new int[]{5, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(-1, result);

        array = null;
        result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(-1, result);

        array = new int[]{};
        result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(-1, result);

        array = new int[]{1};
        result = findTheDuplicateNumberSolution.findDuplicateFirst(array);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findDuplicateSecond() {
        int result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(2, result);

        array = new int[]{3, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(3, result);

        array = new int[]{5, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(-1, result);

        array = new int[]{3, 1, 1, 2};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(1, result);

        array = new int[]{4, 1, 3, 2};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(-1, result);

        array = null;
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(-1, result);

        array = new int[]{};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(-1, result);

        array = new int[]{1};
        result = findTheDuplicateNumberSolution.findDuplicateSecond(array);
        Assert.assertEquals(-1, result);
    }
}