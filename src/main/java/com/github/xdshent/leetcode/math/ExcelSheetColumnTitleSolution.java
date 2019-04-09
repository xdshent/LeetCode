package com.github.xdshent.leetcode.math;

/**
 * 168. Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title
 * as appear in an Excel sheet.
 * <p>
 * For example:
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * 28 -> AB
 * <p>
 * Example 1:
 * Input: 1
 * Output: "A"
 * <p>
 * Example 2:
 * Input: 28
 * Output: "AB"
 *
 * @author xdshen
 */
public class ExcelSheetColumnTitleSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        if (n < 1) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            n--;
            stringBuilder.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return stringBuilder.toString();
    }
}
