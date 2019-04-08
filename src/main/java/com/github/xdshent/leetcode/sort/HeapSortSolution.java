package com.github.xdshent.leetcode.sort;

/**
 * Heap Sort
 *
 * @author xdshen
 */
public class HeapSortSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void heapSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int startIndex = array.length / 2;
        for (int i = startIndex; i >= 0; i--) {
            heapAdjust(array, i, array.length - 1);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapAdjust(array, 0, i - 1);
        }
    }

    /**
     * heap adjust
     *
     * @param array
     * @param startIndex
     * @param endIndex
     */
    private void heapAdjust(int[] array, int startIndex, int endIndex) {

        int parent = array[startIndex];
        int left = startIndex * 2 + 1;

        for (int i = left; i <= endIndex; ) {
            if (i < endIndex && array[i] < array[i + 1]) {
                i++;
            }

            if (parent > array[i]) {
                break;
            }

            array[startIndex] = array[i];
            startIndex = i;
            i = startIndex * 2 + 1;
        }

        array[startIndex] = parent;
    }
}
