
// 2352. Equal Row and Column Pairs : https://leetcode.com/problems/equal-row-and-column-pairs/
import java.util.*;

public class LeetCode_Equal_Row_and_Column_Pairs {
    static int equalPairs(int[][] grid) {
        ArrayList<int[]> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] a = new int[grid[i].length];
            for (int j = 0; j < grid[i].length; j++) {
                a[j] = grid[j][i];
            }
            list.add(a);
        }
        for (int[] a : grid) {
            for (int[] b : list) {
                if (Arrays.equals(a, b))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[][] grid = {
        // { 3, 1, 2, 2 },
        // { 1, 4, 4, 5 },
        // { 2, 4, 2, 2 },
        // { 2, 4, 2, 2 }
        // };
        int[][] grid = {
                { 11, 1 },
                { 1, 11 }
                // { 2, 7, 7 }
        };
        int ans = equalPairs(grid);
        System.out.println(ans);
    }
}

// Output
// { 3, 2, 1 },
// { 1, 7, 6 },
// { 2, 7, 7 }
// Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
// Output: 1
// Explanation: There is 1 equal row and column pair:
// - (Row 2, Column 1): [2,7,7]

// { 3, 1, 2, 2 },
// { 1, 4, 4, 5 },
// { 2, 4, 2, 2 },
// { 2, 4, 2, 2 }
// Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
// Output: 3
// Explanation: There are 3 equal row and column pairs:
// - (Row 0, Column 0): [3,1,2,2]
// - (Row 2, Column 2): [2,4,2,2]
// - (Row 3, Column 2): [2,4,2,2]

// Explanation : Given a 0-indexed n x n integer matrix grid, return the number
// of pairs (Ri, Cj) such that row Ri and column Cj are equal.
// A row and column pair is considered equal if they contain the same elements
// in the same order (i.e. an equal array).