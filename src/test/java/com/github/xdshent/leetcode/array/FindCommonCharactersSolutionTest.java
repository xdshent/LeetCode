package com.github.xdshent.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindCommonCharactersSolutionTest {

    private FindCommonCharactersSolution findCommonCharactersSolution;
    private String[] strings;

    @Before
    public void setUp() throws Exception {
        findCommonCharactersSolution = new FindCommonCharactersSolution();
        strings = new String[]{"bella", "label", "roller"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void commonChars() {
        List<String> result = findCommonCharactersSolution.commonChars(strings);
        String[] expected = {"e", "l", "l"};
        Assert.assertArrayEquals(expected, result.toArray(new String[0]));

        strings = new String[]{"cool", "lock", "cook"};
        result = findCommonCharactersSolution.commonChars(strings);
        expected = new String[]{"c", "o"};
        Assert.assertArrayEquals(expected, result.toArray(new String[0]));

        strings = new String[]{"tom", "lock", "cook"};
        result = findCommonCharactersSolution.commonChars(strings);
        expected = new String[]{"o"};
        Assert.assertArrayEquals(expected, result.toArray(new String[0]));

        strings = new String[]{};
        result = findCommonCharactersSolution.commonChars(strings);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result.toArray(new String[0]));

        strings = null;
        result = findCommonCharactersSolution.commonChars(strings);
        expected = new String[]{};
        Assert.assertArrayEquals(expected, result.toArray(new String[0]));
    }
}