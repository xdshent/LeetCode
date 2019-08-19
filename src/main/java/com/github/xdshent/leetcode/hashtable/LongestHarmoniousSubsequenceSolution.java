package com.github.xdshent.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 594. Longest Harmonious Subsequence
 * We define a harmounious array as an array where the difference between
 * its maximum value and its minimum value is exactly 1.
 * <p>
 * Now, given an integer array, you need to find the length of its longest
 * harmonious subsequence among all its possible subsequences.
 * <p>
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * <p>
 * Note: The length of the input array will not exceed 20,000.
 *
 * @author xdshen
 */
public class LongestHarmoniousSubsequenceSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findLHSFirst(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        Arrays.sort(nums);
        int minIndex = 0;
        int count = 0;
        for (int i = 1; i < nums.length; ) {
            if (nums[i] - nums[minIndex] == 0) {

                i++;
            } else if (nums[i] - nums[minIndex] == 1) {

                count = Math.max(count, i - minIndex + 1);
                i++;
            } else {

                minIndex++;
            }
        }

        return count;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @return
     */
    public int findLHSSecond(int[] nums) {
        if (nums == null || nums.length <= 1) {

            return 0;
        }

        Map<Integer, Integer> cache = new HashMap<>(16);
        for (int n : nums) {

            cache.put(n, cache.getOrDefault(n, 0) + 1);
        }

        int result = 0;
        for (int key : cache.keySet()) {
            if (cache.containsKey(key + 1)) {

                result = Math.max(result, cache.get(key) + cache.get(key + 1));
            }
        }

        return result;
    }
}
