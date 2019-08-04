package com.github.xdshent.leetcode.array;

/**
 * 744. Find Smallest Letter Greater Than Target
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target,
 * find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 * <p>
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 * <p>
 * Note:
 * <p>
 * letters has a length in range [2, 10000].
 * letters consists of lowercase letters, and contains at least 2 unique letters.
 * target is a lowercase letter.
 *
 * @author xdshen
 */
public class FindSmallestLetterGreaterThanTargetSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target >= letters[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }
}
