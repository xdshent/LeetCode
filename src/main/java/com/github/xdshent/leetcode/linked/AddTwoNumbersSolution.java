package com.github.xdshent.leetcode.linked;

/**
 * 2. Add Two Numbers
 * You are given two non-empty linked list representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * Input: (2->4->3)+(5->6->4)
 * Output: 7->0->8
 * Explanation: 342+465=807
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
public class AddTwoNumbersSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param l1
     * @param l2
     * @return
     */
    public SinglyLinkedNode addTwoNumbers(SinglyLinkedNode l1, SinglyLinkedNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        SinglyLinkedNode dummy = new SinglyLinkedNode(0);
        SinglyLinkedNode p = dummy;
        int sum = 0;

        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            p.next = new SinglyLinkedNode(sum % 10);
            p = p.next;
            sum /= 10;
        }

        return dummy.next;
    }
}
