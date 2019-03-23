package com.github.xdshent.leetcode.linked;

/**
 * Sort a linked list using insertion sort.
 * <p>
 * Example 1:
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 * <p>
 * Example 2:
 * Input: -1->5->3->4->0
 * Output: -1->0->3->4->5
 * <p>
 * Definition for singly-linked list.
 * <p>
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class InsertionSortListSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public SinglyLinkedNode insertionSortList(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedNode sortedHead = head;
        SinglyLinkedNode sortedTail = head;
        head = head.next;
        sortedHead.next = null;
        SinglyLinkedNode sortedNode = null;

        while (head != null) {
            sortedNode = head;
            head = head.next;
            sortedNode.next = null;

            if (sortedNode.val <= sortedHead.val) {
                sortedNode.next = sortedHead;
                sortedHead = sortedNode;
            } else if (sortedNode.val >= sortedTail.val) {
                sortedTail.next = sortedNode;
                sortedTail = sortedNode;
            } else {
                SinglyLinkedNode currentNode = sortedHead;
                while (currentNode.next.val < sortedNode.val) {
                    currentNode = currentNode.next;
                }

                sortedNode.next = currentNode.next;
                currentNode.next = sortedNode;
            }
        }
        return sortedHead;
    }
}
