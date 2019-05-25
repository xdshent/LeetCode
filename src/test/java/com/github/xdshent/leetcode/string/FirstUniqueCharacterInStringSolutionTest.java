package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstUniqueCharacterInStringSolutionTest {

    private FirstUniqueCharacterInStringSolution firstUniqueCharacterInStringSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        firstUniqueCharacterInStringSolution = new FirstUniqueCharacterInStringSolution();
        s = "leetcode";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void firstUniqChar() {
        int result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        int expected = 0;
        Assert.assertEquals(expected, result);

        s = "loveleetcode";
        result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        expected = 2;
        Assert.assertEquals(expected, result);

        s = "";
        result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        expected = -1;
        Assert.assertEquals(expected, result);

        s = null;
        result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        expected = -1;
        Assert.assertEquals(expected, result);

        s = "l";
        result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        expected = 0;
        Assert.assertEquals(expected, result);

        s = "lloovvee";
        result = firstUniqueCharacterInStringSolution.firstUniqChar(s);
        expected = -1;
        Assert.assertEquals(expected, result);
    }
}