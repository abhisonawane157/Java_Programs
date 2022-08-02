
// 766. Toeplitz Matrix : https://leetcode.com/problems/toeplitz-matrix/

public class LeetCode_Toeplitz_Matrix {
    static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j + 1 < matrix[0].length && i + 1 < matrix.length) {
                    if (matrix[i][j] == matrix[i + 1][j + 1]) {
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1 },
                { 5 }
        };
        // int[][] mat = {
        // { 11, 74, 0, 93 },
        // { 40, 11, 74, 7 }
        // };
        // int[][] mat = {
        // { 1, 2, 3, 4 },
        // { 5, 1, 2, 3 },
        // { 9, 5, 1, 2 }
        // };
        if (isToeplitzMatrix(mat))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
// Output: true
// Explanation:
// In the above grid, the diagonals are:
// "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
// In each diagonal all elements are the same, so the answer is True.

// Input: matrix = [[1,2],[2,2]]
// Output: false
// Explanation:
// The diagonal "[1, 2]" has different elements.

// Explanation: Given an m x n matrix, return true if the matrix is Toeplitz.
// Otherwise, return false.
// A matrix is Toeplitz if every diagonal from top-left to bottom-right has the
// same elements.