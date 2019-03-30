package com.github.xdshent.leetcode.math;

import com.github.xdshent.leetcode.math.AddDigitsSolution;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddDigitsSolutionTest {

    private AddDigitsSolution addDigitsSolution;

    @Before
    public void setUp() throws Exception {
        addDigitsSolution = new AddDigitsSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addDigits() {
        int result = addDigitsSolution.addDigits(15);
        Assert.assertEquals(6, result);

        result = addDigitsSolution.addDigits(8);
        Assert.assertEquals(8, result);

        result = addDigitsSolution.addDigits(9);
        Assert.assertEquals(9, result);

        result = addDigitsSolution.addDigits(18);
        Assert.assertEquals(9, result);

        result = addDigitsSolution.addDigits(19);
        Assert.assertEquals(1, result);

        result = addDigitsSolution.addDigits(56);
        Assert.assertEquals(2, result);
    }
}