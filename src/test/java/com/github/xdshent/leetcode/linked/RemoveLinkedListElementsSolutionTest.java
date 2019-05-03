package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveLinkedListElementsSolutionTest {

    private RemoveLinkedListElementsSolution removeLinkedListElementsSolution;
    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
        removeLinkedListElementsSolution = new RemoveLinkedListElementsSolution();
        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(2);
        head.next.next = new SinglyLinkedNode(6);
        head.next.next.next = new SinglyLinkedNode(3);
        head.next.next.next.next = new SinglyLinkedNode(4);
        head.next.next.next.next.next = new SinglyLinkedNode(6);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeElements() {
        SinglyLinkedNode result = removeLinkedListElementsSolution.removeElements(head, 6);
        Integer[] expected = new Integer[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = null;
        result = removeLinkedListElementsSolution.removeElements(head, 6);
        Assert.assertNull(result);
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