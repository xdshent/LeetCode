package com.github.xdshent.leetcode.bit;

/**
 * 405. Convert a Number to Hexadecimal
 * Given an integer, write an algorithm to convert it to hexadecimal.
 * For negative integer, two’s complement method is used.
 * <p>
 * Note:
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s.
 * If the number is zero, it is represented by a single zero character '0'; otherwise,
 * the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * <p>
 * Example 1:
 * Input:
 * 26
 * Output:
 * "1a"
 * <p>
 * Example 2:
 * Input:
 * -1
 * Output:
 * "ffffffff"
 *
 * @author xdshen
 */
public class ConvertNumberToHexSolution {

    /**
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     *
     * @param num
     * @return
     */
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (num != 0) {
            if ((num & 15) > 9) {
                result.append((char) ('a' + (num & 15) - 10));
            } else {
                result.append(num & 15);
            }

            num >>>= 4;
        }

        return result.reverse().toString();
    }
}
