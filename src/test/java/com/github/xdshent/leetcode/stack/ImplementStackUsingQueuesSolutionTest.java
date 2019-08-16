package com.github.xdshent.leetcode.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImplementStackUsingQueuesSolutionTest {

    private ImplementStackUsingQueuesSolution implementStackUsingQueuesSolution;

    @Before
    public void setUp() throws Exception {
        implementStackUsingQueuesSolution = new ImplementStackUsingQueuesSolution();

        implementStackUsingQueuesSolution.push(1);
        implementStackUsingQueuesSolution.push(2);
        implementStackUsingQueuesSolution.push(3);
        implementStackUsingQueuesSolution.push(4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push() {
        implementStackUsingQueuesSolution.push(5);
    }

    @Test
    public void pop() {
        int result = implementStackUsingQueuesSolution.pop();
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void top() {
        int result = implementStackUsingQueuesSolution.top();
        int expected = 4;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void empty() {
        boolean result = implementStackUsingQueuesSolution.empty();
        Assert.assertFalse(result);

        while (!implementStackUsingQueuesSolution.empty()) {
            implementStackUsingQueuesSolution.pop();
        }

        result = implementStackUsingQueuesSolution.empty();
        Assert.assertTrue(result);
    }
}