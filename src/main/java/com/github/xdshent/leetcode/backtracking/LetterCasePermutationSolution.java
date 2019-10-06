package com.github.xdshent.leetcode.backtracking;

import java.util.*;

/**
 * 784. Letter Case Permutation
 * Given a string S, we can transform every letter individually to be lowercase or uppercase
 * to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 * <p>
 * Note:
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 *
 * @author xdshen
 */
public class LetterCasePermutationSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public List<String> letterCasePermutationFirst(String s) {
        if (s == null || s.length() == 0) {

            return Collections.emptyList();
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(s);

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {

                continue;
            }

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chars = cur.toCharArray();

                chars[i] = Character.toUpperCase(chars[i]);
                queue.offer(String.valueOf(chars));

                chars[i] = Character.toLowerCase(chars[i]);
                queue.offer(String.valueOf(chars));
            }
        }

        return new LinkedList<>(queue);
    }

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(N)
     *
     * @param s
     * @return
     */
    public List<String> letterCasePermutationSecond(String s) {
        if (s == null || s.length() == 0) {

            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        compute(result, s.toCharArray(), 0);

        return result;
    }

    private void compute(List<String> result, char[] chars, int index) {
        if (index == chars.length) {

            result.add(String.valueOf(chars));
        } else {

            if (Character.isLetter(chars[index])) {
                chars[index] = Character.toUpperCase(chars[index]);
                compute(result, chars, index + 1);
                chars[index] = Character.toLowerCase(chars[index]);
            }

            compute(result, chars, index + 1);
        }
    }
}
