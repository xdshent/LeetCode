package com.github.xdshent.leetcode.array;

/**
 * 167. Two Sum II - Input array is sorted
 * <p>
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and
 * you may not use the same element twice.
 * <p>
 * Example:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 * @author xdshen
 */
public class TwoSumSecondSolution {

    /**
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length <= 1) {
            return result;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;
    }
}
