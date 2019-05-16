package com.github.xdshent.leetcode.math;

/**
 * 326. Power of Three
 * Given an integer, write a function to determine if it is a
 * power of three.
 * <p>
 * Example 1:
 * Input: 27
 * Output: true
 * <p>
 * Example 2:
 * Input: 0
 * Output: false
 * Example 3:
 * <p>
 * Input: 9
 * Output: true
 * <p>
 * Example 4:
 * Input: 45
 * Output: false
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 * @author xdshen
 */
public class PowerOfThreeSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        int base = 3;

        //1162261467 is 3^19,  3^20 is bigger than int
        if (n > 1) {
            while (n % base == 0) {
                n /= base;
            }
        }

        return n == 1;
    }
}
