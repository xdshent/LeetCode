package com.github.xdshent.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 * Given a pattern and a string str, find if str follows the same
 * pattern.
 * Here follow means a full match, such that there is a bijection
 * between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * <p>
 * Example 2:
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * <p>
 * Example 3:
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * <p>
 * Notes:
 * You may assume pattern contains only lowercase letters, and str
 * contains lowercase letters that may be separated by a single space.
 *
 * @author xdshen
 */
public class WordPatternSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String[] array = str.split(" ");
        Map<Character, String> map = new HashMap<>(16);
        if (array.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(array[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(array[i])) {
                    return false;
                }
                map.put(c, array[i]);
            }
        }
        return true;
    }
}
