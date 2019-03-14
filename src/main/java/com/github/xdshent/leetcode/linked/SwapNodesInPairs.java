package com.github.xdshent.leetcode.linked;

/**
 * 24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example:
 * Given: 1->2->3->4
 * you should return the list as 2->1->4->3
 *
 * Definition for singly-linked list.
 *  public class SinglyLinkedNode {
 *     int val;
 *     SinglyLinkedNode next;
 *     SinglyLinkedNode(int x) { val = x; }
 * }
 *
 * @author xdshen
 */
public class SwapNodesInPairs {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public SinglyLinkedNode swapPairs(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedNode dummyNode = new SinglyLinkedNode(0);
        dummyNode.next = head;
        SinglyLinkedNode previousSwappedNode = dummyNode;
        SinglyLinkedNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            SinglyLinkedNode tempSwappedNode = currentNode.next;
            currentNode.next = tempSwappedNode.next;
            tempSwappedNode.next = currentNode;
            previousSwappedNode.next = tempSwappedNode;
            previousSwappedNode = currentNode;
            currentNode = currentNode.next;
        }
        return dummyNode.next;
    }
}
