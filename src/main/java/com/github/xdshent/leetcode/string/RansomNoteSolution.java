package com.github.xdshent.leetcode.string;

/**
 * 383. Ransom Note
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return
 * true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 * @author xdshen
 */
public class RansomNoteSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        if (ransomNote.isEmpty() && magazine.isEmpty()) {
            return true;
        }

        int[] cache = new int[26];
        char[] ransomNoteCharArray = ransomNote.toCharArray();
        char[] magazineCharArray = magazine.toCharArray();

        for (int i = 0; i < magazineCharArray.length; i++) {
            cache[magazineCharArray[i] - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--cache[ransomNoteCharArray[i] - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
