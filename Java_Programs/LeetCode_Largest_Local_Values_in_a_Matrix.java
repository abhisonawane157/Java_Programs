
// 2373. Largest Local Values in a Matrix : https://leetcode.com/problems/largest-local-values-in-a-matrix/

public class LeetCode_Largest_Local_Values_in_a_Matrix {
    static int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                ans[i][j] = maxMat(grid, i, j);
            }
        }
        return ans;
    }

    static int maxMat(int[][] grid, int i, int j) {
        int max = 0;
        for (int ii = i; ii < i + 3; ii++) {
            for (int jj = j; jj < j + 3; jj++) {
                max = Math.max(max, grid[ii][jj]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 2, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };
        // int[][] grid = {
        // { 9, 9, 8, 1 },
        // { 5, 6, 2, 6 },
        // { 8, 2, 6, 4 },
        // { 6, 2, 2, 2 }
        // };
        int[][] ans = largestLocal(grid);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output
// { 9, 9, 8, 1 },
// { 5, 6, 2, 6 }, // { 9, 9 },
// { 8, 2, 6, 4 }, // { 8, 6 },
// { 6, 2, 2, 2 }
// Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
// Output: [[9,9],[8,6]]
// Explanation: The diagram above shows the original matrix and the generated
// matrix.
// Notice that each value in the generated matrix corresponds to the largest
// value of a contiguous 3 x 3 matrix in grid.

// { 1, 1, 1, 1, 1 },
// { 1, 1, 1, 1, 1 }, // { 2, 2, 2 },
// { 1, 1, 2, 1, 1 }, // { 2, 2, 2 },
// { 1, 1, 1, 1, 1 }, // { 2, 2, 2 },
// { 1, 1, 1, 1, 1 }
// Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
// Output: [[2,2,2],[2,2,2],[2,2,2]]
// Explanation: Notice that the 2 is contained within every contiguous 3 x 3
// matrix in grid.

// Explanation : You are given an n x n integer matrix grid.

// Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

// maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid
// centered around row i + 1 and column j + 1.
// In other words, we want to find the largest value in every contiguous 3 x 3
// matrix in grid.

// Return the generated matrix.