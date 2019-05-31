package com.github.xdshent.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Given an array of integers where 1 <= a[i] <= n(n=size of array), some elements appear
 * twice and others appear once.
 * Find all the elements of [1,n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(N) runtime? You may assume the returned list
 * does not count as extra space.
 * <p>
 * Example:
 * Input: {4,3,2,7,8,2,3,1}
 * Output: {5,6}
 *
 * @author xdshen
 */
public class FindAllNumbersDisappearedSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbersFirst(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return Collections.emptyList();
        }

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);

            if (nums[index - 1] > 0) {
                nums[index - 1] = -nums[index - 1];
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
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
    public List<Integer> findDisappearedNumbersSecond(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return Collections.emptyList();
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;
    }

}
