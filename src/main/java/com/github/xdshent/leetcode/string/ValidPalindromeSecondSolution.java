package com.github.xdshent.leetcode.string;

/**
 * 680. Valid Palindrome II
 * Given a non-empty string s, you may delete at most one character. Judge whether
 * you can make it palindrome.
 * <p>
 * Example 1:
 * Input: "aba"
 * Output: true
 * <p>
 * Example 2:
 * Input: "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * <p>
 * Note:
 * The string will only contain lowercase characters a-z. The maximum length of the
 * string is 50000.
 *
 * @author xdshen
 */
public class ValidPalindromeSecondSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {

        for (int i = 0; i < s.length() >> 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;

                return (isPalindromeRange(s, i + 1, j))
                        || (isPalindromeRange(s, i, j - 1));
            }
        }
        return true;
    }

    /**
     *
     * @param s
     * @param i
     * @param j
     * @return
     */
    private boolean isPalindromeRange(String s, int i, int j) {
        char[] chars = s.toCharArray();

        for (int k = i; k <= i + ((j - i) >> 1); k++) {
            if (chars[k] != chars[j - k + i]) {
                return false;
            }
        }
        return true;
    }
}
