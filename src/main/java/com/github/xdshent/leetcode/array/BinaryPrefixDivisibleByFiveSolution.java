package com.github.xdshent.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1018. Binary Prefix Divisible By 5
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from A[0] to A[i] interpreted
 * as a binary number (from most-significant-bit to least-significant-bit.)
 * Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.
 * <p>
 * Example 1:
 * Input: [0,1,1]
 * Output: [true,false,false]
 * Explanation:
 * The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
 * Only the first number is divisible by 5, so answer[0] is true.
 * <p>
 * Example 2:
 * Input: [1,1,1]
 * Output: [false,false,false]
 * <p>
 * Example 3:
 * Input: [0,1,1,1,1,1]
 * Output: [true,false,false,false,true,false]
 * <p>
 * Example 4:
 * Input: [1,1,1,0,1]
 * Output: [false,false,false,false,false]
 * <p>
 * Note:
 * 1 <= A.length <= 30000
 * A[i] is 0 or 1
 *
 * @author xdshen
 */
public class BinaryPrefixDivisibleByFiveSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums
     * @return
     */
    public List<Boolean> prefixesDivBy5(int[] nums) {
        if (nums == null || nums.length == 0) {

            return Collections.emptyList();
        }

        List<Boolean> result = new ArrayList<>();
        int r = 0;
        for (int n : nums) {
            r = ((r << 1) | n) % 5;
            result.add(r == 0);
        }

        return result;
    }
}
