package com.github.xdshent.leetcode.math;

/**
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within
 * the 32-bit signed integer range:[-2^31, (2^31)-1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 * @author xdshen
 */
public class ReverseInteger {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = (result * 10) + (x % 10);
            x /= 10;
        }
        return result;
    }
}
