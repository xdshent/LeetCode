package com.github.xdshent.leetcode.string;

/**
 * 859. Buddy Strings
 * Given two strings A and B of lowercase letters, return true if and only if we can swap
 * two letters in A so that the result equals B.
 * <p>
 * Example 1:
 * Input: A = "ab", B = "ba"
 * Output: true
 * <p>
 * Example 2:
 * Input: A = "ab", B = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: A = "aa", B = "aa"
 * Output: true
 * <p>
 * Example 4:
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * <p>
 * Example 5:
 * Input: A = "", B = "aa"
 * Output: false
 * <p>
 * Note:
 * 1. 0 <= A.length <= 20000
 * 2. 0 <= B.length <= 20000
 * 3. A and B consist only of lowercase letters.
 *
 * @author xdshen
 */
public class BuddyStringsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param a
     * @param b
     * @return
     */
    public boolean buddyStrings(String a, String b) {
        if (a == null || b == null) {
            return false;
        }

        if (a.length() != b.length()) {
            return false;
        }


        if (a.equals(b)) {
            int[] count = new int[26];
            char[] chars = a.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                count[chars[i] - 'a']++;
            }

            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }

            return false;
        } else {
            int first = -1;
            int second = -1;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            return (second != -1 && a.charAt(first) == b.charAt(second)
                    && a.charAt(second) == b.charAt(first));
        }
    }
}
