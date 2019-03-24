package com.github.xdshent.leetcode.array;

/**
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * Input: {1,2,3,4,5,6,7} and k=3
 * Output: {5,6,7,1,2,3,4}
 * <p>
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to
 * solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 * @author xdshen
 */
public class RotateArraySolution {

    /**
     * Time Complexity: O(n * k)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param k
     */
    public void rotateFirst(int[] nums, int k) {
        if (nums == null || nums.length == 0
                || nums.length == 1 || (k % nums.length) == 0) {
            return;
        }

        int pre = 0;
        int temp = 0;
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            pre = nums[nums.length - 1];

            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param k
     */
    public void rotateSecond(int[] nums, int k) {
        if (nums == null || nums.length == 0
                || nums.length == 1 || (k % nums.length) == 0) {
            return;
        }

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param k
     */
    public void rotateThird(int[] nums, int k) {
        if (nums == null || nums.length == 0
                || nums.length == 1 || (k % nums.length) == 0) {
            return;
        }

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * @param nums
     * @param k
     */
    public void rotateFourth(int[] nums, int k) {
        if (nums == null || nums.length == 1
                || nums.length == 0 || (k % nums.length) == 0) {
            return;
        }

        k %= nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int pre = nums[i];

            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                current = next;
                count++;
            } while (current != i);
        }
    }

    /**
     * reverse method
     *
     * @param nums
     * @param k
     * @param j
     */
    private void reverse(int[] nums, int k, int j) {
        int temp = 0;
        while (k < j) {
            temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;

            k++;
            j--;
        }
    }
}
