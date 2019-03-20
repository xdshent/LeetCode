package com.github.xdshent.leetcode.array;

/**
 * 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * Example 1:
 * Input: {1,3,5,6}, 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: {1,3,5,6}, 2
 * Output: 1
 * <p>
 * Example 3:
 * Input: {1,3,5,6}, 7
 * Output: 4
 *
 * @author xdshen
 */
public class SearchInsertPositionSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex = 0;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + ((endIndex - startIndex) >> 1);

            if (nums[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else if (nums[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return nums[middleIndex] > target ? middleIndex : middleIndex + 1;
    }
}
