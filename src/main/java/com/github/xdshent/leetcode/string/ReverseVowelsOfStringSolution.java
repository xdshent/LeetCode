package com.github.xdshent.leetcode.string;

/**
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Input: "hello"
 * Output: "holle"
 * <p>
 * Example 2:
 * Input: "leetcode"
 * Output: "leotcede"
 *
 * @author xdshen
 */
public class ReverseVowelsOfStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        int minLength = 2;
        if (s == null || s.length() < minLength) {
            return s;
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return String.valueOf(chars);
    }

    /**
     * @param ch
     * @return
     */
    private boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
