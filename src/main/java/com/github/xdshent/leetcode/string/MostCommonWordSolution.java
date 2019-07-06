package com.github.xdshent.leetcode.string;

import java.util.*;

/**
 * 819. Most Common Word
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
 * It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.
 * Words in the paragraph are not case sensitive.  The answer is in lowercase.
 * <p>
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * <p>
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * <p>
 * Note:
 * <p>
 * 1 <= paragraph.length <= 1000.
 * 0 <= banned.length <= 100.
 * 1 <= banned[i].length <= 10.
 * <p>
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols,
 * and even if it is a proper noun.)paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * There are no hyphens or hyphenated words.
 * Words only consist of letters, never apostrophes or other punctuation symbols.
 *
 * @author xdshen
 */
public class MostCommonWordSolution {

    /**
     * TIme Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>();
        for (String str : banned) {
            set.add(str.toLowerCase());
        }

        Map<String, Integer> map = new HashMap<>(16);
        int start = 0, end = 0;
        int len = paragraph.length();

        String res = "";
        int maxCount = Integer.MIN_VALUE;
        while (end < len) {
            while (Character.isAlphabetic(paragraph.charAt(end))) {
                end++;
            }

            String temp = paragraph.substring(start, end).toLowerCase();
            if (!set.contains(temp)) {
                int count = map.getOrDefault(temp, 0) + 1;
                map.put(temp, count);

                if (count > maxCount) {
                    maxCount = count;
                    res = temp;
                }
            }

            while (end < len && !Character.isAlphabetic(paragraph.charAt(end))) {
                end++;
            }

            start = end;
            end = end + 1;
        }

        return res;
    }
}
