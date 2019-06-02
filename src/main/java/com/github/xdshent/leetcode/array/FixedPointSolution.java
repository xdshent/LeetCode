package com.github.xdshent.leetcode.array;

/**
 * 1064. Fixed Point
 * Given an array A of distinct integers sorted in ascending order,
 * return the smallest index i that satisfies A[i] == i.  Return -1 if no
 * such i exists.
 * <p>
 * Example 1:
 * Input: [-10,-5,0,3,7]
 * Output: 3
 * Explanation:
 * For the given array, A[0] = -10, A[1] = -5, A[2] = 0, A[3] = 3, thus the output is 3.
 * <p>
 * Example 2:
 * Input: [0,2,5,8,17]
 * Output: 0
 * Explanation:
 * A[0] = 0, thus the output is 0.
 * <p>
 * Example 3:
 * Input: [-10,-5,3,4,7,9]
 * Output: -1
 * Explanation:
 * There is no such i that A[i] = i, thus the output is -1.
 * <p>
 * Note:
 * 1 <= A.length < 10^4
 * -10^9 <= A[i] <= 10^9
 *
 * @author xdshen
 */
public class FixedPointSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param A
     * @return
     */
    public int fixedPointFirst(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) {

                return i;
            }
        }

        return -1;
    }

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param A
     * @return
     */
    public int fixedPointSecond(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int minIndex = Integer.MAX_VALUE;
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (A[mid] < mid) {
                left = mid + 1;
            } else if (A[mid] > mid) {
                right = mid - 1;
            } else {
                minIndex = Math.min(minIndex, mid);
                right = mid - 1;
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }
}
