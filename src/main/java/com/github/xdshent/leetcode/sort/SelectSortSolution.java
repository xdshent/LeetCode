package com.github.xdshent.leetcode.sort;

/**
 * Select Sort
 *
 * @author xdshen
 */
public class SelectSortSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void selectSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minValue = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (minValue > array[j]) {
                    minIndex = j;
                    minValue = array[j];
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    /**
     * swap
     *
     * @param array
     * @param i
     * @param minIndex
     */
    private void swap(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
}
