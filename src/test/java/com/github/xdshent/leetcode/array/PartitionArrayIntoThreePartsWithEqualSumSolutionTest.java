package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartitionArrayIntoThreePartsWithEqualSumSolutionTest {

    private PartitionArrayIntoThreePartsWithEqualSumSolution partitionArrayIntoThreePartsWithEqualSumSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        partitionArrayIntoThreePartsWithEqualSumSolution = new PartitionArrayIntoThreePartsWithEqualSumSolution();
        nums = new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void canThreePartsEqualSum() {
        boolean result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertTrue(result);

        nums = new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertTrue(result);

        nums = new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertTrue(result);

        nums = new int[]{1, 1, 1, 2, 3, 1};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertFalse(result);

        nums = new int[]{1, 1, 1, 2, 1, 2};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertFalse(result);

        nums = new int[]{3, 3, 1, 2, 1};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertFalse(result);

        nums = new int[]{3, 3};
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertFalse(result);

        nums = null;
        result = partitionArrayIntoThreePartsWithEqualSumSolution.canThreePartsEqualSum(nums);
        Assert.assertFalse(result);
    }
}