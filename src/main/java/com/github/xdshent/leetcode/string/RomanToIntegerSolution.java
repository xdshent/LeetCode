package com.github.xdshent.leetcode.string;

/**
 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The
 * number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number
 * four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine,
 * which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * Input: "III"
 * Output: 3
 * <p>
 * Example 2:
 * Input: "IV"
 * Output: 4
 * <p>
 * Example 3:
 * Input: "IX"
 * Output: 9
 * <p>
 * Example 4:
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Example 5:
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * @author xdshen
 */
public class RomanToIntegerSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        int[] valueMap = new int[26];
        valueMap['I' - 'A'] = 1;
        valueMap['V' - 'A'] = 5;
        valueMap['X' - 'A'] = 10;
        valueMap['L' - 'A'] = 50;
        valueMap['C' - 'A'] = 100;
        valueMap['D' - 'A'] = 500;
        valueMap['M' - 'A'] = 1000;

        int pre = 1000;
        int result = 0;

        for (char c : s.toCharArray()) {
            int current = valueMap[c - 'A'];
            if (pre < current) {
                result -= 2 * pre;
            }

            result += current;
            pre = current;
        }

        return result;
    }
}
