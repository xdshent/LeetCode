package com.github.xdshent.leetcode.math;

/**
 * 263. Ugly Number
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include
 * 2, 3, 5.
 * <p>
 * Example 1:
 * Input: 6
 * Output: true
 * Explanation: 6= 2 * 3
 * <p>
 * Example 2:
 * Input: 8
 * Output: true
 * Explanation: 2 * 2 * 2
 * <p>
 * Example 3:
 * Input: 14
 * Output: false
 * Explanation: 14 is not ugly since it includes another prime factor 7.
 * <p>
 * Note:
 * 1. 1 is typically treated as an ugly number.
 * 2. Input is within the 32-bit signed integer range: [−231,  231 − 1].
 *
 * @author xdshen
 */
public class UglyNumberSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }

        int[] divisors = {2, 3, 5};
        for (int divisor : divisors) {
            while (num % divisor == 0) {
                num /= divisor;
            }
        }
        return num == 1;
    }
}
