package com.github.xdshent.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does
 * not exist, output -1 for this number.
 * <p>
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so
 * output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * <p>
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4].
 * Output: [3,-1]
 * Explanation:
 * For number 2 in the first array, the next greater number for it in the second array is 3.
 * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * <p>
 * Note:
 * All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 *
 * @author xdshen
 */
public class NextGreaterElementSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElementFirst(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0
                || nums2 == null || nums2.length == 0) {

            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>(16);
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num) {

                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {

            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElementSecond(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0
                || nums2 == null || nums2.length == 0) {

            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>(16);
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {

            map.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;

            for (int j = map.get(nums1[i]) + 1; j < nums2.length; j++) {

                if (nums2[j] > nums1[i]) {

                    result[i] = nums2[j];
                    break;
                }
            }
        }

        return result;
    }
}
