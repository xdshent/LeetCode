package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleSolutionTest {

    private LinkedListCycleSolution linkedListCycleSolution;
    private SinglyLinkedNode head;
    private SinglyLinkedNode firstNode;
    private SinglyLinkedNode secondNode;
    private SinglyLinkedNode thirdNode;

    @Before
    public void setUp() throws Exception {
        linkedListCycleSolution = new LinkedListCycleSolution();

        head = new SinglyLinkedNode(0);
        firstNode = new SinglyLinkedNode(1);
        secondNode = new SinglyLinkedNode(2);
        thirdNode = new SinglyLinkedNode(3);

        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hasCycleFirst() {
        boolean result = linkedListCycleSolution.hasCycleFirst(head);
        Assert.assertFalse(result);

        result = linkedListCycleSolution.hasCycleFirst(null);
        Assert.assertFalse(result);

        SinglyLinkedNode dummyNode = new SinglyLinkedNode(3);
        result = linkedListCycleSolution.hasCycleFirst(dummyNode);
        Assert.assertFalse(result);

        thirdNode.next = firstNode;
        result = linkedListCycleSolution.hasCycleFirst(head);
        Assert.assertTrue(result);

        secondNode.next = null;
        result = linkedListCycleSolution.hasCycleFirst(head);
        Assert.assertFalse(result);
    }

    @Test
    public void hasCycleSecond() {
        boolean result = linkedListCycleSolution.hasCycleSecond(head);
        Assert.assertFalse(result);

        result = linkedListCycleSolution.hasCycleSecond(null);
        Assert.assertFalse(result);

        SinglyLinkedNode dummyNode = new SinglyLinkedNode(3);
        result = linkedListCycleSolution.hasCycleSecond(dummyNode);
        Assert.assertFalse(result);

        thirdNode.next = firstNode;
        result = linkedListCycleSolution.hasCycleSecond(head);
        Assert.assertTrue(result);

        secondNode.next = null;
        result = linkedListCycleSolution.hasCycleSecond(head);
        Assert.assertFalse(result);
    }
}