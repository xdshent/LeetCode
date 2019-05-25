package com.github.xdshent.leetcode.string;

/**
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist,  return -1.
 * <p>
 * Examples:
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode"
 * return 2.
 * <p>
 * Note: You may assume the string contain only lowercase letters.
 *
 * @author xdshen
 */
public class FirstUniqueCharacterInStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        if (s.length() == 1) {
            return 0;
        }

        char[] charArray = s.toCharArray();
        int[] charCount = new int[26];
        for (char c : charArray) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charCount[charArray[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
