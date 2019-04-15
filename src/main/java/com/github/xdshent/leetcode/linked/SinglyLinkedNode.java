package com.github.xdshent.leetcode.linked;

import java.util.Objects;

/**
 * singly-linked list node
 *
 * @author xdshen
 */
public class SinglyLinkedNode {
    public int val;
    public SinglyLinkedNode next;

    public SinglyLinkedNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SinglyLinkedNode that = (SinglyLinkedNode) o;
        return val == that.val &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
