package com.github.xdshent.leetcode.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Occurrences After Bigram
 * Given words first and second, consider occurrences in some text of the form "first second third",
 * where second comes immediately after first, and third comes immediately after second.
 * For each such occurrence, add "third" to the answer, and return the answer.
 * <p>
 * Example 1:
 * Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
 * Output: ["girl","student"]
 * <p>
 * Example 2:
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 * <p>
 * Note:
 * 1 <= text.length <= 1000
 * text consists of space separated words, where each word consists of lowercase English letters.
 * 1 <= first.length, second.length <= 10
 * first and second consist of lowercase English letters.
 *
 * @author xdshen
 */
public class OccurrencesAfterBigramSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param text
     * @param first
     * @param second
     * @return
     */
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        if (text == null || text.trim().length() == 0) {

            return result.toArray(new String[0]);
        }

        String[] strings = text.split(" ");
        int subLen = 2;
        for (int i = 0; i < strings.length - subLen; i++) {
            if (first.equals(strings[i]) && second.equals(strings[i + 1])) {

                result.add(strings[i+2]);
                i++;
            }
        }

        return result.toArray(new String[0]);
    }
}
