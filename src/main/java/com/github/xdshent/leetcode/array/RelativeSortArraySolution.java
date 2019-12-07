package com.github.xdshent.leetcode.array;

/**
 * 1122. Relative Sort Array
 * <p>
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * <p>
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements
 * that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 * <p>
 * Example 1:
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * <p>
 * Constraints:
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * Each arr2[i] is distinct.
 * Each arr2[i] is in arr1.
 *
 * @author xdshen
 */
public class RelativeSortArraySolution {

    /**
     * Time Complexity: O(M^2)
     * Space Complexity: O(N)
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr2.length == 0 ||
                arr2.length > arr1.length) {

            return new int[0];
        }

        int[] bucket = new int[1001];

        int[] result = new int[arr1.length];
        int index = 0;

        for (int i : arr1) {
            bucket[i]++;
        }

        for (int i : arr2) {
            while (bucket[i]-- > 0) {
                result[index++] = i;
            }
        }

        int len = 1001;
        for (int i = 0; i < len; i++) {
            while (bucket[i]-- > 0) {
                result[index++] = i;
            }
        }

        return result;
    }
}
