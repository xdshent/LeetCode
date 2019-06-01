package com.github.xdshent.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right
 * order.  For example, if X = 1231, then the array form is [1,2,3,1].
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 * <p>
 * Example 1:
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * <p>
 * Example 2:
 * Input: A = [2,7,4], K = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * <p>
 * Example 3:
 * Input: A = [2,1,5], K = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * <p>
 * Example 4:
 * Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * Output: [1,0,0,0,0,0,0,0,0,0,0]
 * Explanation: 9999999999 + 1 = 10000000000
 * <p>
 * <p>
 * Note：
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * If A.length > 1, then A[0] != 0
 *
 * @author xdshen
 */
public class AddToArrayFromOfIntegerSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new LinkedList<>();
        if (A == null || A.length == 0) {
            result.add(K);
            return result;
        }

        for (int i = A.length - 1; i >= 0; i--) {
            result.add(0, (K + A[i]) % 10);
            K = (K + A[i]) / 10;
        }

        while (K > 0) {
            result.add(0, K % 10);
            K /= 10;
        }

        return result;
    }
}
