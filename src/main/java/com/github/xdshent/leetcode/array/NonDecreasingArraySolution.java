package com.github.xdshent.leetcode.array;

/**
 * 665. Non-decreasing Array
 * Given an array with n integers, your task is to check if it could
 * become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds
 * for every i (1 <= i < n).
 * <p>
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing
 * array.
 * <p>
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one
 * element.
 * Note: The n belongs to [1, 10,000].
 *
 * @author xdshen
 */
public class NonDecreasingArraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length <= minLength) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;

                if (count > 1) {
                    return false;
                }

                if (i > 0) {
                    if (nums[i + 1] > nums[i - 1]) {
                        nums[i] = nums[i - 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                }
            }
        }

        return true;
    }
}