package com.github.xdshent.leetcode.slidingwindow;

import java.util.LinkedList;

/**
 * 239. Sliding Window Maximum
 * Given an array nums, there is a sliding window of size k which is moving from
 * the very left of the array to the very right.You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position. Return the max sliding window.
 * <p>
 * Example:
 * Input: nums = {1,3,-1,-3,5,3,6,7}, and k = 3
 * Output: {3,3,5,5,6,7}
 * Explanation:
 * <p>
 * Window position         Max
 * ----------------       ------
 * [1,3,-1],-3,5,3,6,7      3
 * 1,[3,-1,-3],5,3,6,7      3
 * 1,3,[-1,-3,5],3,6,7      5
 * 1,3,-1,[-3,5,3],6,7      5
 * 1,3,-1,-3,[5,3,6],7      6
 * 1,3,-1,-3,5,[3,6,7]      7
 * <p>
 * Note:
 * You may assume k is always valid, 1<=k<=input array's size for non-empty array.
 * <p>
 * Follow up:
 * Could you solve it in linear time?
 *
 * @author xdshen
 */
public class SlidingWindowMaximumSolution {

    /**
     * Time Complexity: O(N)
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) {
            return new int[]{};
        }

        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }

            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.pollFirst();
            }

            queue.addLast(i);
            if (i - k + 1 >= 0) {
                result[index++] = nums[queue.peekFirst()];
            }
        }
        return result;
    }
}
