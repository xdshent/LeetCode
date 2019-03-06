package com.github.xdshent.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indicates of the two numbers such that
 * they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1]
 *
 * @author xdshen
 */
public class TwoSumSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return new int[]{};
        }

        Map<Integer, Integer> container = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (container.containsKey(target - nums[i])) {
                return new int[]{container.get(target - nums[i]), i};
            }
            container.put(nums[i], i);
        }
        return new int[]{};
    }
}
