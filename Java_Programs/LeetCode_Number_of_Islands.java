
// 200. Number of Islands : https://leetcode.com/problems/number-of-islands/description/
import java.util.*;

public class LeetCode_Number_of_Islands {
    static int numIslands(char[][] grid) {
        ArrayList<String> set = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    String str = dfs(i, j, grid, "*");
                    set.add(str);
                }
            }
        }
        return set.size();
    }

    static String dfs(int i, int j, char[][] grid, String s) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return "0";
        grid[i][j] = '0';
        String down = dfs(i + 1, j, grid, "D");
        String top = dfs(i - 1, j, grid, "U");
        String right = dfs(i, j + 1, grid, "R");
        String left = dfs(i, j - 1, grid, "L");
        return s + left + right + top + down;
    }

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        int ans = numIslands(grid);
        System.out.println(ans);
    }
}

// Output
// Input: grid = [
// ["1","1","1","1","0"],
// ["1","1","0","1","0"],
// ["1","1","0","0","0"],
// ["0","0","0","0","0"]
// ]
// Output: 1

// Input: grid = [
// ["1","1","0","0","0"],
// ["1","1","0","0","0"],
// ["0","0","1","0","0"],
// ["0","0","0","1","1"]
// ]
// Output: 3

// Explanation : Given an m x n 2D binary grid grid which represents a map of
// '1's (land) and '0's (water), return the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands
// horizontally or vertically. You may assume all four edges of the grid are all
// surrounded by water.