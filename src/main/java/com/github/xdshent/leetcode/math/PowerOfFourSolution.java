package com.github.xdshent.leetcode.math;

/**
 * 342. Power of Four
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example 1:
 * Input: 16
 * Output: true
 * <p>
 * Example 2:
 * Input: 5
 * Output: false
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 *
 * @author xdshen
 */
public class PowerOfFourSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {

        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
