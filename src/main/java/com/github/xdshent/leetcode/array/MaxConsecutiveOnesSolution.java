package com.github.xdshent.leetcode.array;

/**
 * 485. Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive
 * 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * <p>
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 *
 * @author xdshen
 */
public class MaxConsecutiveOnesSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(count, max);
                count = 0;
            } else {
                count++;
            }
        }

        return Math.max(count, max);
    }
}
