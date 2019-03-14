package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsSolutionTest {

    private SinglyLinkedNode first;
    private SinglyLinkedNode second;
    private MergeTwoSortedListsSolution mergeTwoSortedListsSolution;

    @Before
    public void setUp() throws Exception {
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(2);
        first.next.next = new SinglyLinkedNode(3);

        second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(4);
        second.next.next = new SinglyLinkedNode(5);

        mergeTwoSortedListsSolution = new MergeTwoSortedListsSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mergeTwoLists() {
        SinglyLinkedNode result = mergeTwoSortedListsSolution.mergeTwoLists(first, second);
        Integer[] expected = new Integer[]{1, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        first = new SinglyLinkedNode(1);
        second = new SinglyLinkedNode(2);
        second.next = new SinglyLinkedNode(3);
        second.next.next = new SinglyLinkedNode(4);
        result = mergeTwoSortedListsSolution.mergeTwoLists(first, second);
        expected = new Integer[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(3);
        first.next.next = new SinglyLinkedNode(4);
        second = new SinglyLinkedNode(2);
        result = mergeTwoSortedListsSolution.mergeTwoLists(first, second);
        expected = new Integer[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(2);
        first.next.next = new SinglyLinkedNode(3);
        result = mergeTwoSortedListsSolution.mergeTwoLists(first, null);
        expected = new Integer[]{1, 2, 3};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(4);
        second.next.next = new SinglyLinkedNode(5);
        result = mergeTwoSortedListsSolution.mergeTwoLists(null, second);
        expected = new Integer[]{1, 4, 5};
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