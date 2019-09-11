package com.github.xdshent.leetcode.array;

/**
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 *
 * @author xdshen
 */
public class TrappingRainWaterSolution {

    /**
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     *
     * @param height
     * @return
     */
    public int trapFirst(int[] height) {
        if (height == null || height.length <= 1) {

            return 0;
        }

        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;

        for (int i = 1; i < n - 1; i++) {

            leftMax = 0;
            rightMax = 0;

            //max(height[i] -> height[n-1])
            for (int j = i; j < n; j++) {

                rightMax = Math.max(rightMax, height[j]);
            }

            //max(height[0] <- height[i])
            for (int j = i; j >= 0; j--) {

                leftMax = Math.max(leftMax, height[j]);
            }

            result += Math.min(leftMax, rightMax) - height[i];
        }

        return result;
    }

    /**
     * Time Complexity: O(N)
     * Time Complexity: O(N)
     *
     * @param height
     * @return
     */
    public int trapSecond(int[] height) {
        if (height == null || height.length <= 1) {

            return 0;
        }

        int result = 0;
        int n = height.length;
        int[] leftMaxValues = new int[n];
        int[] rightMaxValues = new int[n];
        leftMaxValues[0] = height[0];
        rightMaxValues[n - 1] = height[n - 1];

        int rightStartIndex = n - 2;
        for (int i = 1; i < n; i++) {

            leftMaxValues[i] = Math.max(height[i], leftMaxValues[i - 1]);
        }

        for (int i = rightStartIndex; i >= 0; i--) {

            rightMaxValues[i] = Math.max(height[i], rightMaxValues[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {

            result += Math.min(leftMaxValues[i], rightMaxValues[i]) - height[i];
        }

        return result;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param height
     * @return
     */
    public int trapThird(int[] height) {
        if (height == null || height.length <= 1) {

            return 0;
        }

        int n = height.length;
        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;
        int result = 0;

        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {

                result += leftMax - height[left];
                left++;
            } else {

                result += rightMax - height[right];
                right--;
            }
        }

        return result;
    }
}
