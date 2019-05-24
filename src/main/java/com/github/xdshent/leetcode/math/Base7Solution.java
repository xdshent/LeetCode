package com.github.xdshent.leetcode.math;

/**
 * 504. Base 7
 * Given an integer, return its base 7 string representation.
 * <p>
 * Example 1:
 * <p>
 * Input: 100
 * Output: "202"
 * Example 2:
 * <p>
 * Input: -7
 * Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7].
 *
 * @author xdshen
 */
public class Base7Solution {

    /**
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public String convertToBase7(int num) {
        int base = 1, result = 0;

        while (num != 0) {
            result += base * (num % 7);
            num /= 7;
            base *= 10;
        }

        return String.valueOf(result);
    }
}
