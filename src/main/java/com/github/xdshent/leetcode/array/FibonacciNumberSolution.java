package com.github.xdshent.leetcode.array;

/**
 * 509. Fibonacci Number
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 * <p>
 * Example 1:
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * <p>
 * Example 2:
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * <p>
 * Example 3:
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * <p>
 * Note:
 * 0 ≤ N ≤ 30.
 *
 * @author xdshen
 */
public class FibonacciNumberSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public int fibFirst(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        while (n-- > 1) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    /**
     * Recursion
     * <p>
     * Time Complexity: O(2^N)
     * Space Complexity: O(N)
     *
     * @param n
     * @return
     */
    public int fibSecond(int n) {
        if (n <= 1) {
            return n;
        }

        return fibSecond(n - 1) + fibSecond(n - 2);
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param n
     * @return
     */
    public int fibThird(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fibCache = new int[n + 1];
        fibCache[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibCache[i] = fibCache[i - 1] + fibCache[i - 2];
        }
        return fibCache[n];
    }
}
