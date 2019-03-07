package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDuplicateNumberSolutionTest {

    private int[] array;

    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 3, 4, 2, 2};
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void findDuplicate() {
        int result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(2, result);

        array = new int[]{3, 1, 3, 4, 2};
        result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(3, result);

        array = new int[]{5, 1, 3, 4, 2};
        result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = null;
        result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = new int[]{};
        result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);

        array = new int[]{1};
        result = FindTheDuplicateNumberSolution.findDuplicate(array);
        Assert.assertEquals(-1, result);
    }
}