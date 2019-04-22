package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesFromSortedListSolutionTest {

    private RemoveDuplicatesFromSortedListSolution removeDuplicatesFromSortedListSolution;
    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
        removeDuplicatesFromSortedListSolution = new RemoveDuplicatesFromSortedListSolution();
        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(1);
        head.next.next = new SinglyLinkedNode(2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void deleteDuplicates() {
        SinglyLinkedNode result = removeDuplicatesFromSortedListSolution.deleteDuplicates(head);
        Integer[] expected = new Integer[]{1, 2};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(1);
        head.next.next = new SinglyLinkedNode(2);
        head.next.next.next = new SinglyLinkedNode(3);
        head.next.next.next.next = new SinglyLinkedNode(3);

        result = removeDuplicatesFromSortedListSolution.deleteDuplicates(head);
        expected = new Integer[]{1, 2, 3};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(1);
        result = removeDuplicatesFromSortedListSolution.deleteDuplicates(head);
        expected = new Integer[]{1};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head = null;
        result = removeDuplicatesFromSortedListSolution.deleteDuplicates(head);
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