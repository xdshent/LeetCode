package com.github.xdshent.leetcode.array;

/**
 * 287. Find the Duplicate Number
 * Given an array nums containing n + 1 integers where each integer is between 1 and n(inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate.
 * <p>
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2
 * <p>
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
    public int findDuplicateFirst(int[] nums) {
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
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findDuplicateSecond(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return -1;
        }

        int left = 1;
        int right = nums.length - 1;
        int count = 0;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            count = countInRange(nums, left, middle);

            if (left == right) {
                if (count > 1) {
                    return left;
                }
            }

            if (count > middle - left + 1) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    /**
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private int countInRange(int[] nums, int left, int right) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= left && nums[i] <= right) {
                count++;
            }
        }
        return count;
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