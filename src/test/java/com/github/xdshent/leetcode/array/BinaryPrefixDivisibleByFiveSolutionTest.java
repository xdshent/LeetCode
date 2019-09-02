package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BinaryPrefixDivisibleByFiveSolutionTest {

    private BinaryPrefixDivisibleByFiveSolution binaryPrefixDivisibleByFiveSolution;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        binaryPrefixDivisibleByFiveSolution = new BinaryPrefixDivisibleByFiveSolution();
        nums = new int[]{0, 1, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void prefixesDivBy5() {
        List<Boolean> result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        Boolean[] expected = new Boolean[]{true, false, false};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));

        nums = new int[]{1, 1, 1};
        result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        expected = new Boolean[]{false, false, false};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));

        nums = new int[]{0, 1, 1, 1, 1, 1};
        result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        expected = new Boolean[]{true, false, false, false, true, false};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));

        nums = new int[]{1, 1, 1, 0, 1};
        result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        expected = new Boolean[]{false, false, false, false, false};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));

        nums = new int[]{};
        result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        expected = new Boolean[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));

        nums = null;
        result = binaryPrefixDivisibleByFiveSolution.prefixesDivBy5(nums);
        expected = new Boolean[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Boolean[0]));
    }
}