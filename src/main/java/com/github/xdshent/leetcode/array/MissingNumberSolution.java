package com.github.xdshent.leetcode.array;

/**
 * 268. Missing Number
 * Given an array containing n distinct numbers taken from 0,1,2,...,n,
 * find the one that is missing from the array.
 * <p>
 * Example 1:
 * Input: {3,0,1}
 * Output: 2
 * <p>
 * Example 2:
 * Input: {9,6,4,2,3,5,7,0,1}
 * Output: 8
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 *
 * @author xdshen
 */
public class MissingNumberSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int missingNumberFirst(int[] nums) {

        int missingNumber = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            missingNumber ^= i ^ nums[i];
        }

        return missingNumber ^ i;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int missingNumberSecond(int[] nums) {

        int missingNumber = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums.length) {
                    missingNumber = i;
                    break;
                } else {
                    swap(nums, i, nums[i]);
                }
            }
        }
        return missingNumber;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @return
     */
    public int missingNumberThird(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum -= nums[i];
        }

        return sum + nums.length;
    }

    /**
     * swap
     *
     * @param nums
     * @param x
     * @param y
     */
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
