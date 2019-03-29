package com.github.xdshent.leetcode.string;

/**
 * 28. Implement strStr()
 * Return the index of the first occurrence of needle in haystack, or
 * -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * <p>
 * Example 2:
 * Input: haystack = "aaaaaa", needle = "bba"
 * Output: -1
 * <p>
 * Clarification:
 * What should we return when needle is an empty string?
 * This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0
 * when needle is an empty string. This is consistent
 * to C's strstr() and Java's indexOf().
 *
 * @author xdshen
 */
public class ImplementStrStrSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null
                || needle.length() > haystack.length()) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            int count = 0;
            while (count < needleLength) {
                if (needle.charAt(count) != haystack.charAt(i + count)) {
                    break;
                }
                count++;
            }

            if (count == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
