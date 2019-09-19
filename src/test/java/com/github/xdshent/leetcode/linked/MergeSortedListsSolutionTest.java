package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedListsSolutionTest {

    private MergeSortedListsSolution mergeSortedListsSolution;
    private SinglyLinkedNode[] lists;

    @Before
    public void setUp() throws Exception {
        mergeSortedListsSolution = new MergeSortedListsSolution();

        lists = new SinglyLinkedNode[3];

        SinglyLinkedNode first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);

        SinglyLinkedNode second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(3);
        second.next.next = new SinglyLinkedNode(4);

        SinglyLinkedNode third = new SinglyLinkedNode(2);
        third.next = new SinglyLinkedNode(6);

        lists[0] = first;
        lists[1] = second;
        lists[2] = third;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mergeKListsFirst() {
        List<Integer> result = toList(mergeSortedListsSolution.mergeKListsFirst(lists));
        Integer[] expected = new Integer[]{1, 1, 2, 3, 4, 4, 5, 6};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[1];
        SinglyLinkedNode first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(3);
        lists[0] = first;
        result = toList(mergeSortedListsSolution.mergeKListsFirst(lists));
        expected = new Integer[]{1, 3};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[3];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);

        SinglyLinkedNode second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(3);
        second.next.next = new SinglyLinkedNode(4);

        lists[0] = first;
        lists[1] = second;
        lists[2] = null;
        result = toList(mergeSortedListsSolution.mergeKListsFirst(lists));
        expected = new Integer[]{1, 1, 3, 4, 4, 5};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[0];
        result = toList(mergeSortedListsSolution.mergeKListsFirst(lists));
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = null;
        result = toList(mergeSortedListsSolution.mergeKListsFirst(lists));
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
    }

    @Test
    public void mergeKListsSecond() {
        List<Integer> result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        Integer[] expected = new Integer[]{1, 1, 2, 3, 4, 4, 5, 6};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[1];
        SinglyLinkedNode first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(3);
        lists[0] = first;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{1, 3};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[3];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);

        SinglyLinkedNode second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(3);
        second.next.next = new SinglyLinkedNode(4);

        lists[0] = first;
        lists[1] = second;
        lists[2] = null;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{1, 1, 3, 4, 4, 5};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[3];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);

        second = new SinglyLinkedNode(1);
        second.next = new SinglyLinkedNode(3);
        second.next.next = new SinglyLinkedNode(4);
        lists[0] = null;
        lists[1] = first;
        lists[2] = second;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{1, 1, 3, 4, 4, 5};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[3];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);
        first.next.next.next = new SinglyLinkedNode(7);
        first.next.next.next.next = new SinglyLinkedNode(9);
        first.next.next.next.next.next = new SinglyLinkedNode(11);

        second = new SinglyLinkedNode(12);
        second.next = new SinglyLinkedNode(13);
        second.next.next = new SinglyLinkedNode(28);
        second.next.next.next = new SinglyLinkedNode(29);
        second.next.next.next.next = new SinglyLinkedNode(33);
        second.next.next.next.next = new SinglyLinkedNode(45);
        second.next.next.next.next.next = new SinglyLinkedNode(50);
        second.next.next.next.next.next.next = new SinglyLinkedNode(52);

        SinglyLinkedNode third = new SinglyLinkedNode(-1);
        third.next = new SinglyLinkedNode(0);
        third.next.next = new SinglyLinkedNode(1);
        third.next.next.next = new SinglyLinkedNode(5);
        third.next.next.next.next = new SinglyLinkedNode(7);
        third.next.next.next.next.next = new SinglyLinkedNode(19);
        third.next.next.next.next.next.next = new SinglyLinkedNode(23);

        lists[0] = first;
        lists[1] = second;
        lists[2] = third;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{-1, 0, 1, 1, 4, 5, 5, 7, 7, 9, 11, 12, 13, 19, 23, 28, 29, 45, 50, 52};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[1];
        lists[0] = null;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[5];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);
        first.next.next.next = new SinglyLinkedNode(7);
        first.next.next.next.next = new SinglyLinkedNode(9);
        first.next.next.next.next.next = new SinglyLinkedNode(11);

        second = new SinglyLinkedNode(12);
        second.next = new SinglyLinkedNode(13);
        second.next.next = new SinglyLinkedNode(28);
        second.next.next.next = new SinglyLinkedNode(29);
        second.next.next.next.next = new SinglyLinkedNode(33);
        second.next.next.next.next = new SinglyLinkedNode(45);
        second.next.next.next.next.next = new SinglyLinkedNode(50);
        second.next.next.next.next.next.next = new SinglyLinkedNode(52);

        third = new SinglyLinkedNode(-1);
        third.next = new SinglyLinkedNode(0);
        third.next.next = new SinglyLinkedNode(1);
        third.next.next.next = new SinglyLinkedNode(5);
        third.next.next.next.next = new SinglyLinkedNode(7);
        third.next.next.next.next.next = new SinglyLinkedNode(19);
        third.next.next.next.next.next.next = new SinglyLinkedNode(23);

        SinglyLinkedNode fourth = new SinglyLinkedNode(15);
        fourth.next = new SinglyLinkedNode(20);
        fourth.next.next = new SinglyLinkedNode(24);
        fourth.next.next.next = new SinglyLinkedNode(26);
        fourth.next.next.next.next = new SinglyLinkedNode(31);
        fourth.next.next.next.next.next = new SinglyLinkedNode(33);
        fourth.next.next.next.next.next.next = new SinglyLinkedNode(37);

        SinglyLinkedNode fifth = new SinglyLinkedNode(8);
        fifth.next = new SinglyLinkedNode(11);
        fifth.next.next = new SinglyLinkedNode(13);
        fifth.next.next.next = new SinglyLinkedNode(14);
        fifth.next.next.next.next = new SinglyLinkedNode(16);
        fifth.next.next.next.next.next = new SinglyLinkedNode(20);
        fifth.next.next.next.next.next.next = new SinglyLinkedNode(30);

        lists[0] = first;
        lists[1] = second;
        lists[2] = third;
        lists[3] = fourth;
        lists[4] = fifth;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{-1, 0, 1, 1, 4, 5, 5, 7, 7, 8, 9, 11, 11, 12, 13, 13, 14, 15, 16, 19, 20, 20, 23, 24, 26, 28, 29, 30, 31, 33, 37, 45, 50, 52};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[1];
        first = new SinglyLinkedNode(1);
        first.next = new SinglyLinkedNode(4);
        first.next.next = new SinglyLinkedNode(5);
        first.next.next.next = new SinglyLinkedNode(7);
        lists[0] = first;

        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{1, 4, 5, 7};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = new SinglyLinkedNode[0];
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));

        lists = null;
        result = toList(mergeSortedListsSolution.mergeKListsSecond(lists));
        expected = new Integer[]{};
        Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));
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