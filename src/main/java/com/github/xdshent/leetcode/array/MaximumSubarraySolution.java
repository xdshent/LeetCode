package com.github.xdshent.leetcode.array;

/**
 * Given an integer array nums, find the contiguous subarray(containing at least one number)
 * which has the largest sum and return its sum.
 * <p>
 * Example:
 * Input: {-2,1,-3,4,-1,2,1,-5,-4}
 * Output: 6
 * Explanation: {4,-1,2,1} has the largest sum = 6.
 * <p>
 * Follow up:
 * If you have figured out the O(N) solution, try coding another solution using the divide
 * and conquer approach, which is more subtle.
 *
 * @author xdshen
 */
public class MaximumSubarraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (result < 0) {
                result = nums[i];
            } else {
                result += nums[i];
            }

            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
