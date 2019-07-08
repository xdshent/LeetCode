package com.github.xdshent.leetcode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 824. Goat Latin
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
 * <p>
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 * The rules of Goat Latin are as follows:
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 * <p>
 * Example 1:
 * <p>
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * <p>
 * Example 2:
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * <p>
 * Notes:
 * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 * 1 <= S.length <= 150.
 *
 * @author xdshen
 */
public class GoatLatinSolution {
    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public String toGoatLatin(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String[] words = s.split(" ");

        int count = 1;
        int i = 0;
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (count != 1) {
                result.append(" ");
            }

            char firstChar = word.charAt(0);
            if (vowels.contains(firstChar)) {
                result.append(word);
            } else {
                result.append(word.substring(1));
                result.append(firstChar);
            }

            result.append("ma");
            for (i = 0; i < count; i++) {
                result.append("a");

            }
            count++;
        }

        return result.toString();
    }
}
