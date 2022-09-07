
// 840. Magic Squares In Grid : https://leetcode.com/problems/magic-squares-in-grid/
import java.util.*;

public class LeetCode_Magic_Squares_In_Grid {
    static int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[i].length - 3; j++) {
                if (checkMat(grid, i, j)) {
                    if (rowMat(grid, i, j)) {
                        if (colMat(grid, i, j)) {
                            count++;
                        }
                    }
                    // for (int ii = i; ii < i + 3; ii++) {
                    // for (int jj = j; jj < j + 3; jj++) {
                    // System.out.print(grid[ii][jj] + " ");
                    // }
                    // System.out.println();
                    // }
                }
            }
        }
        return count;
    }

    // 0,0 0,1 0,2 0,3 0,4
    // 1,0 1,1 1,2 1,3 1,4
    // 2,0 2,1 2,2 2,3 2,4
    // 3,0 3,1 3,2 3,3 3,4
    static boolean colMat(int[][] grid, int a, int b) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = b; i < b + 3; i++) {
            for (int j = a; j < a + 3; j++) {
                sum = sum + grid[j][i];
                System.out.print(sum + " ");
            }
            System.out.println();
            set.add(sum);
            sum = 0;
        }
        System.out.println(set);
        return (set.size() == 1);
    }

    static boolean rowMat(int[][] grid, int a, int b) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                sum = sum + grid[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
            set.add(sum);
            sum = 0;
        }
        System.out.println(set);
        return (set.size() == 1);
    }

    static boolean checkMat(int[][] grid, int a, int b) {
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            lis.add(i);
        }
        if ((a + 3) <= grid.length && (b + 3) <= grid[0].length) {
            for (int i = a; i < a + 3; i++) {
                for (int j = b; j < b + 3; j++) {
                    if (lis.contains(grid[i][j])) {
                        lis.remove(Integer.valueOf(grid[i][j]));
                    }
                }
            }
        }
        int a1 = 0;
        int b1 = 0;
        if (lis.size() == 0) {
            a1 = grid[a][b] + grid[a + 2][b + 2];
            b1 = grid[a][b + 2] + grid[a + 2][b];
            return (a1 == b1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 4, 3, 8 },
                { 9, 5, 1 },
                { 2, 7, 6 }
        };
        // int[][] mat = {
        // { 4, 3, 8, 4 },
        // { 9, 5, 1, 9 },
        // { 2, 7, 6, 2 }
        // };
        // int[][] mat = {
        // { 3, 2, 9, 2, 7 },
        // { 6, 1, 8, 4, 2 },
        // { 7, 5, 3, 2, 7 },
        // { 2, 9, 4, 9, 6 },
        // { 4, 3, 8, 2, 5 }
        // };
        // System.out.println(mat.length + "=" + mat[0].length);
        int ans = numMagicSquaresInside(mat);
        System.out.println(ans);
    }
}

// Output
// 4 3 8 4
// 9 5 1 9
// 2 7 6 2
// Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
// Output: 1
// Explanation:
// The following subgrid is a 3 x 3 magic square:
// 4 3 8
// 9 5 1
// 2 7 6
// while this one is not:
// 3 8 4
// 5 1 9
// 7 6 2
// // In total, there is only one magic square inside the given grid.

// Input: grid = [[8]]
// Output: 0

// Explanation : A 3 x 3 magic square is a 3 x 3 grid filled with distinct
// numbers from 1 to 9 such that each row, column, and both diagonals all have
// the same sum.
// Given a row x col grid of integers, how many 3 x 3 "magic square" subgrids
// are there? (Each subgrid is contiguous).