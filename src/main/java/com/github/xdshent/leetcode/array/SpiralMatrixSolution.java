package com.github.xdshent.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a matrix of m * n elements(m rows, n columns), return all elements of the matrix
 * in spiral order.
 * <p>
 * Example 1:
 * Input:
 *    [
 *      [1, 2, 3],
 *      [4, 5, 6],
 *      [7, 8, 9]
 *    ]
 * <p>
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * @author xdshen
 */
public class SpiralMatrixSolution {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     *
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Collections.emptyList();
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int startRowIndex = 0;
        int startColIndex = 0;
        int endRowIndex = rows - 1;
        int endColIndex = cols - 1;

        List<Integer> result = new ArrayList<>();
        while (true) {

            //1: left to right
            for (int i = startColIndex; i <= endColIndex; i++) {
                result.add(matrix[startRowIndex][i]);
            }
            startRowIndex++;

            if (startRowIndex > endRowIndex || startColIndex > endColIndex) {
                break;
            }

            //2: top to bottom
            for (int i = startRowIndex; i <= endRowIndex; i++) {
                result.add(matrix[i][endColIndex]);
            }
            endColIndex--;

            if (startRowIndex > endRowIndex || startColIndex > endColIndex) {
                break;
            }

            //3: right to left
            for (int i = endColIndex; i >= startColIndex; i--) {
                result.add(matrix[endRowIndex][i]);
            }
            endRowIndex--;

            if (startRowIndex > endRowIndex || startColIndex > endColIndex) {
                break;
            }

            //4: bottom to top
            for (int i = endRowIndex; i >= startRowIndex; i--) {
                result.add(matrix[i][startColIndex]);
            }
            startColIndex++;

            if (startRowIndex > endRowIndex || startColIndex > endColIndex) {
                break;
            }
        }
        return result;
    }
}
