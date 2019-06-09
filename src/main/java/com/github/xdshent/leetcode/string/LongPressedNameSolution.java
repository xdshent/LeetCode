package com.github.xdshent.leetcode.string;

/**
 * 925. Long Pressed Name
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might
 * get long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard.  Return True if it is possible that it was your
 * friends name, with some characters (possibly none) being long pressed.
 * <p>
 * Example 1:
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * <p>
 * Example 2:
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 * <p>
 * Example 3:
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 * <p>
 * Example 4:
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 * <p>
 * Note:
 * name.length <= 1000
 * typed.length <= 1000
 * The characters of name and typed are lowercase letters.
 *
 * @author xdshen
 */
public class LongPressedNameSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param name
     * @param typed
     * @return
     */
    public boolean isLongPressedName(String name, String typed) {
        int nameLength = name.length();
        int typedLength = typed.length();

        if (nameLength > typedLength || nameLength == 0) {
            return false;
        }

        if (name.charAt(0) != typed.charAt(0)) {
            return false;
        }

        int i = 1;
        for (int j = 1; j < typedLength; j++) {
            if (i < nameLength && typed.charAt(j) == name.charAt(i)) {

                i++;
            } else if (typed.charAt(j) != typed.charAt(j - 1)) {

                return false;
            }
        }

        return i == nameLength;
    }
}
