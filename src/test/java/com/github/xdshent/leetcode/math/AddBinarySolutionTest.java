package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBinarySolutionTest {

    private AddBinarySolution addBinarySolution;

    @Before
    public void setUp() throws Exception {
        addBinarySolution = new AddBinarySolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBinary() {
        String result = addBinarySolution.addBinary("11", "11");
        Assert.assertEquals("110", result);

        result = addBinarySolution.addBinary("1", "1");
        Assert.assertEquals("10", result);

        result = addBinarySolution.addBinary("100", "1101");
        Assert.assertEquals("10001", result);

        result = addBinarySolution.addBinary("1101", "100");
        Assert.assertEquals("10001", result);

        result = addBinarySolution.addBinary("1101", "10");
        Assert.assertEquals("1111", result);
    }
}