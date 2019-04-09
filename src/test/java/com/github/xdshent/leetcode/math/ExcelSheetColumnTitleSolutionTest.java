package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcelSheetColumnTitleSolutionTest {

    private ExcelSheetColumnTitleSolution excelSheetColumnTitleSolution;
    private int n;

    @Before
    public void setUp() throws Exception {
        excelSheetColumnTitleSolution = new ExcelSheetColumnTitleSolution();
        n = 3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertToTitle() {
        String result = excelSheetColumnTitleSolution.convertToTitle(n);
        String expected = "C";
        Assert.assertEquals(expected, result);

        n = 27;
        result = excelSheetColumnTitleSolution.convertToTitle(n);
        expected = "AA";
        Assert.assertEquals(expected, result);

        n = 28;
        result = excelSheetColumnTitleSolution.convertToTitle(n);
        expected = "AB";
        Assert.assertEquals(expected, result);

        n = 0;
        result = excelSheetColumnTitleSolution.convertToTitle(n);
        expected = "";
        Assert.assertEquals(expected, result);
    }
}