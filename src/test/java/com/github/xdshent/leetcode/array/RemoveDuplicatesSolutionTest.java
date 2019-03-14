package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesSolutionTest {

    private int[] array;
    private RemoveDuplicatesSolution removeDuplicatesSolution;

    @Before
    public void setUp() throws Exception {
        array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicatesSolution = new RemoveDuplicatesSolution();
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void removeDuplicates() {
        int newLength = removeDuplicatesSolution.removeDuplicates(array);
        int[] expected = {0, 1, 2, 3, 4};
        int matchedLength = getMatchedLength(expected, array);
        Assert.assertEquals(matchedLength, newLength);

        array = new int[]{1};
        expected = new int[]{1};
        newLength = removeDuplicatesSolution.removeDuplicates(array);
        matchedLength = getMatchedLength(expected, array);
        Assert.assertEquals(matchedLength, newLength);

        array = null;
        int expectedNum = 1;
        newLength = removeDuplicatesSolution.removeDuplicates(array);
        Assert.assertEquals(expectedNum, newLength);
    }

    private int getMatchedLength(int[] expectedArray, int[] array) {
        int matchedLength = 0;
        for (int i = 0; i < expectedArray.length; i++) {
            if (array[i] == expectedArray[i]) {
                matchedLength++;
            }
        }
        return matchedLength;
    }
}