package com.github.xdshent.leetcode.math;

/**
 * 69. Sqrt(x)
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to
 * be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated
 * and only the integer part of the result is returned.
 * <p>
 * Example 1:
 * Input: 4
 * Output: 2
 * <p>
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation:
 * The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 *
 * @author xdshen
 */
public class SqrtSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        while (true) {
            int mid = left + ((right - left) >> 1);
            if ((mid <= x / mid) && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
    }
}
