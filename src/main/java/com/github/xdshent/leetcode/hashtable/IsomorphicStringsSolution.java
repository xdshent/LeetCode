package com.github.xdshent.leetcode.hashtable;

/**
 * 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same character
 * but a character may map to itself.
 * <p>
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * <p>
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 *
 * @author xdshen
 */
public class IsomorphicStringsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {

            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        int[] sm = new int[128];
        int[] tm = new int[128];

        int len = s.length();

        for (int i = 0; i < len; i++) {
            char sChar = sc[i];
            char tChar = tc[i];

            if (sm[sChar] == 0 && tm[tChar] == 0) {
                sm[sChar] = tChar;
                tm[tChar] = sChar;
            } else {
                if (sm[sChar] != tChar) {

                    return false;
                }
            }
        }

        return true;
    }
}
