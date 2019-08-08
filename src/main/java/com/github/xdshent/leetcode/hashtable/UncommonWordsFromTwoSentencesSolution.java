package com.github.xdshent.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 884. Uncommon Words from Two Sentences
 * We are given two sentences A and B.  (A sentence is a string of space separated words.
 * Each word consists only of lowercase letters.)
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Return a list of all uncommon words.
 * You may return the list in any order.
 * <p>
 * Example 1:
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * <p>
 * Example 2:
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 * <p>
 * Note:
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A and B both contain only spaces and lowercase letters.
 *
 * @author xdshen
 */
public class UncommonWordsFromTwoSentencesSolution {

    /**
     * Time Complexity: O(M+N)
     * Space Complexity: O(M+N)
     *
     * @param a
     * @param b
     * @return
     */
    public String[] uncommonFromSentences(String a, String b) {
        String[] strings = (a + " " + b).split(" ");
        Map<String, Integer> countMap = new HashMap<>(16);
        for (String string : strings) {

            countMap.put(string, countMap.getOrDefault(string, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (String key : countMap.keySet()) {

            if (countMap.get(key) == 1) {

                result.add(key);
            }
        }

        return result.toArray(new String[0]);
    }
}
