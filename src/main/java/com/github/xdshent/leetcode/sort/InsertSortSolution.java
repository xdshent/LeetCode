package com.github.xdshent.leetcode.sort;

/**
 * Insert Sort
 *
 * @author xdshen
 */
public class InsertSortSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void insertSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];

            int j = i - 1;
            while (insertValue < array[j] && j >= 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = insertValue;
        }
    }
}
