package com.github.xdshent.leetcode.math;

/**
 * 172. Factorial Trailing Zeros
 * <p>
 * Given an integer n, return the number of trailing zeros in n!
 * <p>
 * Example 1:
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero
 * <p>
 * Example 2:
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * <p>
 * Note: Your solution should be in logarithmic the complexity.
 *
 * @author xdshen
 */
public class FactorialTrailingZeroesSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int base = 5;
        if (n < base) {
            return 0;
        }

        int result = 0;
        while (n > 0) {
            result += n / base;
            n /= base;
        }
        return result;
    }
}
