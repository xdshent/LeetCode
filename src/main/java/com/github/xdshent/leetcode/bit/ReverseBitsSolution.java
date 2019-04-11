package com.github.xdshent.leetcode.bit;

/**
 * 190. Reverse Bits
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Example 1:
 * Input: 00000010100101000001111010011100
 * Output: 00111001011110000010100101000000
 * Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer
 * 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
 *
 * @author xdshen
 */
public class ReverseBitsSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        int length = 32;
        for (int i = 0; i < length; i++) {
            result <<= 1;
            result |= n & 1;
            n >>>= 1;
        }
        return result;
    }
}
