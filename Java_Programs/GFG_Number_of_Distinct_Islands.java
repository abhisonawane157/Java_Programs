
// Number of Distinct Islands : https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1
import java.util.*;

class GFG_Number_of_Distinct_Islands {
    static int countDistinctIslands(int[][] grid) {
        // Your Code here
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    String str = dfs(i, j, grid, "*");
                    set.add(str);
                }
            }
        }
        return set.size();
    }

    String dfs(int i, int j, int[][] grid, String s) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return "0";
        grid[i][j] = 0;
        String down = dfs(i + 1, j, grid, "D");
        String top = dfs(i - 1, j, grid, "U");
        String right = dfs(i, j + 1, grid, "R");
        String left = dfs(i, j - 1, grid, "L");
        return s + left + right + top + down;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 0, 0, 1, 1 }
        };
        int ans = countDistinctIslands(grid);
        System.out.println(ans);
    }
}
// Output
// Input:
// grid[][] = {{1, 1, 0, 0, 0},
// {1, 1, 0, 0, 0},
// {0, 0, 0, 1, 1},
// {0, 0, 0, 1, 1}}
// Output:
// 1
// Explanation:
// grid[][] = {{1, 1, 0, 0, 0},
// {1, 1, 0, 0, 0},
// {0, 0, 0, 1, 1},
// {0, 0, 0, 1, 1}}
// Same colored islands are equal.
// We have 2 equal islands, so we
// have only 1 distinct island.

// Input:
// grid[][] = {{1, 1, 0, 1, 1},
// {1, 0, 0, 0, 0},
// {0, 0, 0, 0, 1},
// {1, 1, 0, 1, 1}}
// Output:
// 3
// Explanation:
// grid[][] = {{1, 1, 0, 1, 1},
// {1, 0, 0, 0, 0},
// {0, 0, 0, 0, 1},
// {1, 1, 0, 1, 1}}
// Same colored islands are equal.
// We have 4 islands, but 2 of them
// are equal, So we have 3 distinct islands.

// Explanation : Given a boolean 2D matrix grid of size n * m. You have to find
// the number of distinct islands where a group of connected 1s (horizontally or
// vertically) forms an island. Two islands are considered to be distinct if and
// only if one island is not equal to another (not rotated or reflected).