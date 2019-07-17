package com.github.xdshent.leetcode.sort;

/**
 * Merge Sort
 *
 * @author xdshen
 */
public class MergeSortSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(N)
     *
     * @param array
     */
    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        mergeSort(array, 0, array.length - 1);
    }

    /**
     * @param array
     * @param left
     * @param right
     */
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + ((right - left) >> 1);
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    /**
     * @param array
     * @param left
     * @param mid
     * @param right
     */
    private void merge(int[] array, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        if (k >= 0){
            System.arraycopy(temp, 0, array, left, k);
        }
    }
}
