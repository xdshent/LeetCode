package com.github.xdshent.leetcode.stack;

/**
 * 844. Backspace String Compare
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 * <p>
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * <p>
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * <p>
 * Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * <p>
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * <p>
 * Note:
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * <p>
 * Follow up:
 * Can you solve it in O(N) time and O(1) space?
 *
 * @author xdshen
 */
public class BackspaceStringCompareSolution {

    /**
     * Time Complexity: O(M+N)
     * Space Complexity: O(M+N)
     *
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareFirst(String S, String T) {
        if (S == null && T == null) {

            return true;
        }

        if (S == null || T == null) {

            return false;
        }

        return getResult(T).equals(getResult(S));
    }

    /**
     * after removing the '#'
     *
     * @param str
     * @return
     */
    private String getResult(String str) {
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {

            if ('#' != c) {

                sb.append(c);
            } else {

                if (sb.length() != 0) {

                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.toString();
    }

    /**
     * Time Complexity: O(M+N)
     * Space Complexity: O(1)
     *
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareSecond(String S, String T) {
        if (S == null && T == null) {

            return true;
        }

        if (S == null || T == null) {

            return false;
        }

        int i = S.length() - 1;
        int j = T.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {

                if (S.charAt(i) == '#') {

                    i--;
                    skipS++;
                } else if (skipS > 0) {

                    i--;
                    skipS--;
                } else {

                    break;
                }
            }

            while (j >= 0) {

                if (T.charAt(j) == '#') {

                    j--;
                    skipT++;
                } else if (skipT > 0) {

                    j--;
                    skipT--;
                } else {

                    break;
                }
            }

            if (i >= 0 && j >= 0 && (S.charAt(i) != T.charAt(j))) {

                return false;
            }

            if (i >= 0 != j >= 0) {

                return false;
            }

            i--;
            j--;
        }

        return true;
    }
}
