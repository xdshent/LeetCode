package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesSolutionTest {

    private ValidParenthesesSolution validParenthesesSolution;
    private String str;

    @Before
    public void setUp() throws Exception {
        validParenthesesSolution = new ValidParenthesesSolution();
        str = "";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValid() {
        boolean result = validParenthesesSolution.isValid(str);
        Assert.assertTrue(result);

        str = "()";
        result = validParenthesesSolution.isValid(str);
        Assert.assertTrue(result);

        str = ")";
        result = validParenthesesSolution.isValid(str);
        Assert.assertFalse(result);

        str = "()[}";
        result = validParenthesesSolution.isValid(str);
        Assert.assertFalse(result);

        str = null;
        result = validParenthesesSolution.isValid(str);
        Assert.assertFalse(result);

        str = "([{}])";
        result = validParenthesesSolution.isValid(str);
        Assert.assertTrue(result);

        str = "([(}])";
        result = validParenthesesSolution.isValid(str);
        Assert.assertTrue(result);
    }
}