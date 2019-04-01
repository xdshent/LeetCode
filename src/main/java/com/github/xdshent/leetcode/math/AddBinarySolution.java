package com.github.xdshent.leetcode.math;

/**
 * 67. Add Binary
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * <p>
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * @author xdshen
 */
public class AddBinarySolution {

    /**
     * Time Complexity: O(max(M,N))
     * Space Complexity: O(1)
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;

        while (aLen >= 0 || bLen >= 0) {
            int sum = carry;
            if (aLen >= 0) {
                sum += a.charAt(aLen--) - '0';
            }

            if (bLen >= 0) {
                sum += b.charAt(bLen--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
