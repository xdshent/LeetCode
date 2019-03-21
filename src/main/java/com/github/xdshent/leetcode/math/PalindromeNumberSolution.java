package com.github.xdshent.leetcode.math;

/**
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. An
 * integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121
 * Output: true
 * <p>
 * Example 2:
 * Input: -121
 * Output: false
 *
 * @author xdshen
 */
public class PalindromeNumberSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        boolean precondition = x < 0 || (x != 0 && x % 10 == 0);
        if (precondition) {
            return false;
        }

        int result = 0;
        int y = x;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result == y;
    }
}
