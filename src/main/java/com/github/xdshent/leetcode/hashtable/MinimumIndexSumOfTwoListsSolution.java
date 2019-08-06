package com.github.xdshent.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. Minimum Index Sum of Two Lists
 * Suppose Andy and Doris want to choose a restaurant for dinner,
 * and they both have a list of favorite restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum.
 * If there is a choice tie between answers, output all of them with no order requirement.
 * You could assume there always exists an answer.
 * <p>
 * Example 1:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only restaurant they both like is "Shogun".
 * <p>
 * Example 2:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["KFC", "Shogun", "Burger King"]
 * Output: ["Shogun"]
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 * <p>
 * Note:
 * The length of both lists will be in the range of [1, 1000].
 * The length of strings in both lists will be in the range of [1, 30].
 * The index is starting from 0 to the list length minus 1.
 * No duplicates in both lists.
 *
 * @author xdshen
 */
public class MinimumIndexSumOfTwoListsSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(16);
        for (int i = 0; i < list1.length; i++) {

            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < list2.length && i <= minSum; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);

                if (sum <= minSum) {
                    if (sum < minSum) {

                        result.clear();
                        result.add(list2[i]);
                        minSum = sum;

                        continue;
                    }

                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
