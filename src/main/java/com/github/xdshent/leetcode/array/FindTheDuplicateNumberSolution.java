package com.github.xdshent.leetcode.array;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n(inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate.
 *
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2
 *
 * Example 2:
 * Input: [3,1,3,4,2]
 * Output: 3
 *
 * @author xdshen
 */
public class FindTheDuplicateNumberSolution {
    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] == nums[nums[i] - 1]) {
                    return nums[i];
                }
                swap(nums, i);
            }
        }
        return -1;
    }

    /**
     * swap
     *
     * @param nums
     * @param i
     */
    private static void swap(int[] nums, int i) {
        int temp = nums[i];
        nums[i] = nums[temp - 1];
        nums[temp - 1] = temp;
    }
}
