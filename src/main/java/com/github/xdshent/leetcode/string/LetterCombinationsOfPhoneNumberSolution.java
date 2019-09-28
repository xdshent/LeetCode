package com.github.xdshent.leetcode.string;

import java.util.LinkedList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * <p>
 * Example:
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * <p>
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 *
 * @author xdshen
 */
public class LetterCombinationsOfPhoneNumberSolution {

    private String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /**
     * Time Complexity: O(3^N)
     * Space Complexity: O(3^N)
     *
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();

        if (digits.isEmpty()) {

            return result;
        }
        result.add("");

        while (result.peek().length() != digits.length()) {
            String remove = result.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];

            for (char c : map.toCharArray()) {

                result.addLast(remove + c);
            }
        }

        return result;
    }
}