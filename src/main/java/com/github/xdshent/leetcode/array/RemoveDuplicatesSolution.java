package com.github.xdshent.leetcode.array;

/**
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only
 * once and return new length;
 *
 * Do not allocate extra space for another array, you must do this by modifying the input
 * array in-place with O(1) extra memory.
 *
 * Example:
 * Given nums = [1,1,2]
 * Your function should return length = 2, with the first two elements of nums begin 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 *
 * Example:
 * Given nums = [0,0,1,1,1,2,2,3,3,4]
 * Your function should return length = 5, with the first five elements of nums being modified to 0,1,2,3 and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 *
 * @author xdshen
 */
public class RemoveDuplicatesSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return 1;
        }

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
