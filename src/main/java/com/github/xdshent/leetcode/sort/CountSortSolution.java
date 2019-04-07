package com.github.xdshent.leetcode.sort;

/**
 * Count Sort
 *
 * @author xdshen
 */
public class CountSortSolution {

    /**
     * @param array
     */
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] temp = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            temp[array[i]]++;
        }

        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i - 1] + temp[i];
        }

        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int index = temp[array[i]] - 1;
            result[index] = array[i];
            temp[array[i]]--;
        }

        for (int i = 0; i < result.length; i++) {
            array[i] = result[i];
        }
    }
}
