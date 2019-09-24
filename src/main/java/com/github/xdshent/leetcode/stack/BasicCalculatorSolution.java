package com.github.xdshent.leetcode.stack;

import java.util.Stack;

/**
 * 224. Basic Calculator
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative
 * integers and empty spaces .
 * <p>
 * Example 1:
 * Input: "1 + 1"
 * Output: 2
 * <p>
 * Example 2:
 * Input: " 2-1 + 2 "
 * Output: 3
 * <p>
 * Example 3:
 * Input: "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 * <p>
 * Note:
 * You may assume that the given expression is always valid.
 * Do not use the eval built-in library function.
 *
 * @author xdshen
 */
public class BasicCalculatorSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public int calculate(String s) {
        if (s == null || s.length() == 0) {

            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int operand = 0;
        int sign = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {

                operand = operand * 10 + (c - '0');
            } else if (c == '+') {

                result += sign * operand;
                sign = 1;
                operand = 0;
            } else if (c == '-') {

                result += sign * operand;
                sign = -1;
                operand = 0;
            } else if (c == '(') {

                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {

                result += sign * operand;

                result *= stack.pop();
                result += stack.pop();

                operand = 0;
            }
        }

        return result + sign * operand;
    }
}
