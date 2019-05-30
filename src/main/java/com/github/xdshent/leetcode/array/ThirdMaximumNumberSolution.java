package com.github.xdshent.leetcode.array;

/**
 * 414. Third Maximum Number
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it not exist, return maximum number.The time complexity must be in O(n).
 * <p>
 * Example 1:
 * Input: {3,2,1}
 * Output: 1
 * Explanation: The third maximum is 1.
 * <p>
 * Example 2:
 * Input: {1,2}
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * <p>
 * Example 3:
 * Input: {2,2,3,1}
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 * @author xdshen
 */
public class ThirdMaximumNumberSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int val : nums) {
            if (val > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = val;
            } else if (val > secondMax && val < firstMax) {
                thirdMax = secondMax;
                secondMax = val;
            } else if (val > thirdMax && val < secondMax) {
                thirdMax = val;
            }
        }

        return (int) (thirdMax == Long.MIN_VALUE ? firstMax : thirdMax);
    }
}
