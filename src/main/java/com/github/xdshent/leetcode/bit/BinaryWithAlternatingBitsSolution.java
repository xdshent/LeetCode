package com.github.xdshent.leetcode.bit;

/**
 * 693. Binary Number with Alternating Bits
 * Given a positive integer, check whether is has alternating bits: namely, if
 * two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * <p>
 * Example 2:
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111
 * <p>
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * <p>
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 *
 * @author xdshen
 */
public class BinaryWithAlternatingBitsSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        /**
         * last bit
         */
        int cur = n & 1;

        /**
         * rest bits
         */
        n >>= 1;

        while (n > 0) {
            if (cur == (n & 1)) {
                return false;
            }

            cur = n & 1;
            n >>= 1;
        }
        return true;
    }
}
