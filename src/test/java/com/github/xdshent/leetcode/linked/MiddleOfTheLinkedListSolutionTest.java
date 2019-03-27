package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListSolutionTest {

    private MiddleOfTheLinkedListSolution middleOfTheLinkedListSolution;
    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
        middleOfTheLinkedListSolution = new MiddleOfTheLinkedListSolution();
        head = new SinglyLinkedNode(0);
        SinglyLinkedNode first = new SinglyLinkedNode(1);
        SinglyLinkedNode second = new SinglyLinkedNode(2);
        SinglyLinkedNode third = new SinglyLinkedNode(3);
        SinglyLinkedNode fourth = new SinglyLinkedNode(4);
        SinglyLinkedNode fifth = new SinglyLinkedNode(5);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void middleNode() {
        SinglyLinkedNode result = middleOfTheLinkedListSolution.middleNode(head);
        Assert.assertEquals(3, result.val);

        head = new SinglyLinkedNode(0);
        SinglyLinkedNode first = new SinglyLinkedNode(1);
        SinglyLinkedNode second = new SinglyLinkedNode(2);
        SinglyLinkedNode third = new SinglyLinkedNode(3);
        SinglyLinkedNode fourth = new SinglyLinkedNode(4);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        result = middleOfTheLinkedListSolution.middleNode(head);
        Assert.assertEquals(2, result.val);

        head = null;
        result = middleOfTheLinkedListSolution.middleNode(head);
        Assert.assertNull(result);

        head = new SinglyLinkedNode(3);
        result = middleOfTheLinkedListSolution.middleNode(head);
        Assert.assertEquals(3, result.val);

        head = new SinglyLinkedNode(3);
        head.next = new SinglyLinkedNode(4);
        result = middleOfTheLinkedListSolution.middleNode(head);
        Assert.assertEquals(4, result.val);
    }
}