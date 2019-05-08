package com.github.xdshent.leetcode.array;

/**
 * 977. Squares of a Sorted Array
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted
 * non-decreasing order.
 * <p>
 * Example 1:
 * Input: {-4,-1,0,3,10}
 * Output: {0,1,9,16,100}
 * <p>
 * Example 2:
 * Input: {-7,-3,2,3,11}
 * Output: {4,9,9,49,121}
 * <p>
 * Note:
 * 1. 1 <= A.length <= 10000
 * 2. -10000 <= A[i] <= 10000
 * 3. A is sorted in non-decreasing order.
 *
 * @author xdshen
 */
public class SquaresOfSortedArraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param array
     * @return
     */
    public int[] sortedSquares(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int i = 0;
        int j = array.length - 1;
        int[] result = new int[array.length];
        for (int p = array.length - 1; p >= 0; p--) {
            if (Math.abs(array[i]) > Math.abs(array[j])) {
                result[p] = array[i] * array[i];
                i++;
            } else {
                result[p] = array[j] * array[j];
                j--;
            }
        }

        return result;
    }
}
