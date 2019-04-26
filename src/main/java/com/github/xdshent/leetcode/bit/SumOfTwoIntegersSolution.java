package com.github.xdshent.leetcode.bit;

/**
 * 371. Sum of Two Integers
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * <p>
 * Example 1:
 * Input: a = 1, b = 2
 * output: 3
 * <p>
 * Example 2:
 * Input: a = -2, b = 3
 * Output: 1
 *
 * @author xdshen
 */
public class SumOfTwoIntegersSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
