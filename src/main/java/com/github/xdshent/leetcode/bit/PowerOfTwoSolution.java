package com.github.xdshent.leetcode.bit;

/**
 * 231. Power of Two
 * Given an integer, write a function to determine
 * if it is a power of two.
 * <p>
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 * <p>
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 2 ^ 4 = 16
 *
 * @author xdshen
 */
public class PowerOfTwoSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        return (((n - 1) & n) == 0);
    }
}
