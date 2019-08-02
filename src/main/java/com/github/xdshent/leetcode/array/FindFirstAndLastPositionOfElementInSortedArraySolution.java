package com.github.xdshent.leetcode.array;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * <p>
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * @author xdshen
 */
public class FindFirstAndLastPositionOfElementInSortedArraySolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {

            return result;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        boolean flag = true;

        while (left <= right) {
            mid = left + ((right - left) >> 1);

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {

                if (flag) {
                    if (mid == 0 || nums[mid - 1] != target) {
                        result[0] = mid;

                        if (mid + 1 < nums.length && nums[mid + 1] != target) {
                            result[1] = mid;
                            break;
                        } else {
                            flag = false;
                            left = 0;
                            right = nums.length - 1;
                        }
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        result[1] = mid;

                        break;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }

        return result;
    }
}
