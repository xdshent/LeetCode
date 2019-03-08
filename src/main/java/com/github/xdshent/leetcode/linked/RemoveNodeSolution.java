package com.github.xdshent.leetcode.linked;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Given a linked list, remove the n-th node from the end of list and
 * return its head.
 * <p>
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5
 * <p>
 * Definition for singly-linked list.
 * <p>
 * public class SinglyLinkedNode{
 *      int val;
 *      SinglyLinkedNode next;
 *      SinglyLinkedNode(int x){
 *          val = x;
 *      }
 * }
 *
 * @author xdshen
 */
public class RemoveNodeSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param head
     * @param n
     * @return
     */
    public static SinglyLinkedNode removeNthFromEndFirst(SinglyLinkedNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        if (head.next == null && n != 1) {
            return head;
        }

        SinglyLinkedNode dummyNode = new SinglyLinkedNode(0);
        dummyNode.next = head;

        SinglyLinkedNode pointNode = head;
        int length = 0;
        while (pointNode != null) {
            length++;
            pointNode = pointNode.next;
        }

        if (n > length) {
            return head;
        }

        length -= n;
        pointNode = dummyNode;
        while (length > 0) {
            length--;
            pointNode = pointNode.next;
        }

        SinglyLinkedNode removeNode = pointNode.next;
        pointNode.next = removeNode.next;
        removeNode.next = null;
        return dummyNode.next;
    }

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param head
     * @param n
     * @return
     */
    public static SinglyLinkedNode removeNthFromEndSecond(SinglyLinkedNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        int step = n + 1;
        SinglyLinkedNode dummyNode = new SinglyLinkedNode(0);
        dummyNode.next = head;

        SinglyLinkedNode firstNode = dummyNode;
        SinglyLinkedNode secondNode = dummyNode;

        while (step > 0) {
            firstNode = firstNode.next;
            step--;
        }

        while (firstNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        SinglyLinkedNode removedNode = secondNode.next;
        secondNode.next = removedNode.next;
        removedNode.next = null;
        return dummyNode.next;
    }
}
