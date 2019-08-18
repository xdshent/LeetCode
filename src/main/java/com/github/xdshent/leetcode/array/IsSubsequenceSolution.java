package com.github.xdshent.leetcode.array;

/**
 * 392. Is Subsequence
 * Given a string s and a string t, check if s is subsequence of t.
 * <p>
 * You may assume that there is only lower case English letters in both s and t.
 * t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
 * <p>
 * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters
 * without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Example 1:
 * s = "abc", t = "ahbgdc"
 * Return true.
 * <p>
 * Example 2:
 * s = "axc", t = "ahbgdc"
 * Return false.
 * <p>
 * Follow up:
 * If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In
 * this scenario, how would you change your code?
 * <p>
 * Credits:
 * Special thanks to @pbrother for adding this problem and creating all test cases.
 *
 * @author xdshen
 */
public class IsSubsequenceSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int fromIndex = 0;
        for (char c : s.toCharArray()) {
            fromIndex = t.indexOf(c, fromIndex);
            if (fromIndex++ < 0) {

                return false;
            }
        }

        return true;
    }
}
