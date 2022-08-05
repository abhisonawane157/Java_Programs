
// 1351. Count Negative Numbers in a Sorted Matrix : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class LeetCode_Count_Negative_Numbers_in_a_Sorted_Matrix {
    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] element : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (element[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 0, 0, 0 },
        // { 1, 1, 1, 1 },
        // { 1, 0, 0, 0 },
        // { 1, 0, 0, 0 }
        // };
        int[][] matrix = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, -1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, -1, 1 }
        };
        int ans = countNegatives(matrix);
        System.out.println(ans);
    }
}

// Output
// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Input: grid = [[3,2],[1,0]]
// Output: 0

// Explanation : Given a m x n matrix grid which is sorted in non-increasing
// order both row-wise and column-wise, return the number of negative numbers in
// grid.