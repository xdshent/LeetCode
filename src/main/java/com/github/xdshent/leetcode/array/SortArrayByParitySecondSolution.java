package com.github.xdshent.leetcode.array;

/**
 * 922. Sort Array By Parity II
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * <p>
 * Note:
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *
 * @author xdshen
 */
public class SortArrayByParitySecondSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParityII(int[] nums) {
        int minLength = 2;
        if (nums == null || nums.length < minLength) {
            return nums;
        }

        int oddIndex = 0;
        int evenIndex = 1;

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 0) {
                result[oddIndex] = nums[i];
                oddIndex += 2;
            } else {
                result[evenIndex] = nums[i];
                evenIndex += 2;
            }
        }

        return result;
    }
}
