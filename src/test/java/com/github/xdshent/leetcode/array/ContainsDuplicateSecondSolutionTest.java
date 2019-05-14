package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateSecondSolutionTest {

    private ContainsDuplicateSecondSolution containsDuplicateSolution;
    private int[] nums;
    private int k;

    @Before
    public void setUp() throws Exception {
        containsDuplicateSolution = new ContainsDuplicateSecondSolution();
        nums = new int[]{1, 2, 3, 1};
        k = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void containsNearbyDuplicate() {
        boolean result = containsDuplicateSolution.containsNearbyDuplicate(nums, k);
        Assert.assertTrue(result);

        nums = new int[]{1, 0, 1, 1};
        k = 1;
        result = containsDuplicateSolution.containsNearbyDuplicate(nums, k);
        Assert.assertTrue(result);

        nums = new int[]{1, 2, 3, 1, 2, 3};
        k = 2;
        result = containsDuplicateSolution.containsNearbyDuplicate(nums, k);
        Assert.assertFalse(result);

        nums = new int[]{};
        k = 2;
        result = containsDuplicateSolution.containsNearbyDuplicate(nums, k);
        Assert.assertFalse(result);

        nums = null;
        k = 2;
        result = containsDuplicateSolution.containsNearbyDuplicate(nums, k);
        Assert.assertFalse(result);
    }
}