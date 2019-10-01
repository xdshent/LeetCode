package com.github.xdshent.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value
 * in the array is unique.
 * <p>
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * <p>
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * <p>
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 * <p>
 * Constraints:
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 *
 * @author xdshen
 */
public class UniqueNumberOfOccurrencesSolution {

    /**
     * Time Complexity: O(N*logN)
     * Space Complexity: O(N)
     *
     * @param arr
     * @return
     */
    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length <= 1) {

            return true;
        }

        Arrays.parallelSort(arr);
        Set<Integer> container = new HashSet<>();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {

                count++;
            } else {

                if (container.contains(count)) {

                    return false;
                }

                container.add(count);
                count = 1;
            }
        }

        return !container.contains(count);
    }
}
