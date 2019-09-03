package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefangingAnIPAddressSolutionTest {

    private DefangingAnIPAddressSolution defangingAnIPAddressSolution;
    private String address;

    @Before
    public void setUp() throws Exception {
        defangingAnIPAddressSolution = new DefangingAnIPAddressSolution();
        address = "1.1.1.1";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void defangIPAddr() {
        String result = defangingAnIPAddressSolution.defangIPAddr(address);
        String expected = "1[.]1[.]1[.]1";
        Assert.assertEquals(expected, result);

        address = "255.100.50.0";
        result = defangingAnIPAddressSolution.defangIPAddr(address);
        expected = "255[.]100[.]50[.]0";
        Assert.assertEquals(expected, result);

        address = "";
        result = defangingAnIPAddressSolution.defangIPAddr(address);
        expected = "";
        Assert.assertEquals(expected, result);

        address = null;
        result = defangingAnIPAddressSolution.defangIPAddr(address);
        expected = "";
        Assert.assertEquals(expected, result);
    }
}