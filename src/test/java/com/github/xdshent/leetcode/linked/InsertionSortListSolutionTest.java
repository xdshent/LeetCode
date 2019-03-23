package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class InsertionSortListSolutionTest {

    private InsertionSortListSolution insertionSortListSolution;
    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
        insertionSortListSolution = new InsertionSortListSolution();
        head = new SinglyLinkedNode(0);
        SinglyLinkedNode second = new SinglyLinkedNode(1);
        SinglyLinkedNode third = new SinglyLinkedNode(2);
        SinglyLinkedNode fourth = new SinglyLinkedNode(3);
        SinglyLinkedNode fifth = new SinglyLinkedNode(4);

        head.next = third;
        third.next = second;
        second.next = fifth;
        fifth.next = fourth;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertionSortList() {
        SinglyLinkedNode result = insertionSortListSolution.insertionSortList(head);
        Assert.assertArrayEquals(new Integer[]{0, 1, 2, 3, 4}, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(5);
        SinglyLinkedNode first = new SinglyLinkedNode(4);
        SinglyLinkedNode second = new SinglyLinkedNode(3);
        SinglyLinkedNode third = new SinglyLinkedNode(2);
        SinglyLinkedNode fourth = new SinglyLinkedNode(1);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        result = insertionSortListSolution.insertionSortList(head);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(5);
        first = new SinglyLinkedNode(1);
        second = new SinglyLinkedNode(4);
        third = new SinglyLinkedNode(3);
        fourth = new SinglyLinkedNode(2);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        result = insertionSortListSolution.insertionSortList(head);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, toList(result).toArray(new Integer[0]));

        head = null;
        result = insertionSortListSolution.insertionSortList(head);
        Assert.assertArrayEquals(new Integer[]{}, toList(result).toArray(new Integer[0]));

        head = new SinglyLinkedNode(3);
        result = insertionSortListSolution.insertionSortList(head);
        Assert.assertArrayEquals(new Integer[]{3}, toList(result).toArray(new Integer[0]));
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