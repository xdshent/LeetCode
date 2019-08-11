package com.github.xdshent.leetcode.hashtable;

/**
 * 409. Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * Input:
 * "abccccdd"
 * Output:
 * 7
 * <p>
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 * @author xdshen
 */
public class LongestPalindromeSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] count = new int[128];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            count[c]++;
        }

        int result = 0;
        for (int c : count) {
            if (c == 0) {
                continue;
            }

            result += c / 2 * 2;
            if (result % 2 == 0
                    && c % 2 == 1) {

                result++;
            }
        }

        return result;
    }
}