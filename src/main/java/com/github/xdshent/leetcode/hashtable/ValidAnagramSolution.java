package com.github.xdshent.leetcode.hashtable;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * Given two string s and t, write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode character? How would you adapt your solution to such case?
 *
 * @author xdshen
 */
public class ValidAnagramSolution {

    /**
     * Time Complexity: O(N logN)
     * Space Complexity: O(1)
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramFirst(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramSecond(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        int[] counter = new int[26];
        for (int i = 0; i < charArray1.length; i++) {
            counter[charArray1[i] - 'a']++;
            counter[charArray2[i] - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
