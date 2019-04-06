package com.github.xdshent.leetcode.sort;

/**
 * Quick Sort
 *
 * @author xdshen
 */
public class QuickSortSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        quickSort(array, 0, array.length - 1);
    }

    /**
     * @param array
     * @param left
     * @param right
     */
    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partition = partition(array, left, right);
            quickSort(array, left, partition - 1);
            quickSort(array, partition + 1, right);
        }
    }

    /**
     * @param array
     * @param left
     * @param right
     * @return
     */
    private int partition(int[] array, int left, int right) {
        int mid = left + ((right - left) >> 1);
        if (array[right] > array[mid]) {
            swap(array, right, mid);
        }

        if (array[right] > array[left]) {
            swap(array, right, left);
        }

        if (array[left] > array[mid]) {
            swap(array, left, mid);
        }

        int pivot = array[left];

        while (left < right) {
            while (left < right && pivot <= array[right]) {
                right--;
            }

            if (left < right) {
                array[left++] = array[right];
            }

            while (left < right && pivot > array[left]) {
                left++;
            }

            if (left < right) {
                array[right--] = array[left];
            }
        }

        array[left] = pivot;
        return left;
    }

    /**
     * swap
     *
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
