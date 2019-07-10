package com.github.xdshent.leetcode.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number,
 * including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 * @author xdshen
 */
public class SelfDividingNumbersSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        if (left > right) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (valid(i)) {

                result.add(i);
            }
        }

        return result;
    }

    /**
     * @param num
     * @return
     */
    private boolean valid(int num) {
        int temp = num;
        while (temp > 0) {
            if (temp % 10 == 0) {
                return false;
            }

            if (num % (temp % 10) != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
}
