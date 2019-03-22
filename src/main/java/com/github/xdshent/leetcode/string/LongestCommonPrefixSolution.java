package com.github.xdshent.leetcode.string;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst
 * an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: {"flower","flow","flight"}
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: {"dog","rice","car"}
 * Output: ""
 * <p>
 * Note:
 * All given inputs are in lowercase letters a-z.
 *
 * @author xdshen
 */
public class LongestCommonPrefixSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
}
