package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongPressedNameSolutionTest {

    private LongPressedNameSolution longPressedNameSolution;
    private String name;
    private String typed;

    @Before
    public void setUp() throws Exception {
        longPressedNameSolution = new LongPressedNameSolution();
        name = "alex";
        typed = "aaleex";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isLongPressedName() {
        boolean result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertTrue(result);

        name = "saeed";
        typed = "ssaaedd";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "leelee";
        typed = "lleeelee";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertTrue(result);

        name = "laiden";
        typed = "laiden";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertTrue(result);

        name = "laidem";
        typed = "laiden";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "laiden";
        typed = "laidennv";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "leetcode";
        typed = "leetcodddd";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "laidenv";
        typed = "laiden";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "";
        typed = "laiden";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);

        name = "vaiden";
        typed = "laiden";
        result = longPressedNameSolution.isLongPressedName(name, typed);
        Assert.assertFalse(result);
    }
}