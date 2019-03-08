package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveNodeSolutionTest {

    SinglyLinkedNode head = null;

    @Before
    public void setUp() throws Exception {
        head = new SinglyLinkedNode(1);
        SinglyLinkedNode first = new SinglyLinkedNode(2);
        SinglyLinkedNode second = new SinglyLinkedNode(3);
        SinglyLinkedNode third = new SinglyLinkedNode(4);
        SinglyLinkedNode fourth = new SinglyLinkedNode(5);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeNthFromEndFirst() {
        SinglyLinkedNode result = RemoveNodeSolution.removeNthFromEndFirst(head, 2);

        Integer[] expected = new Integer[]{1, 2, 3, 5};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndFirst(head, 0);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndFirst(head, 0);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        result = RemoveNodeSolution.removeNthFromEndFirst(head, 6);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndFirst(head, -1);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{};
        result = RemoveNodeSolution.removeNthFromEndFirst(null, 1);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));
    }

    @Test
    public void removeNthFromEndSecond() {
        SinglyLinkedNode result = RemoveNodeSolution.removeNthFromEndSecond(head, 2);

        Integer[] expected = new Integer[]{1, 2, 3, 5};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndSecond(head, 0);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndSecond(head, 0);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{1, 2, 3, 5};
        result = RemoveNodeSolution.removeNthFromEndSecond(head, -1);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        expected = new Integer[]{};
        result = RemoveNodeSolution.removeNthFromEndSecond(null, 1);
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