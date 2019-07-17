package com.github.xdshent.leetcode.sort;

/**
 * Radix Sort
 *
 * @author xdshen
 */
public class RadixSortSolution {

    private static final int RADIX = 10;

    /**
     * Time Complexity: O(dN)
     * Space Complexity: O(1)
     *
     * @param array
     */
    public void radixSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int exp;
        int max = getMax(array);


        for (exp = 1; max / exp > 0; exp *= RADIX) {
            countSort(array, exp);
        }
    }

    /**
     * count sort
     *
     * @param array
     * @param exp
     */
    private void countSort(int[] array, int exp) {
        int[] output = new int[array.length];
        int[] buckets = new int[RADIX];

        for (int value : array) {
            buckets[(value / exp) % RADIX]++;
        }

        for (int i = 1; i < RADIX; i++) {
            buckets[i] += buckets[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[buckets[(array[i] / exp) % RADIX] - 1] = array[i];
            buckets[(array[i] / exp) % RADIX]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);

        output = null;
        buckets = null;
    }

    /**
     * get maximum
     *
     * @param array
     * @return
     */
    private int getMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }
}
