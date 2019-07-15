package com.github.xdshent.leetcode.array;

/**
 * 1051. Height Checker
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * Return the minimum number of students not standing in the right positions.
 * (This is the number of students that must move in order for all students to be standing in non-decreasing
 * order of height.)
 * <p>
 * Example 1:
 * Input: [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * Students with heights 4, 3 and the last 1 are not standing in the right positions.
 * <p>
 * Note:
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 *
 * @author xdshen
 */
public class HeightCheckerSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }

        int[] count = new int[101];

        for (int height : heights) {
            count[height]++;
        }

        int result = 0;
        int cur = 0;

        for (int height : heights) {
            while (count[cur] == 0) {
                cur++;
            }

            if (cur != height) {
                result++;
            }

            count[cur]--;
        }

        return result;
    }
}
