
// 2319. Check if Matrix Is X-Matrix : https://leetcode.com/problems/check-if-matrix-is-x-matrix/
public class LeetCode_Check_if_Matrix_Is_X_Matrix {
    static boolean checkXMatrix(int[][] grid) {
        if (diagonal(grid)) {
            if (nondiagonal(grid)) {
                return true;
            }
        }
        return false;
    }

    static boolean nondiagonal(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i != j && i != grid.length - 1 - j) {
                    System.out.println(i + "-" + j);
                    if (grid[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    static boolean diagonal(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (!(grid[i][i] > 0 && grid[i][(grid[0].length - 1) - i] > 0))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 5, 0, 0, 1 },
                { 0, 4, 1, 5 },
                { 0, 5, 2, 0 },
                { 4, 1, 0, 2 }
        };
        // int[][] grid = {
        // { 2, 0, 0, 1 },
        // { 0, 3, 1, 0 },
        // { 0, 5, 2, 0 },
        // { 4, 0, 0, 2 }
        // };
        System.out.println(checkXMatrix(grid));
    }
}

// Output
// Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
// Output: true
// Explanation: Refer to the diagram above.
// An X-Matrix should have the green elements (diagonals) be non-zero and the
// red elements be 0.
// Thus, grid is an X-Matrix.

// Input: grid = [[5,7,0],[0,3,1],[0,5,0]]
// Output: false
// Explanation: Refer to the diagram above.
// An X-Matrix should have the green elements (diagonals) be non-zero and the
// red elements be 0.
// Thus, grid is not an X-Matrix.

// Explanation : A square matrix is said to be an X-Matrix if both of the
// following conditions hold:
// All the elements in the diagonals of the matrix are non-zero.
// All other elements are 0.
// Given a 2D integer array grid of size n x n representing a square matrix,
// return true if grid is an X-Matrix. Otherwise, return false.