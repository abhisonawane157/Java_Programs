
// 1260. Shift 2D Grid : https://leetcode.com/problems/shift-2d-grid/
import java.util.*;

public class LeetCode_Shift_2D_Grid {
    static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] a = new int[grid.length][grid[0].length];
        while (k != 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (i == (grid.length - 1) && j == (grid[0].length - 1)) {
                        a[0][0] = grid[grid.length - 1][grid[0].length - 1];
                    } else if (i != (grid.length - 1) && j == (grid[0].length - 1)) {
                        a[i + 1][0] = grid[i][grid[0].length - 1];
                    } else {
                        a[i][j + 1] = grid[i][j];
                    }
                }
            }
            grid = copy(grid, a);
            k--;
        }
        for (int[] element : grid) {
            List<Integer> aa = new ArrayList<>();
            for (int element2 : element)
                aa.add(element2);
            ans.add(aa);
        }
        return ans;
    }

    static int[][] copy(int[][] grid, int[][] a) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = a[i][j];
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        // int[][] grid = {
        // { 3, 8, 1, 9 },
        // { 19, 7, 2, 5 },
        // { 4, 6, 11, 10 },
        // { 12, 0, 21, 13 }
        // };
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int k = 9;
        List<List<Integer>> ans = shiftGrid(grid, k);
        System.out.println(ans);
    }
}

// Output
// { 1, 2, 3 } | { 9, 1, 2 }
// { 4, 5, 6 } | { 3, 4, 5 }
// { 7, 8, 9 } | { 6, 7, 8 }
// Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
// Output: [[9,1,2],[3,4,5],[6,7,8]]

// { 03, 08, 01, 09 } | 4 | { 12, 00, 21, 13 }
// { 19, 07, 02, 05 } | 4 | { 03, 08, 01, 09 }
// { 04, 06, 11, 10 } | 4 | { 19, 07, 02, 05 }
// { 12, 00, 21, 13 } | 4 | { 04, 06, 11, 10 }
// Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
// Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

// { 1, 2, 3 } | 9 | { 1, 2, 3 }
// { 4, 5, 6 } | 9 | { 4, 5, 6 }
// { 7, 8, 9 } | 9 | { 7, 8, 9 }
// Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
// Output: [[1,2,3],[4,5,6],[7,8,9]]

// Explanation : Given a 2D grid of size m x n and an integer k. You need to
// shift the grid k times.
// In one shift operation:
// Element at grid[i][j] moves to grid[i][j + 1].
// Element at grid[i][n - 1] moves to grid[i + 1][0].
// Element at grid[m - 1][n - 1] moves to grid[0][0].
// Return the 2D grid after applying shift operation k times.