package com.github.xdshent.leetcode.array;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 * Given an integer array, you need to find one continuous subarray that if you only sort this
 * subarray in ascending order, then the whole array will be sorted in ascending order, too.
 * You need to find the shortest such subarray and output its length.
 * <p>
 * Example 1:
 * Input: {2, 6, 4, 8, 10, 9, 15}
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array
 * sorted in ascending order.
 * <p>
 * Note:
 * 1. Then length of the input array is in range [1, 10,000].
 * 2. The input array may contain duplicates, so ascending order here means <=.
 *
 * @author xdshen
 */
public class ShortestUnsortedSubarraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findUnsortedSubarrayFirst(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean flag = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                flag = true;
            }

            if (flag) {
                min = Math.min(min, nums[i]);
            }
        }

        flag = false;
        for (int i = nums.length - 1 - 1; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                flag = true;
            }

            if (flag) {
                max = Math.max(max, nums[i]);
            }
        }

        int left, right;
        for (left = 0; left < nums.length; left++) {
            if (min < nums[left]) {
                break;
            }
        }

        right = nums.length - 1;
        for (; right >= 0; right--) {
            if (max > nums[right]) {
                break;
            }
        }

        return right - left < 0 ? 0 : right - left + 1;
    }

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(N)
     *
     * @param nums
     * @return
     */
    public int findUnsortedSubarraySecond(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return 0;
        }

        int[] clone = nums.clone();
        Arrays.sort(clone);

        int left = 0;
        while (left < nums.length && nums[left] == clone[left]) {
            left++;
        }

        int right = nums.length - 1;
        while (right > left && nums[right] == clone[right]) {
            right--;
        }

        return right - left + 1;
    }
}