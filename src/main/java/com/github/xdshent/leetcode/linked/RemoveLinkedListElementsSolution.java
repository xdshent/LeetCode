package com.github.xdshent.leetcode.linked;

/**
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of
 * integers that have value val.
 * <p>
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * <p>
 * <p>
 * Definition for singly-linked list.
 * <p>
 * public class SinglyLinkedNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class RemoveLinkedListElementsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @param val
     * @return
     */
    public SinglyLinkedNode removeElements(SinglyLinkedNode head, int val) {
        if (head == null) {
            return null;
        }

        SinglyLinkedNode dummy = new SinglyLinkedNode(-1);
        dummy.next = head;
        SinglyLinkedNode current = head;
        SinglyLinkedNode previous = dummy;

        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }

            current = current.next;
        }

        return dummy.next;
    }
}
