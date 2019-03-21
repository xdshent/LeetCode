package com.github.xdshent.leetcode.linked;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. Linked List Cycle
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos
 * which represents the position (0 - indexed) in the linked list where tail
 * connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * Example 1:
 * Input: head = {3,2,0,-4}, pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list,
 * where tail connects to the second node.
 *
 * @author xdshen
 */
public class LinkedListCycleSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param head
     * @return
     */
    public boolean hasCycleFirst(SinglyLinkedNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        SinglyLinkedNode slow = head;
        SinglyLinkedNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param head
     * @return
     */
    public boolean hasCycleSecond(SinglyLinkedNode head) {
        Set<SinglyLinkedNode> set = new HashSet<>();

        SinglyLinkedNode dummyNode = head;
        while (dummyNode != null) {
            if (set.contains(dummyNode)) {
                return true;
            } else {
                set.add(dummyNode);
            }
            dummyNode = dummyNode.next;
        }
        return false;
    }
}
