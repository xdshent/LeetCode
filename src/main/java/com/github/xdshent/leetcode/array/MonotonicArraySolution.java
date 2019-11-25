package com.github.xdshent.leetcode.array;

/**
 * 896. Monotonic Array
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for
 * all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 * <p>
 * Example 1:
 * Input: [1,2,2,3]
 * Output: true
 * <p>
 * Example 2:
 * Input: [6,5,4,4]
 * Output: true
 * <p>
 * Example 3:
 * Input: [1,3,2]
 * Output: false
 * <p>
 * Example 4:
 * Input: [1,2,4,5]
 * Output: true
 * <p>
 * Example 5:
 * Input: [1,1,1]
 * Output: true
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 50000
 * -100000 <= A[i] <= 100000
 *
 * @author xdshen
 */
public class MonotonicArraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public boolean isMonotonic(int[] nums) {
        int minLen = 3;
        if (nums == null || nums.length < minLen) {

            return true;
        }

        if (nums[0] <= nums[nums.length - 1]) {

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {

                    return false;
                }
            }

            return true;
        } else {

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {

                    return false;
                }
            }

            return true;
        }
    }
}
