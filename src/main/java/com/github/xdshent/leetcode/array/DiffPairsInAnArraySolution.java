package com.github.xdshent.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 532. K-diff Pairs in an Array
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is
 * defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
 * <p>
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * <p>
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * <p>
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 * <p>
 * Note:
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 *
 * @author xdshen
 */
public class DiffPairsInAnArraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @param k
     * @return
     */
    public int findPairsFirst(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k < 0) {

            return 0;
        }

        Map<Integer, Integer> container = new HashMap<>(16);
        for (Integer num : nums) {

            container.put(num, container.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : container.entrySet()) {

            if (k == 0) {
                if (entry.getValue() >= 2) {

                    result++;
                }
            } else {
                if (container.containsKey(entry.getKey() + k)) {

                    result++;
                }
            }
        }

        return result;
    }

    /**
     * Time Complexity: O(N*logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param k
     * @return
     */
    public int findPairsSecond(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k < 0) {

            return 0;
        }

        Arrays.sort(nums);
        int left = 0;
        int result = 0;
        int prev = Integer.MAX_VALUE;

        for (int right = 1; right < nums.length; right++) {
            while (left < right && nums[right] - nums[left] > k) {

                left++;
            }

            if (left != right && prev != nums[left] && nums[right] - nums[left] == k) {

                result++;
                prev = nums[left];
            }
        }

        return result;
    }
}
