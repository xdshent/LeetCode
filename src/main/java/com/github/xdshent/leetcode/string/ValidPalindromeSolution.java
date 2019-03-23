package com.github.xdshent.leetcode.string;

/**
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string
 * as valid palindrome.
 * <p>
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * <p>
 * Example 2:
 * Input: "race a car"
 * Output: false
 *
 * @author xdshen
 */
public class ValidPalindromeSolution {
    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        char leftChar;
        char rightChar;
        while (left < right) {
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }

                right--;
                left++;
            }
        }
        return true;
    }
}
