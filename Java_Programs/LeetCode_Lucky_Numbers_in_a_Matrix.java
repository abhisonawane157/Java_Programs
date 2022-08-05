
// 1380. Lucky Numbers in a Matrix : https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.*;

public class LeetCode_Lucky_Numbers_in_a_Matrix {

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row(matrix, i, j)) {
                    if (col(matrix, i, j)) {
                        list.add(matrix[i][j]);
                    } else {

                    }
                } else {

                }
            }
        }
        return list;
    }

    static boolean row(int[][] mat, int i, int j) {
        int comp = mat[i][j];
        int min = Integer.MAX_VALUE;
        for (int l = 0; l < mat[0].length; l++) {
            min = Math.min(min, mat[i][l]);
        }
        if (min == comp)
            return true;
        else
            return false;
    }

    static boolean col(int[][] mat, int i, int j) {
        int comp = mat[i][j];
        int max = Integer.MIN_VALUE;
        for (int[] element : mat) {
            max = Math.max(max, element[j]);
        }
        if (max == comp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 7, 8 },
                { 1, 2 }
        };
        // int[][] matrix = {
        // { 1, 10, 4, 2 },
        // { 9, 3, 8, 7 },
        // { 15, 16, 17, 12 }
        // };
        // int[][] matrix = {
        // { 3, 7, 8 },
        // { 9, 11, 13 },
        // { 15, 16, 17 }
        // };
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
}

// Output
// Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
// Output: [15]
// Explanation: 15 is the only lucky number since it is the minimum in its row
// and the maximum in its column.

// Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
// Output: [12]
// Explanation: 12 is the only lucky number since it is the minimum in its row
// and the maximum in its column.

// Input: matrix = [[7,8],[1,2]]
// Output: [7]
// Explanation: 7 is the only lucky number since it is the minimum in its row
// and the maximum in its column.

// Explanation : Given an m x n matrix of distinct numbers, return all lucky
// numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum
// element in its row and maximum in its column.