package com.github.xdshent.leetcode.stack;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string containing just the character '(', ')', '{'
 * '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * 1: Open brackets must be closed by the same type of brackets.
 * 2: Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: "([)]"
 * Output: false
 *
 * @author xdshen
 */
public class ValidParenthesesSolution {

    /**
     * Time Complexity: (N)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || (s.length() & 1) != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (Character c : chars) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty()
                        || !stack.pop().equals(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
