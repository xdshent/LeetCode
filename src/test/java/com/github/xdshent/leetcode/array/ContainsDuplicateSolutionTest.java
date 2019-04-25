package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateSolutionTest {

    private ContainsDuplicateSolution containsDuplicateSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        containsDuplicateSolution = new ContainsDuplicateSolution();
        array = new int[]{1, 2, 3, 1};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void containsDuplicateFirst() {
        boolean result = containsDuplicateSolution.containsDuplicateFirst(array);
        Assert.assertTrue(result);

        array = new int[]{1, 2, 3};
        result = containsDuplicateSolution.containsDuplicateFirst(array);
        Assert.assertFalse(result);

        array = new int[]{};
        result = containsDuplicateSolution.containsDuplicateFirst(array);
        Assert.assertFalse(result);

        array = null;
        result = containsDuplicateSolution.containsDuplicateFirst(array);
        Assert.assertFalse(result);
    }

    @Test
    public void containsDuplicateSecond() {
        boolean result = containsDuplicateSolution.containsDuplicateSecond(array);
        Assert.assertTrue(result);

        array = new int[]{1, 2, 3};
        result = containsDuplicateSolution.containsDuplicateSecond(array);
        Assert.assertFalse(result);

        array = new int[]{};
        result = containsDuplicateSolution.containsDuplicateSecond(array);
        Assert.assertFalse(result);

        array = null;
        result = containsDuplicateSolution.containsDuplicateSecond(array);
        Assert.assertFalse(result);
    }
}