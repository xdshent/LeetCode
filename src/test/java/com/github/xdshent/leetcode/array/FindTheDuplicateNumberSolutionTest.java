package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void findDuplicate() {

        int result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(2, result);

        array = new int[]{3, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(3, result);

        array = new int[]{5, 1, 3, 4, 2};
        result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = null;
        result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = new int[]{};
        result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = new int[]{1};
        result = findTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);
    }
}