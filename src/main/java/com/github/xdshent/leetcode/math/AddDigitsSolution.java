package com.github.xdshent.leetcode.math;

/**
 * 258. Add Digits
 * Given a non-negative integer num, repeatedly add
 * all its digits util the result has only one digit.
 * <p>
 * Example:
 * Input: 38
 * Output: 2
 * <p>
 * Explanation:
 * The process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * @author xdshen
 */
public class AddDigitsSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {

        return num > 9 ? (num % 9 == 0 ? 9 : num % 9) : num;
    }
}
