package com.github.xdshent.leetcode.linked;

/**
 * 83. Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear
 * only once.
 * <p>
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * <p>
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * <p>
 * Definition for singly-linked list.
 *
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class RemoveDuplicatesFromSortedListSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public SinglyLinkedNode deleteDuplicates(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedNode result = head;
        while (result.next != null) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }

        return head;
    }
}
