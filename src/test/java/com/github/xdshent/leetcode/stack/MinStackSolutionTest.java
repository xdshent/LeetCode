package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackSolutionTest {

    private MinStackSolution minStackSolution;

    @Before
    public void setUp() throws Exception {
        minStackSolution = new MinStackSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMinStack() {
        minStackSolution.push(6);
        minStackSolution.push(5);
        minStackSolution.push(6);
        minStackSolution.push(4);
        minStackSolution.push(3);
        minStackSolution.push(2);
        minStackSolution.push(1);

        Assert.assertEquals(1, minStackSolution.getMin());
        minStackSolution.pop();
        Assert.assertEquals(2, minStackSolution.getMin());
        minStackSolution.push(0);
        Assert.assertEquals(0, minStackSolution.getMin());
        minStackSolution.pop();
        Assert.assertEquals(2, minStackSolution.top());
        minStackSolution.pop();
        minStackSolution.pop();
        minStackSolution.pop();
        Assert.assertEquals(6, minStackSolution.top());
        Assert.assertEquals(5, minStackSolution.getMin());
        minStackSolution.pop();
        minStackSolution.pop();
        Assert.assertEquals(6, minStackSolution.getMin());
    }
}