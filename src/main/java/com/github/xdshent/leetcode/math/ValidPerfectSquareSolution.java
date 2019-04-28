package com.github.xdshent.leetcode.math;

/**
 * 367. Valid Perfect Square
 * Given a positive integer num, write a function which returns True
 * if num is a perfect square else False.
 * Note: Do not use any built-in library function such as sqrt.
 * <p>
 * Example 1:
 * Input: 16
 * Output: true
 * <p>
 * Example 2:
 * Input: 14
 * Output: false
 *
 * @author xdshen
 */
public class ValidPerfectSquareSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (mid == num / mid && num % mid == 0) {
                return true;
            }

            if (mid < num / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
