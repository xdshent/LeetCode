package com.github.xdshent.leetcode.linked;

/**
 * 21. Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be
 * made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class MergeTwoSortedListsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param l1
     * @param l2
     * @return
     */
    public SinglyLinkedNode mergeTwoLists(SinglyLinkedNode l1, SinglyLinkedNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        SinglyLinkedNode dummyNode = new SinglyLinkedNode(-1);
        SinglyLinkedNode currentNode = null;
        SinglyLinkedNode previousNode = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currentNode = l1;
                l1 = l1.next;
            }else {
                currentNode = l2;
                l2 = l2.next;
            }

            previousNode.next = currentNode;
            previousNode = currentNode;
        }

        if (l1 != null) {
            previousNode.next = l1;
        }

        if (l2 != null) {
            previousNode.next = l2;
        }

        return dummyNode.next;
    }
}
