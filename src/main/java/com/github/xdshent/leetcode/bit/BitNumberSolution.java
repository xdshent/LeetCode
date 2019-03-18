package com.github.xdshent.leetcode.bit;

/**
 * 191. Number of 1 Bits
 * Write a function that takes an unsigned integer and return thee number
 * of '1' bits it has.
 * <p>
 * Example 1:
 * Input: 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string
 * 00000000000000000000000000001011 has a total of three '1' bits.
 * <p>
 * Example 2:
 * Input: 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000
 * has a total of one '1' bit.
 *
 * @author xdshen
 */
public class BitNumberSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
}
