package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapNodesInPairsTest {

    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
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
    public void swapPairs() {
        SinglyLinkedNode result = SwapNodesInPairs.swapPairs(head);
        Integer[] expected = new Integer[]{1, 0, 3, 2, 5, 4};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head.next = new SinglyLinkedNode(10);
        result = SwapNodesInPairs.swapPairs(head);
        expected = new Integer[]{10, 0};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head.next = new SinglyLinkedNode(1);
        head.next.next = new SinglyLinkedNode(2);
        result = SwapNodesInPairs.swapPairs(head);
        expected = new Integer[]{1, 0, 2};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head.next = null;
        result = SwapNodesInPairs.swapPairs(head);
        expected = new Integer[]{0};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        result = SwapNodesInPairs.swapPairs(null);
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