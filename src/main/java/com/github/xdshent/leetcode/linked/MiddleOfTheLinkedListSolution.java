package com.github.xdshent.leetcode.linked;

/**
 * 876. Middle of the Linked List
 * Given a non-empty singly linked list with head node head, return a middle node of
 * linked list.
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Example:
 * Input: {1,2,3,4,5}
 * Output: Node 3 from this list (Serialization: {3,4,5})
 * The returned node has value 3.  (The judge's serialization of this node is {3,4,5}).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 *
 * Definition for singly-linked list.
 * public class SinglyLinkedNode {
 *     int val;
 *     SinglyLinkedNode next;
 *     SinglyLinkedNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class MiddleOfTheLinkedListSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public SinglyLinkedNode middleNode(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedNode fastPoint = head;
        SinglyLinkedNode slowPoint = head;

        while (fastPoint != null && fastPoint.next != null) {
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;
        }

        return slowPoint;
    }
}
