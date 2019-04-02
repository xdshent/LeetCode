package com.github.xdshent.leetcode.sort;

/**
 * bubble sort
 *
 * @author xdshen
 */
public class BubbleSortSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        boolean flag;
        for (int i = 0; i < array.length - 1; i++) {

            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] ^= array[j + 1];
                    array[j + 1] ^= array[j];
                    array[j] ^= array[j + 1];
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }
}
