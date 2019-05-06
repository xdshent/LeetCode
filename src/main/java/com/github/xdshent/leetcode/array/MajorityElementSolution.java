package com.github.xdshent.leetcode.array;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more
 * than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * Input: {3,2,3}
 * Output: 3
 * <p>
 * Example 2:
 * Input: {2,2,1,1,1,2,2}
 * Output: 2
 *
 * @author xdshen
 */
public class MajorityElementSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int count = 0;
        int majority = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }
}
