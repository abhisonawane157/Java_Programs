
// 2022. Convert 1D Array Into 2D Array : https://leetcode.com/problems/convert-1d-array-into-2d-array/
public class LeetCode_Convert_1D_Array_Into_2D_Array {
    static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[0][0];

        var matrix = new int[m][n];
        for (int i = 0, k = 0; i < m; i++)
            for (var j = 0; j < n; j++)
                matrix[i][j] = original[k++];

        return matrix;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3 };
        int m = 1;
        int n = 3;
        int[][] ans = construct2DArray(original, m, n);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output
// Input: original = [1,2,3,4], m = 2, n = 2
// Output: [[1,2],[3,4]]
// Explanation: The constructed 2D array should contain 2 rows and 2 columns.
// The first group of n=2 elements in original, [1,2], becomes the first row in
// the constructed 2D array.
// The second group of n=2 elements in original, [3,4], becomes the second row
// in the constructed 2D array.

// Input: original = [1,2,3], m = 1, n = 3
// Output: [[1,2,3]]
// Explanation: The constructed 2D array should contain 1 row and 3 columns.
// Put all three elements in original into the first row of the constructed 2D
// array.

// Input: original = [1,2], m = 1, n = 1
// Output: []
// Explanation: There are 2 elements in original.
// It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D
// array.

// Explanation : You are given a 0-indexed 1-dimensional (1D) integer array
// original, and two integers, m and n. You are tasked with creating a
// 2-dimensional (2D) array with m rows and n columns using all the elements
// from original.
// The elements from indices 0 to n - 1 (inclusive) of original should form the
// first row of the constructed 2D array, the elements from indices n to 2 * n -
// 1 (inclusive) should form the second row of the constructed 2D array, and so
// on.
// Return an m x n 2D array constructed according to the above procedure, or an
// empty 2D array if it is impossible.