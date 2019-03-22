package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementSolutionTest {

    private RemoveElementSolution removeElementSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        removeElementSolution = new RemoveElementSolution();
        nums = new int[]{3, 2, 2, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeElement() {
        int result = removeElementSolution.removeElement(nums, 3);
        int expected = 2;
        Assert.assertEquals(expected, result);

        nums = null;
        result = removeElementSolution.removeElement(nums, 3);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{};
        result = removeElementSolution.removeElement(nums, 3);
        expected = 0;
        Assert.assertEquals(expected, result);

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        result = removeElementSolution.removeElement(nums, 2);
        expected = 5;
        Assert.assertEquals(expected, result);
    }
}