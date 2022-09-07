
// 1329. Sort the Matrix Diagonally : https://leetcode.com/problems/sort-the-matrix-diagonally/
public class LeetCode_Sort_the_Matrix_Diagonally {

    static int[][] diagonalSort(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                lineUp(mat, i, j);
            }
        }
        return mat;
    }

    static void swap(int[][] mat, int start, int end) {
        int temp = mat[start][end];
        mat[start][end] = mat[start + 1][end + 1];
        mat[start + 1][end + 1] = temp;
    }

    static void lineUp(int[][] mat, int a, int b) {
        if (a == b) {
            a = 0;
            b = 0;
        } else if (a > b) {
            a = a - b;
            b = 0;
        } else {
            b = b - a;
            a = 0;
        }
        for (int i = a; i < mat.length; i++) {
            if ((i + 1) < (mat.length) && (b + 1) < mat[0].length) {
                if (mat[i][b] > mat[i + 1][b + 1]) {
                    swap(mat, i, b);
                }
            }
            b++;
        }
    }

    public static void main(String[] args) {
        // int[][] mat = {
        // { 3, 9 },
        // { 2, 4 },
        // { 11, 2 },
        // { 9, 8 },
        // { 7, 3 }
        // };
        int[][] mat = {
                { 3, 3, 1, 1 },
                { 2, 2, 1, 2 },
                { 1, 1, 1, 2 }
        };
        // int[][] mat = {
        // { 11, 25, 66, 1, 69, 7 },
        // { 23, 55, 17, 45, 15, 52 },
        // { 75, 31, 36, 44, 58, 8 },
        // { 22, 27, 33, 25, 68, 4 },
        // { 84, 28, 14, 11, 5, 50 }
        // };
        int[][] ans = diagonalSort(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output
// 3 3 1 1 | 1 1 1 1
// 2 2 1 2 | 1 2 2 2
// 1 1 1 2 | 1 2 3 3
// Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
// Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

// 11 25 66 01 69 07 | 05 17 04 01 52 07
// 23 55 17 45 15 52 | 11 11 25 45 08 69
// 75 31 36 44 58 08 | 14 23 25 44 58 15
// 22 27 33 25 68 04 | 22 27 31 36 50 66
// 84 28 14 11 05 50 | 84 28 75 33 55 68
// Input: mat =
// [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
// Output:
// [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]

// Explanation : A matrix diagonal is a diagonal line of cells starting from
// some cell in either the topmost row or leftmost column and going in the
// bottom-right direction until reaching the matrix's end. For example, the
// matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix,
// includes cells mat[2][0], mat[3][1], and mat[4][2].
// Given an m x n matrix mat of integers, sort each matrix diagonal in ascending
// order and return the resulting matrix.