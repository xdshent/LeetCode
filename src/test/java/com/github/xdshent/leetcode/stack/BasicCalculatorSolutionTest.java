package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorSolutionTest {

    private BasicCalculatorSolution basicCalculatorSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        basicCalculatorSolution = new BasicCalculatorSolution();
        s = "1 + 1";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculate() {
        int result = basicCalculatorSolution.calculate(s);
        int expected = 2;
        assertEquals(expected, result);

        s = "2-1+2";
        result = basicCalculatorSolution.calculate(s);
        expected = 3;
        assertEquals(expected, result);

        s = "(1+(4+5+2)-3)+(6+8)";
        result = basicCalculatorSolution.calculate(s);
        expected = 23;
        assertEquals(expected, result);

        s = "1-3+6-(7+6-1)";
        result = basicCalculatorSolution.calculate(s);
        expected = -8;
        assertEquals(expected, result);

        s = "";
        result = basicCalculatorSolution.calculate(s);
        expected = 0;
        assertEquals(expected, result);

        s = null;
        result = basicCalculatorSolution.calculate(s);
        expected = 0;
        assertEquals(expected, result);
    }
}