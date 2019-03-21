package com.github.xdshent.leetcode.bit;

/**
 * 136. Single Number
 * Given a non-empty array of integers, every element appears
 * twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * <p>
 * Example 1:
 * Input: {2,2,1}
 * Output: 1
 * <p>
 * Example 2:
 * Input: {4,1,2,1,2}
 * Output: 4
 *
 * @author xdshen
 */
public class SingleNumberSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
}
