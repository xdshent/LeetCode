package com.github.xdshent.leetcode.stack;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent
 * and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 * <p>
 * Example 1:
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result
 * of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 * <p>
 * Note:
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.
 *
 * @author xdshen
 */
public class RemoveAllAdjacentDuplicatesInStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String removeDuplicatesFirst(String s) {
        if (s == null || s.length() <= 1) {

            return s;
        }

        int i = 0;
        int n = s.length();
        char[] result = s.toCharArray();

        for (int j = 0; j < n; j++, i++) {
            result[i] = result[j];

            if (i > 0 && result[i - 1] == result[i]) {

                i -= 2;
            }
        }

        return new String(result, 0, i);
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public String removeDuplicatesSecond(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {

            if (stack.isEmpty() || stack.peek() != c) {

                stack.push(c);
            } else {

                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {

            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}