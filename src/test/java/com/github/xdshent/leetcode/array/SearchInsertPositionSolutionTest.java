package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionSolutionTest {

    private SearchInsertPositionSolution searchInsertPositionSolution;
    private int[] array;
    private int target;

    @Before
    public void setUp() throws Exception {
        searchInsertPositionSolution = new SearchInsertPositionSolution();
        array = new int[]{1, 3, 5, 7, 9};
        target = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchInsert() {
        int result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(1, result);

        target = 6;
        result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(3, result);

        target = 0;
        result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(0, result);

        target = 10;
        result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(5, result);

        target = 3;
        array = null;
        result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(0, result);

        target = 3;
        array = new int[]{};
        result = searchInsertPositionSolution.searchInsert(array, target);
        Assert.assertEquals(0, result);
    }
}