package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbersSolutionTest {

    private AddTwoNumbersSolution addTwoNumbersSolution;
    private SinglyLinkedNode head1;
    private SinglyLinkedNode head2;

    @Before
    public void setUp() throws Exception {
        addTwoNumbersSolution = new AddTwoNumbersSolution();
        head1 = new SinglyLinkedNode(2);
        head1.next = new SinglyLinkedNode(4);
        head1.next.next = new SinglyLinkedNode(3);

        head2 = new SinglyLinkedNode(5);
        head2.next = new SinglyLinkedNode(6);
        head2.next.next = new SinglyLinkedNode(4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addTwoNumbers() {
        SinglyLinkedNode result = addTwoNumbersSolution.addTwoNumbers(head1, head2);
        Integer[] expected = new Integer[]{7, 0, 8};
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));


        head2.next.next.next = new SinglyLinkedNode(9);
        expected = new Integer[]{7, 0, 8, 9};
        result = addTwoNumbersSolution.addTwoNumbers(head1, head2);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head1.next.next.next = new SinglyLinkedNode(5);
        head1.next.next.next.next = new SinglyLinkedNode(9);
        expected = new Integer[]{7, 0, 8, 4, 0, 1};
        result = addTwoNumbersSolution.addTwoNumbers(head1, head2);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head2 = null;
        expected = new Integer[]{2, 4, 3, 5, 9};
        result = addTwoNumbersSolution.addTwoNumbers(head1, head2);
        Assert.assertArrayEquals(expected, toList(result).toArray(new Integer[0]));

        head1 = null;
        head2 = new SinglyLinkedNode(5);
        head2.next = new SinglyLinkedNode(6);
        head2.next.next = new SinglyLinkedNode(4);
        expected = new Integer[]{5, 6, 4};
        result = addTwoNumbersSolution.addTwoNumbers(head1, head2);
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