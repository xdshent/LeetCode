package com.github.xdshent.leetcode.string;

/**
 * 344. Reverse String
 * Write a function that reverse a string. The input string is given as an array of characters
 * char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * <p>
 * You may assume all the character consist of printable ascii character.
 * <p>
 * Example 1:
 * Input: {"h","e","l","l","o"}
 * Output: {"o","l","l","e","h"}
 * <p>
 * Example 2:
 * Input: {"H","a","n","n","a","h"}
 * Output: {"h","a","n","n","a","H"}
 *
 * @author xdshen
 */
public class ReverseStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     */
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }

        int low = 0;
        int high = s.length - 1;
        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
    }
}
