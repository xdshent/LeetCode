package com.github.xdshent.leetcode.array;

/**
 * 852. Peak Index in a Mountain Array
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * Input: [0,1,0]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [0,2,1,0]
 * Output: 1
 * <p>
 * Note:
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 *
 * @author xdshen
 */
public class PeakIndexInMountainArraySolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int peakIndexInMountainArray(int[] nums) {
        if (nums == null || nums.length == 0) {

            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int leftValue = 0;
        int rightValue = 0;

        while (left <= right) {
            mid = left + ((right - left) >> 1);

            leftValue = (mid - 1) < 0 ? 0 : nums[mid - 1];
            rightValue = (mid + 1) > nums.length - 1 ? nums[nums.length - 1] : nums[mid + 1];

            if (nums[mid] >= leftValue
                    && nums[mid] > rightValue) {

                return mid;
            } else if (nums[mid] <= rightValue) {

                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }

        return -1;
    }
}
