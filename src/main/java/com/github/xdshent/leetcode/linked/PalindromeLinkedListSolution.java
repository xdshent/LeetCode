package com.github.xdshent.leetcode.linked;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * Input: 1->2
 * Output: false
 * <p>
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * <p>
 * Definition for singly-linked list.
 *
 * <code>
 * public class ListNode {
 *    int val;
 *    ListNode next;
 *    ListNode(int x) { val = x;}
 * }
 * </code>
 *
 * @author xdshen
 */
public class PalindromeLinkedListSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(SinglyLinkedNode head) {
        if (head == null || head.next == null) {

            return true;
        }

        SinglyLinkedNode slow = head;
        SinglyLinkedNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        SinglyLinkedNode reverseLinkedList = slow;
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val) {

                reverse(reverseLinkedList);
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }

        reverse(reverseLinkedList);
        return true;
    }

    /**
     * reverse linked list
     *
     * @param head
     * @return
     */
    private SinglyLinkedNode reverse(SinglyLinkedNode head) {
        SinglyLinkedNode pre = null;

        while (head != null) {
            SinglyLinkedNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
