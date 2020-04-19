package com.github.xdshent.leetcode.array;

/**
 * 75. Sort Colors
 * <p>
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same
 * color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not suppose to use the library's sort function for this problem.
 * <p>
 * Example:
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * <p>
 * Follow up:
 * <p>
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of
 * 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 *
 * @author xdshen
 */
public class SortColorsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        if (nums == null
                || nums.length == 1) {
            return;
        }

        int left = -1;
        int right = nums.length;
        int index = 0;

        while (index < right) {
            if (nums[index] == 1) {
                index++;
            } else if (nums[index] < 1) {
                swap(nums, index++, ++left);
            } else {
                swap(nums, index, --right);
            }
        }
    }

    /**
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
