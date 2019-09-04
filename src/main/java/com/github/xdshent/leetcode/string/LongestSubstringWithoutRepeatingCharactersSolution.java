package com.github.xdshent.leetcode.string;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author xdshen
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {

            return 0;
        }

        int len = s.length();
        int result = 0;
        int[] index = new int[128];
        for (int i = 0, j = 0; i < len; i++) {
            j = Math.max(index[s.charAt(i)], j);
            result = Math.max(result, i - j + 1);
            index[s.charAt(i)] = i + 1;
        }

        return result;
    }
}