package com.github.xdshent.leetcode.string;

/**
 * 709. To Lower Case
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 * <p>
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 * <p>
 * Example 2:
 * Input: "here"
 * Output: "here"
 * <p>
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * @author xdshen
 */
public class ToLowerCaseSolution {

    /**
     * Time Complexity: O(L)
     * Space Complexity: O(1)
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < strCharArray.length; i++) {
            if ((int) strCharArray[i] >= 65
                    && (int) strCharArray[i] <= 91) {
                strCharArray[i] += 32;
            }
        }

        return new String(strCharArray);
    }
}
