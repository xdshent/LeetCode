package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xdshen
 */
public class BaseballGameSolutionTest {

    private BaseballGameSolution baseballGameSolution;
    private String[] ops;

    @Before
    public void setUp() throws Exception {
        baseballGameSolution = new BaseballGameSolution();
        ops = new String[]{"5", "2", "C", "D", "+"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calPoints() {
        int result = baseballGameSolution.calPoints(ops);
        int expected = 30;
        assertEquals(expected, result);

        ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        result = baseballGameSolution.calPoints(ops);
        expected = 27;
        assertEquals(expected, result);

        ops = new String[]{"5"};
        result = baseballGameSolution.calPoints(ops);
        expected = 5;
        assertEquals(expected, result);

        ops = new String[]{};
        result = baseballGameSolution.calPoints(ops);
        expected = 0;
        assertEquals(expected, result);

        ops = null;
        result = baseballGameSolution.calPoints(ops);
        expected = 0;
        assertEquals(expected, result);
    }
}