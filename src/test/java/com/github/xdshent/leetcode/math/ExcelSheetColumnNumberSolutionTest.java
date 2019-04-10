package com.github.xdshent.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcelSheetColumnNumberSolutionTest {

    private ExcelSheetColumnNumberSolution excelSheetColumnNumberSolution;
    private String title;

    @Before
    public void setUp() throws Exception {
        excelSheetColumnNumberSolution = new ExcelSheetColumnNumberSolution();
        title = "A";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void titleToNumber() {
        int result = excelSheetColumnNumberSolution.titleToNumber(title);
        int expected = 1;
        Assert.assertEquals(expected, result);

        title = "B";
        result = excelSheetColumnNumberSolution.titleToNumber(title);
        expected = 2;
        Assert.assertEquals(expected, result);

        title = "AB";
        result = excelSheetColumnNumberSolution.titleToNumber(title);
        expected = 28;
        Assert.assertEquals(expected, result);

        title = "ZY";
        result = excelSheetColumnNumberSolution.titleToNumber(title);
        expected = 701;
        Assert.assertEquals(expected, result);

        title = "";
        result = excelSheetColumnNumberSolution.titleToNumber(title);
        expected = 0;
        Assert.assertEquals(expected, result);

        title = null;
        result = excelSheetColumnNumberSolution.titleToNumber(title);
        expected = 0;
        Assert.assertEquals(expected, result);
    }
}