package com.github.xdshent.leetcode.string;

/**
 * 459. Repeated Substring Pattern
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring
 * together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * <p>
 * Example 1:
 * Input: "abab"
 * Output: True
 * Explanation: It's the substring "ab" twice.
 * <p>
 * Example 2:
 * Input: "aba"
 * Output: False
 * <p>
 * Example 3:
 * Input: "abcabcabcabc"
 * Output: True
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 *
 * @author xdshen
 */
public class RepeatedSubstringPatternSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) {

            return false;
        }

        int n = s.length();
        int start = 0;
        int mid = 2;
        String word = null;
        for (int i = 1; i <= n / mid; i++) {
            if (n % i != 0) {

                continue;
            }

            word = s.substring(0, i);
            start = 0;
            while (start < n) {
                if (!s.startsWith(word, start)) {

                    break;
                }

                start += i;
            }

            if (start == n) {

                return true;
            }
        }

        return false;
    }
}
