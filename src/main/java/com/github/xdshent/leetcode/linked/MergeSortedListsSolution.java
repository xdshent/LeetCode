package com.github.xdshent.leetcode.linked;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p>
 * Example:
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class MergeSortedListsSolution {

    /**
     * Time Complexity: O(N*K)
     * Space Complexity: O(N)
     *
     * @param lists
     * @return
     */
    public SinglyLinkedNode mergeKListsFirst(SinglyLinkedNode[] lists) {
        if (lists == null || lists.length == 0) {

            return null;
        }

        if (lists.length == 1) {

            return lists[0];
        }

        PriorityQueue<SinglyLinkedNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(n -> n.val));

        for (SinglyLinkedNode node : lists) {

            if (node != null) {

                queue.add(node);
            }
        }

        SinglyLinkedNode dummy = new SinglyLinkedNode(0);
        SinglyLinkedNode tail = dummy;

        while (!queue.isEmpty()) {

            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null) {

                queue.add(tail.next);
            }
        }

        return dummy.next;
    }

    /**
     * Time Complexity: O(N*logN)
     * Space Complexity: O(1)
     *
     * @param lists
     * @return
     */
    public SinglyLinkedNode mergeKListsSecond(SinglyLinkedNode[] lists) {
        if (lists == null || lists.length == 0) {

            return null;
        }

        return reduce(map(lists, 0, lists.length / 2), map(lists, lists.length / 2 + 1, lists.length - 1));
    }

    /**
     * map
     *
     * @param lists
     * @param from
     * @param to
     * @return
     */
    private SinglyLinkedNode map(SinglyLinkedNode[] lists, int from, int to) {
        if (from > to) {

            return null;
        }

        if (from == to) {

            return lists[from];
        }

        if (from + 1 == to) {

            return reduce(lists[from], lists[to]);
        }

        return reduce(map(lists, from, (from + to) / 2), map(lists, (from + to) / 2 + 1, to));
    }

    /**
     * reduce
     *
     * @param first
     * @param second
     * @return
     */
    private SinglyLinkedNode reduce(SinglyLinkedNode first, SinglyLinkedNode second) {
        if (first == null) {

            return second;
        }

        if (second == null) {

            return first;
        }

        SinglyLinkedNode head;
        SinglyLinkedNode pre;
        if (first.val < second.val) {

            head = first;
            pre = first;
            first = first.next;
        } else {

            head = second;
            pre = second;
            second = second.next;
        }

        while (true) {
            if (first == null) {

                pre.next = second;
                break;
            }

            if (second == null) {

                pre.next = first;
                break;
            }

            if (first.val < second.val) {

                pre.next = first;
                pre = pre.next;
                first = first.next;
            } else {

                pre.next = second;
                pre = pre.next;
                second = second.next;
            }
        }

        return head;
    }
}