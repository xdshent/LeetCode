package com.github.xdshent.leetcode.array;

/**
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n
 * vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two
 * lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * Example:
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * @author xdshen
 */
public class ContainerWithMostWaterSolution {

    /**
     * Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param height
     * @return
     */
    public int maxAreaFirst(int[] height) {
        if (height == null || height.length <= 1) {

            return 0;
        }

        int n = height.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }

        return maxArea;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param height
     * @return
     */
    public int maxAreaSecond(int[] height) {
        if (height == null || height.length <= 1) {

            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {

                left++;
            } else {

                right--;
            }
        }

        return maxArea;
    }
}
