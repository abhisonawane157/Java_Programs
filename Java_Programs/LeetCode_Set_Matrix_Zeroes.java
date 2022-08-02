
// 73. Set Matrix Zeroes : https://leetcode.com/problems/set-matrix-zeroes/
public class LeetCode_Set_Matrix_Zeroes {
    public static int size1 = 0;
    public static int size2 = 0;

    static void setZeroes(int[][] matrix) {
        size1 = matrix.length;
        size2 = matrix[0].length;
        int[][] mat = new int[size1][size2];
        mat = matrix;
        int flag = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (matrix[i][j] == 0) {
                    mat = apply(i, j, mat);
                } else {
                    flag++;
                }
            }
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if ((matrix[i][j] == (Integer.MAX_VALUE - (size1 * size2))
                        || matrix[i][j] == (size1 * size2) + Integer.MIN_VALUE)
                        && (flag != (size1 * size2))) {

                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] apply(int a, int b, int[][] mat1) {
        mat1[a][b] = 0;
        int ii = 0;
        int jj = 0;
        while (ii < size1) { // Vertical
            if (mat1[ii][b] != 0 && (mat1[ii][b] != ((size1 * size2) + Integer.MIN_VALUE)
                    || mat1[ii][b] != (Integer.MAX_VALUE - (size1 * size2)))) {
                mat1[ii][b] = (Integer.MAX_VALUE - (size1 * size2));
            }
            ii++;
        }
        while (jj < size2) { // Horizontal
            if (mat1[a][jj] != 0 && (mat1[a][jj] != ((size1 * size2) + Integer.MIN_VALUE)
                    || mat1[a][jj] != (Integer.MAX_VALUE - (size1 * size2)))) {
                mat1[a][jj] = ((size1 * size2) + Integer.MIN_VALUE);
            }
            jj++;
        }
        return mat1;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { -4, -2147483648, 6, -7, 0 },
                { -8, 6, -8, -6, 0 },
                { 2147483647, 2, -9, -6, -10 }
        };
        // int[][] mat = {
        // { 2147483647, 1, 3, 3 },
        // { 2147483647, 1, 3, 3 },
        // { 2147483647, 1, 3, 3 }
        // };
        // int[][] mat = {
        // { 0, 1, 0 }
        // };
        // int[][] mat = {
        // { 1, 1, 1 },
        // { 1, 0, 1 },
        // { 1, 1, 1 }
        // };
        // int[][] mat = {
        // { 0, 1, 2, 0 },
        // { 3, 4, 5, 2 },
        // { 1, 3, 1, 5 }
        // };
        setZeroes(mat);
    }
}

// Output
// 1 1 1
// 1 0 1
// 1 1 1
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// 1 0 1
// 0 0 0
// 1 0 1
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// 0 1 2 0
// 3 4 5 2
// 1 3 1 5
// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// 0 0 0 0
// 0 4 5 0
// 0 3 1 0
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// Explanation: Given an m x n integer matrix matrix, if an element is 0, set
// its entire row and column to 0's.
// You must do it in place.