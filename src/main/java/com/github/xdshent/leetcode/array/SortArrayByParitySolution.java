package com.github.xdshent.leetcode.array;

/**
 * 905. Sort Array By Parity
 * Given an array A of non-negative integers, return an array consisting of all the even
 * elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: {3,1,2,4}
 * Output: {2,4,3,1}
 * The outputs {4,2,3,1}, {2,4,1,3}, and {4,2,1,3} would also be accepted.
 * <p>
 * Note:
 * 1. 1 <= A.length <= 5000
 * 2. 0 <= A[i] <= 5000
 *
 * @author xdshen
 */
public class SortArrayByParitySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param array
     * @return
     */
    public int[] sortArrayByParity(int[] array) {
        if (array == null || array.length == 1) {
            return array;
        }

        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 0) {
                int temp = array[i];
                array[i] = array[evenIndex];
                array[evenIndex] = temp;
                evenIndex++;
            }
        }
        return array;
    }
}
