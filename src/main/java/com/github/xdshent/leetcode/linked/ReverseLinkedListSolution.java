package com.github.xdshent.leetcode.linked;

/**
 * 206. Reverse Linked List
 * Revere a singly linked list.
 * <p>
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * @author xdshen
 */
public class ReverseLinkedListSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public static SinglyLinkedNode reverseList(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedNode previousNode = null;
        SinglyLinkedNode currentNode = head;

        while (currentNode != null) {
            SinglyLinkedNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
