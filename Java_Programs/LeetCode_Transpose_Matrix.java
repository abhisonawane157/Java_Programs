
// 867. Transpose Matrix : https://leetcode.com/problems/transpose-matrix/
public class LeetCode_Transpose_Matrix {

    static int[][] transpose(int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        // int[][] mat = {
        // { 2, 4, -1 },
        // { -10, 5, 11 },
        // { 18, -7, 6 }
        // };
        // int[][] mat = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };
        int[][] mat = {
                { 1, 2 },
                { 4, 5 },
                { 6, 7 }
        };
        int[][] ans = transpose(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]

// Input: matrix = [[1,2,3],[4,5,6]]
// Output: [[1,4],[2,5],[3,6]]

// Explanation: Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal,
// switching the matrix's row and column indices.