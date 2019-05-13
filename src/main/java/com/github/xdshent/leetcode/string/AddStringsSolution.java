package com.github.xdshent.leetcode.string;

/**
 * 415. Add Strings
 * Given two non-negative integers num1 and num2 represented
 * as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * @author xdshen
 */
public class AddStringsSolution {

    /**
     * Time Complexity: O(max(num1,num2))
     * Space Complexity: O(max(num1,num2))
     *
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            carry += i >= 0 ? num1.charAt(i--) - '0' : 0;
            carry += j >= 0 ? num2.charAt(j--) - '0' : 0;

            result.append(carry % 10);
            carry = carry / 10;
        }

        if (carry > 0) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}
