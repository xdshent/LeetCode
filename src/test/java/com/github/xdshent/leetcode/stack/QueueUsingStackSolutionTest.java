package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueUsingStackSolutionTest {

    private QueueUsingStackSolution queueUsingStackSolution;

    @Before
    public void setUp() throws Exception {
        queueUsingStackSolution = new QueueUsingStackSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testQueueUsingStack() {
        queueUsingStackSolution.push(1);
        queueUsingStackSolution.push(2);
        queueUsingStackSolution.push(3);
        Assert.assertFalse(queueUsingStackSolution.empty());
        queueUsingStackSolution.pop();
        Assert.assertFalse(queueUsingStackSolution.empty());
        queueUsingStackSolution.push(4);
        queueUsingStackSolution.push(5);

        Assert.assertEquals(2, queueUsingStackSolution.peek());
        Assert.assertEquals(2, queueUsingStackSolution.pop());
        queueUsingStackSolution.pop();
        queueUsingStackSolution.pop();
        queueUsingStackSolution.pop();
        Assert.assertTrue(queueUsingStackSolution.empty());
    }
}