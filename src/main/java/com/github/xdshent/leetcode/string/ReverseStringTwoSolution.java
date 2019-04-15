package com.github.xdshent.leetcode.string;

/**
 * 541. Reverse String II
 * Given a string and an integer k, you need to reverse the first k characters
 * for every 2k character counting from the start of the string. If there are
 * less than k characters left, reverse all of them. if there are less than ak
 * but greater than or equal to k characters, then reverse the first k characters
 * and left the other as original.
 * <p>
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * <p>
 * Restrictions:
 * 1. The string consists of lower English letters only.
 * 2. Length of the given string and k will in the range [1, 10000]
 *
 * @author xdshen
 */
public class ReverseStringTwoSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        int minLength = 2;
        if (s == null || s.length() < minLength) {
            return s;
        }

        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int j = Math.min(i + k - 1, chars.length - 1);
            reverse(chars, i, j);
            i += k * 2;
        }
        return String.valueOf(chars);
    }

    /**
     * reverse
     *
     * @param array
     * @param left
     * @param right
     */
    private void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }
}
