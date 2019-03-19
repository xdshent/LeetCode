package com.github.xdshent.leetcode.array;

/**
 * 88. Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, mege nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space(size that is greater or equal to m + n) to
 * hold additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = {1,2,3,0,0,0}, m=3
 * nums2 = {2,5,6}, n = 3
 * Output: {1,2,2,3,5,6}
 *
 * @author xdshen
 */
public class MergeSortedArray {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length == 0) {
            return;
        }

        int length = m + n - 1;
        int mLength = m - 1;
        int nLength = n - 1;

        while (mLength >= 0 && nLength >= 0) {
            nums1[length--] = nums1[mLength] >= nums2[nLength] ? nums1[mLength--] : nums2[nLength--];
        }

        while (nLength >= 0) {
            nums1[length--] = nums2[nLength--];
        }
    }
}
