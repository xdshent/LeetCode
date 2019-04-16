package com.github.xdshent.leetcode.string;

/**
 * 917. Reverse Only Letters
 * Given a String s, return the "reversed" string where all characters that are
 * not a letter stay in the same place, and all letters reverse their positions.
 * <p>
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 * <p>
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * <p>
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * <p>
 * Note:
 * 1. s.length <= 100
 * 2. 33 <= s[i].ASCIIcode <= 122
 * 3. s doesn't contain \ or "
 *
 * @author xdshen
 */
public class ReverseOnlyLettersSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String reverseOnlyLetters(String s) {
        int minLength = 2;
        if (s == null || s.length() < minLength) {
            return s;
        }

        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }

        return String.valueOf(chars);
    }
}
