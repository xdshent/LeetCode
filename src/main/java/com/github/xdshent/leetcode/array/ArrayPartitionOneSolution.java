package com.github.xdshent.leetcode.array;

import java.util.Arrays;

/**
 * 561. Array Partition I
 * Given an array of 2n integers, your task is to group these integers into n pairs of
 * integer, say (a1,b1), (a2,b2), ..., (an,bn) which makes sum of min(ai,bi) for all i
 * from 1 to n as large as possible.
 * <p>
 * Example 1:
 * Input: {1,4,3,2}
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1,2) + min(3,4)
 * <p>
 * Note:
 * 1. n is a positive integer, which is in the range of [1,10000].
 * 2. All the integers in the array will be in the range of [-10000,10000].
 *
 * @author xdshen
 */
public class ArrayPartitionOneSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int arrayPairSumOne(int[] nums) {
        Arrays.sort(nums);

        int step = 2;
        int result = 0;
        for (int i = 0; i < nums.length; i += step) {
            result += nums[i];
        }
        return result;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int arrayPairSumTwo(int[] nums) {
        int[] exist = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            exist[nums[i] + 10000]++;
        }

        int result = 0;
        boolean odd = true;
        for (int i = 0; i < exist.length; i++) {
            while (exist[i] > 0) {
                if (odd) {
                    result += i - 10000;
                }

                odd = !odd;
                exist[i]--;
            }
        }
        return result;
    }
}
