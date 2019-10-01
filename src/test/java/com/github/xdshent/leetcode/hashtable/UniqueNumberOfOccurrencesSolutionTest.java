package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueNumberOfOccurrencesSolutionTest {

    private UniqueNumberOfOccurrencesSolution uniqueNumberOfOccurrencesSolution;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        uniqueNumberOfOccurrencesSolution = new UniqueNumberOfOccurrencesSolution();
        array = new int[]{1, 2, 2, 1, 1, 3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void uniqueOccurrences() {
        boolean result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertTrue(result);

        array = new int[]{1, 2};
        result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertFalse(result);

        array = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertTrue(result);

        array = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 5};
        result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertFalse(result);

        array = new int[]{0};
        result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertTrue(result);

        array = null;
        result = uniqueNumberOfOccurrencesSolution.uniqueOccurrences(array);
        assertTrue(result);
    }
}