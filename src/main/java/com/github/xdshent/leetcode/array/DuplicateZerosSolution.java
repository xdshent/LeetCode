package com.github.xdshent.leetcode.array;

/**
 * 1089. Duplicate Zeros
 * Given a fixed length array arr of integers, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function.
 * <p>
 * Example 1:
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * <p>
 * Example 2:
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * <p>
 * Note:
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 * @author xdshen
 */
public class DuplicateZerosSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param arr
     */
    public int[] duplicateZeros(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int zeroCount = 0;
        for (int value : arr) {
            if (value == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 0) {
            return arr;
        }

        int len = arr.length + zeroCount;
        for (int i = arr.length - 1, j = len - 1; i >= 0; i--, j--) {
            if (arr[i] != 0) {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            } else {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }

                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }
        }

        return arr;
    }
}