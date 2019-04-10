package com.github.xdshent.leetcode.math;

/**
 * 171. Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet,
 * return its corresponding column number.
 * <p>
 * For example:
 * A->1
 * B->2
 * C->3
 * ...
 * Z->26
 * AA->27
 * AB->28
 * ...
 * <p>
 * Example 1:
 * Input: "A"
 * Output: 1
 * <p>
 * Example 2:
 * Input: "AB"
 * Output: 28
 * <p>
 * Example 3:
 * Input: "ZY"
 * Output: 701
 *
 * @author xdshen
 */
public class ExcelSheetColumnNumberSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int result = 0;
        for (char c : chars) {
            result = ((c - 'A') + 1) + result * 26;
        }

        return result;
    }
}
