package com.github.xdshent.leetcode.string;

/**
 * 151. Reverse Words in a String
 * Given an input string, reverse the string word by word.
 * <p>
 * Example 1:
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * <p>
 * Example 2:
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed
 * string.
 * <p>
 * Note:
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain
 * leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 * <p>
 * <p>
 * Follow up:
 * For C programmers, try to solve it in-place in O(1) extra space.
 *
 * @author xdshen
 */
public class ReverseWordsInStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String reverseWordsSecond(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        if (s.trim().length() <= 1) {
            return s.trim();
        }

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equals("")) {
                continue;
            }
            if (i != words.length - 1) {
                sb.append(" ");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String reverseWordsFirst(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        if (s.trim().length() <= 1) {
            return s.trim();
        }

        char[] a = s.toCharArray();
        int n = a.length;

        reverse(a, 0, n - 1);

        reverseWords(a, n);

        return cleanSpace(a, n);
    }

    /**
     * reverse each words
     *
     * @param a
     * @param n
     */
    private void reverseWords(char[] a, int n) {
        int i = 0;
        int j = 0;

        char space = ' ';
        while (i < n) {
            while (i < j || i < n && a[i] == space) {
                i++;
            }

            while (j < i || j < n && a[j] != space) {
                j++;
            }

            reverse(a, i, j - 1);
        }
    }

    /**
     * trim leading, trailing and multiple spaces
     *
     * @param a
     * @param n
     */
    private String cleanSpace(char[] a, int n) {
        int i = 0;
        int j = 0;
        char space = ' ';

        while (j < n) {
            while (a[j] == space) {
                j++;
            }

            while (j < n && a[j] != space) {
                a[i++] = a[j++];
            }

            while (j < n && a[j] == space) {
                j++;
            }

            if (j < n) {
                a[i++] = space;
            }
        }

        return new String(a).substring(0, i);
    }

    /**
     * reverse char array from index i to j
     *
     * @param a
     * @param i
     * @param j
     */
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}
