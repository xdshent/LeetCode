package com.github.xdshent.leetcode.string;

/**
 * 58. Length of Last Word
 * Given a string s consists of upper/lower-case alphabets and empty
 * space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exists, return 0.
 * <p>
 * Note:
 * A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * Input: "Hello World"
 * Output: 5
 *
 * @author xdshen
 */
public class LengthOfLastWordSolution {

    /**
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}
