package com.github.xdshent.leetcode.math;

/**
 * 204. Count Primes
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 * @author xdshen
 */
public class CountPrimesSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int minLength = 3;
        if (n < minLength) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        int step = 2;
        int count = n / 2;
        for (int i = 3; i * i < n; i += step) {
            if (isPrime[i]) {
                continue;
            }

            for (int j = i * i; j < n; j += step * i) {
                if (!isPrime[j]) {
                    --count;
                    isPrime[j] = true;
                }
            }
        }

        return count;
    }
}
