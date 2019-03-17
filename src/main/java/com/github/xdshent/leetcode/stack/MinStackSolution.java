package com.github.xdshent.leetcode.stack;

import java.util.Stack;

/**
 * 155. Min Stack
 * Design a stack that supports push, top and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- push element x onto stack.
 * pop() -- removes the element on top of the stack.
 * top() -- get the top element.
 * getMin() -- retrieve the minimum element in the stack.
 * <p>
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();  --> returns -3
 * minStack.pop();
 * minStack.top();     --> returns 0.
 * minStack.getMin();  --> returns -2.
 *
 * @author xdshen
 */
public class MinStackSolution {

    private Stack<Integer> stack;
    private int currentMin;

    public MinStackSolution() {
        stack = new Stack<>();
        currentMin = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= currentMin) {
            stack.push(currentMin);
            currentMin = x;
        }

        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == currentMin) {
            currentMin = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return currentMin;
    }
}