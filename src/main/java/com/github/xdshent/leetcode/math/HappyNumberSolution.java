package com.github.xdshent.leetcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following
 * process: Starting with any positive integer, replace the
 * number by the sum of the squares of its digits, and repeat
 * the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * <p>
 * Those numbers for which this process ends in 1 are happy
 * numbers.
 *
 * @author xdshen
 */
public class HappyNumberSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public boolean isHappyFirst(int n) {
        int slow, fast;
        slow = fast = n;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(N)
     *
     * @param n
     * @return
     */
    public boolean isHappySecond(int n) {
        Set<Integer> inLoop = new HashSet<>();
        int sum, digit;
        while (inLoop.add(n)) {
            sum = 0;
            while (n > 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }

    /**
     * sum
     *
     * @param n
     * @return
     */
    private int digitSquareSum(int n) {
        int sum = 0;
        int temp = 0;

        while (n != 0) {
            temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}
