package com.github.xdshent.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice
 * in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: {1,2,3,1}
 * Output: true
 * <p>
 * Example 2:
 * Input: {1,2,3,4}
 * Output: false
 *
 * @author xdshen
 */
public class ContainsDuplicateSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicateFirst(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicateSecond(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return false;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
