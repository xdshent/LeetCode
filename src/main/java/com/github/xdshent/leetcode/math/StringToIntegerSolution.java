package com.github.xdshent.leetcode.math;

/**
 * 8. String to Integer (atoi)
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first
 * non-whitespace character is found. Then, starting from this character, takes an optional
 * initial plus or minus sign followed by as many numerical digits as possible, and interprets
 * them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which
 * are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or
 * if no such sequence exists because either str is empty or it contains only whitespace
 * characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 * <p>
 * Note:
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit
 * signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of
 * representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 *
 * @author xdshen
 */
public class StringToIntegerSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param str
     * @return int
     */
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        char add = '+';
        char sub = '-';
        int minLength = 2;

        if (firstChar == add || firstChar == sub) {
            sign = (str.charAt(0) == sub) ? -1 : 1;
            if (str.length() < minLength || !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            start++;
        }

        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) sum * sign;
            }
            int d = str.charAt(i) - '0';

            if (sum > (Integer.MAX_VALUE - d) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            sum = sum * 10 + d;
        }
        return (int) sum * sign;
    }
}
