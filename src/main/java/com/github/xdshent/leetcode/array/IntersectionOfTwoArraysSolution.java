package com.github.xdshent.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * Input: nums1 = {1,2,2,1}, nums2 = {2,2}
 * Output: {2}
 * <p>
 * Example 2:
 * Input: nums1 = {4,9,5}, nums2 = {9,4,9,8,4}
 * Output: {9,4}
 * <p>
 * Note:
 * 1. Each element in the result must be unique.
 * 2. The result can be in any order.
 *
 * @author xdshen
 */
public class IntersectionOfTwoArraysSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null
                || nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int e : nums1) {
            nums1Set.add(e);
        }

        for (int e : nums2) {
            if (nums1Set.contains(e)) {
                intersectionSet.add(e);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (Integer e : intersectionSet) {
            result[i++] = e;
        }

        return result;
    }
}
