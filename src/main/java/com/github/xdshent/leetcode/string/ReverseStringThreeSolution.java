package com.github.xdshent.leetcode.string;

/**
 * 557. Reverse Words in a String III
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoC"
 * <p>
 * Note:
 * In the string, each word is separated by single space and there will
 * not be any extra space in the string.
 *
 * @author xdshen
 */
public class ReverseStringThreeSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        int minLength = 2;
        if (s == null || s.length() < minLength) {
            return s;
        }

        char[] chars = s.toCharArray();
        int spaceIndex = 0;
        int startIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, startIndex, spaceIndex - 1);
                startIndex = spaceIndex + 1;
            }
            spaceIndex++;
        }

        reverse(chars, startIndex, spaceIndex - 1);
        return String.valueOf(chars);
    }

    /**
     * reverse
     *
     * @param chars
     * @param start
     * @param end
     */
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}
