package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortArrayByParitySecondSolutionTest {

    private SortArrayByParitySecondSolution sortArrayByParitySecondSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        sortArrayByParitySecondSolution = new SortArrayByParitySecondSolution();
        nums = new int[]{4, 2, 5, 7};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortArrayByParityII() {
        int[] result = sortArrayByParitySecondSolution.sortArrayByParityII(nums);
        int[] expected = new int[]{4, 5, 2, 7};
        Assert.assertArrayEquals(expected, result);

        nums = new int[]{1};
        result = sortArrayByParitySecondSolution.sortArrayByParityII(nums);
        expected = new int[]{1};
        Assert.assertArrayEquals(expected, result);

        nums = null;
        result = sortArrayByParitySecondSolution.sortArrayByParityII(nums);
        Assert.assertNull(result);
    }
}