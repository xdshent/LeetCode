package com.github.xdshent.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Given an array of integers and an integer k, find out whether there are two distinct indicates i
 * and j in the array such that nums[i] = nums[j] and the absolute between i and j is at most k.
 * <p>
 * Example 1:
 * Input: nums = {1,2,3,1}, k = 3
 * Output: true
 * <p>
 * Example 2:
 * Input: nums = {1,0,1,1}, k = 1
 * Output: true
 * <p>
 * Example 3:
 * Input: nums= {1,2,3,1,2,3}, k = 2
 * Output: false
 *
 * @author xdshen
 */
public class ContainsDuplicateSecondSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
