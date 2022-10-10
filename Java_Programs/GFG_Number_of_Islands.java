
// Number Of Islands : https://practice.geeksforgeeks.org/problems/number-of-islands/1
import java.util.*;

public class GFG_Number_of_Islands {
    public static List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        // Your code here
        List<Integer> ans = new ArrayList<>();
        int k = operators.length;
        int grid[][] = new int[rows][cols];
        for (int ii = 0; ii < k; ii++) {
            grid[operators[ii][0]][operators[ii][1]] = 1;

            boolean vis[][] = new boolean[rows][cols];
            int islands = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (!vis[i][j] && grid[i][j] == 1) {
                        dfs(i, j, rows, cols, grid, vis);
                        islands++;
                    }
                }
            }
            ans.add(islands);
        }
        return ans;
    }

    static void dfs(int i, int j, int maxi, int maxj, int grid[][], boolean vis[][]) {
        if (!isIn(i, j, maxi, maxj) || grid[i][j] == 0 || vis[i][j])
            return;
        vis[i][j] = true;

        dfs(i + 1, j, maxi, maxj, grid, vis);
        dfs(i - 1, j, maxi, maxj, grid, vis);
        dfs(i, j + 1, maxi, maxj, grid, vis);
        dfs(i, j - 1, maxi, maxj, grid, vis);
    }

    static boolean isIn(int i, int j, int maxi, int maxj) {
        return i >= 0 && i < maxi && j >= 0 && j < maxj;
    }

    public static void main(String[] args) {
        int row = 4;
        int cols = 5;
        int[][] operators = {
                { 0, 0 },
                { 1, 1 },
                { 2, 2 },
                { 3, 3 }
        };
        // int[][] operators = {
        // { 1, 1 },
        // { 0, 1 },
        // { 3, 3 },
        // { 3, 4 }
        // };
        int k = operators.length;
        List<Integer> ans = numOfIslands(row, cols, operators);
        System.out.println(ans);
    }
}

// Output
// Input: n = 4
// m = 5
// k = 4
// A = {{1,1},{0,1},{3,3},{3,4}}

// Output: 1 1 2 2
// Explanation:
// 0. 00000
// 00000
// 00000
// 00000
// 1. 00000
// 01000
// 00000
// 00000
// 2. 01000
// 01000
// 00000
// 00000
// 3. 01000
// 01000
// 00000
// 00010
// 4. 01000
// 01000
// 00000
// 00011

// Input: n = 4
// m = 5
// k = 4
// A = {{0,0},{1,1},{2,2},{3,3}}

// Output: 1 2 3 4
// Explanation:
// 0. 00000
// 00000
// 00000
// 00000
// 1. 10000
// 00000
// 00000
// 00000
// 2. 10000
// 01000
// 00000
// 00000
// 3. 10000
// 01000
// 00100
// 00000
// 4. 10000
// 01000
// 00100
// 00010

// Explanation : You are given a n,m which means the row and column of the 2D
// matrix and an array of size k denoting the number of operations. Matrix
// elements is 0 if there is water or 1 if there is land. Originally, the 2D
// matrix is all 0 which means there is no land in the matrix. The array has k
// operator and each operator has two integer A[i][0], A[i][1] means that you
// can change the cell matrix[A[i][0]][A[i][1]] from sea to island. Return how
// many island are there in the matrix after each operator.You need to return an
// array of size k.