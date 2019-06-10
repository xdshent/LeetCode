package com.github.xdshent.leetcode.string;

/**
 * 434. Number of Segments in a String
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of
 * non-space characters.
 * Please note that the string does not contain any non-printable characters.
 * <p>
 * Example:
 * Input: "Hello, my name is John"
 * Output: 5
 *
 * @author xdshen
 */
public class NumberOfSegmentsInStringSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param s
     * @return
     */
    public int countSegments(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        if (s.trim().length() == 1) {
            return 1;
        }

        int segmentCount = 0;
        for (int i = 0; i < s.length(); i++) {

            boolean flag = (i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ';
            if (flag) {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
