package com.github.xdshent.leetcode.array;

/**
 * 66. Plus One
 * Given a non-empty array of digits representing a non-negative integer,
 * plus one to the integer.
 * The integer are stored such that the most significant digit is at the
 * head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero,
 * except the number 0 itself.
 * <p>
 * Example 1:
 * Input: {1,2,3}
 * Output:{1,2,4}
 * <p>
 * Example 2:
 * Input: {4,3,2,1}
 * Output: {4,3,2,2}
 *
 * @author xdshen
 */
public class PlusOneSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
