package com.github.xdshent.leetcode.stack;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.
 * push(x): push element x to the back of queue.
 * pop(): removes the element from in front of queue.
 * peek(): get the element front element.
 * empty: return whether the queue is empty.
 * <p>
 * Example:
 * MyQueue queue = new MyQueue();
 * <p>
 * queue.push(1);
 * queue.push(2);
 * queue.peek(); //returns 1
 * queue.pop(); //returns 1
 * queue.empty(); //returns false
 * <p>
 * Notes:
 * You must use only standard operations of a stack, which means only push to top,
 * peek/pop from top, size and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate
 * a stack by using a list or deque(double-ended queue), as long as you use only standard
 * operations of a stack.
 * You may assume that all operations are valid(for example, no pop or peek operations
 * will be called on an empty queue).
 *
 * @author xdshen
 */
public class QueueUsingStackSolution {

    private Stack<Integer> pushStack;

    private Stack<Integer> popStack;

    public QueueUsingStackSolution() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!popStack.isEmpty()) {
            pushStack.push(popStack.pop());
        }

        pushStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return popStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }

        return popStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
