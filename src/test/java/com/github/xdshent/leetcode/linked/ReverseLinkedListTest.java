package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedListTest {

    private SinglyLinkedNode head;
    private ReverseLinkedListSolution reverseLinkedListSolution;

    @Before
    public void setUp() throws Exception {
        head = new SinglyLinkedNode(1);
        SinglyLinkedNode firstNode = new SinglyLinkedNode(2);
        SinglyLinkedNode secondNode = new SinglyLinkedNode(3);
        SinglyLinkedNode thirdNode = new SinglyLinkedNode(4);
        SinglyLinkedNode fourthNode = new SinglyLinkedNode(5);

        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        reverseLinkedListSolution = new ReverseLinkedListSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseList() {
        SinglyLinkedNode result = reverseLinkedListSolution.reverseList(head);
        Integer[] expected = new Integer[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(8);
        result = reverseLinkedListSolution.reverseList(head);
        expected = new Integer[]{8};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = null;
        result = reverseLinkedListSolution.reverseList(head);
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

    }

    /**
     * To List
     *
     * @param head
     * @return
     */
    private List<Integer> toList(SinglyLinkedNode head) {
        if (head == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }
}