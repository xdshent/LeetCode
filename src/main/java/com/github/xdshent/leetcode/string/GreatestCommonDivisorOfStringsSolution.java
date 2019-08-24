package com.github.xdshent.leetcode.string;

/**
 * 1071. Greatest Common Divisor of Strings
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T(T concatenated with itself 1 or more times)
 * Return the largest string X such that X divides str1 and X divides str2.
 * <p>
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * <p>
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * <p>
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 * Note:
 * 1 <= str1.length <= 1000
 * 1 <= str2.length <= 1000
 * str1[i] and str2[i] are English uppercase letters.
 *
 * @author xdshen
 */
public class GreatestCommonDivisorOfStringsSolution {

    /**
     * Time Complexity: O(log(Max(str1.length,str2.length)))
     * Space Complexity: O(logN)
     *
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {

            return "";
        }

        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = getGcd(len1, len2);

        if (len1 < len2) {

            return str1.substring(0, gcd);
        }

        return str2.substring(0, gcd);
    }

    /**
     * @param len1
     * @param len2
     * @return
     */
    private int getGcd(int len1, int len2) {

        return len1 % len2 == 0 ? len2 : getGcd(len2, len1 % len2);
    }
}
