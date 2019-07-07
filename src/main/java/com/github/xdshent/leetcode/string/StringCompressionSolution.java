package com.github.xdshent.leetcode.string;

/**
 * 443. String Compression
 * Given an array of characters, compress it in-place.
 * The length after compression must always be smaller than or equal to the original array.
 * Every element of the array should be a character (not int) of length 1.
 * After you are done modifying the input array in-place, return the new length of the array.
 * <p>
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * <p>
 * Example 1:
 * Input:
 * ["a","a","b","b","c","c","c"]
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 * <p>
 * Example 2:
 * Input:
 * ["a"]
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * Explanation:
 * Nothing is replaced.
 * <p>
 * Example 3:
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output:
 * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by
 * "b12".
 * Notice each digit has it's own entry in the array.
 * <p>
 * Note:
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 *
 * @author xdshen
 */
public class StringCompressionSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }

        int index = 0;
        int n = chars.length;
        int i = 0;

        while (i < n) {
            char character = chars[i];
            int j = i;
            while (j < n && character == chars[j]) {
                j++;
            }

            int freq = j - i;
            chars[index++] = character;

            if (freq == 1) {

            } else if (freq < 10) {
                chars[index++] = (char) (freq + '0');
            } else {
                String strFreq = String.valueOf(freq);
                for (char c : strFreq.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }

        return index;
    }
}
