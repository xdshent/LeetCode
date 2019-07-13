package com.github.xdshent.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings
 * within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times,
 * you need to include that character three times in the final answer.
 * <p>
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * <p>
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * <p>
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 *
 * @author xdshen
 */
public class FindCommonCharactersSolution {

    private int[] cache = new int[26];

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param strings
     * @return
     */
    public List<String> commonChars(String[] strings) {
        List<String> result = new ArrayList<>();
        if (strings == null || strings.length == 0) {
            return result;
        }

        int[] resultCount = new int[26];
        for (char c : strings[0].toCharArray()) {
            resultCount[c - 'a']++;
        }

        for (int i = 1; i < strings.length; i++) {
            count(strings[i], resultCount);
        }

        for (int i = 0; i < 26; i++) {
            if (resultCount[i] != 0) {
                for (int j = 0; j < resultCount[i]; j++) {
                    result.add((char) (i + 'a') + "");
                }
            }
        }

        return result;
    }

    /**
     * @param string
     * @param resultCount
     */
    private void count(String string, int[] resultCount) {
        for (char c : string.toCharArray()) {
            cache[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (resultCount[i] != 0 && cache[i] != resultCount[i]) {
                resultCount[i] = Math.min(resultCount[i], cache[i]);
            }
        }

        cache = new int[26];
    }
}
