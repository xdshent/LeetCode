package com.github.xdshent.leetcode.array;

/**
 * 941. Valid Mountain Array
 * Given an array A of integer, return true if and only if it is a valid mountain array.
 * Recall that A is a mountain array if and only if:
 * <p>
 * 1. A.length >= 3
 * 2. There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 * <p>
 * <p>
 * Example 1:
 * Input: [2,1]
 * Output: false
 * <p>
 * Example 2:
 * Input: [3,5,5]
 * Output: false
 * <p>
 * Example 3:
 * Input: [0,3,2,1]
 * Output: true
 * <p>
 * Note:
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 *
 * @author xdshen
 */
public class ValidMountainArraySolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param A
     * @return
     */
    public boolean validMountainArray(int[] A) {
        int minLength = 3;
        if (A == null || A.length < minLength || A[0] > A[1]) {
            return false;
        }

        int i = 0;
        while (i < A.length - 1 && A[i] < A[i + 1]) {
            i++;
        }

        if (i == A.length - 1) {
            return false;
        }

        while (i < A.length - 1 && A[i] > A[i + 1]) {
            i++;
        }

        return i == A.length - 1;
    }
}
