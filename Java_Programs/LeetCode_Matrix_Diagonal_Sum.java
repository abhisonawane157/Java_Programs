
// 1572. Matrix Diagonal Sum : https://leetcode.com/problems/matrix-diagonal-sum/
public class LeetCode_Matrix_Diagonal_Sum {
    static int diagonalSum(int[][] mat) {
        if (mat.length == 0)
            return 0;
        int dia = 0;
        int size = mat.length;
        int revdia = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    dia = dia + mat[i][j];
                }
                if (i == (size - j - 1)) {
                    revdia = revdia + mat[i][j];
                }
            }
        }
        if (size % 2 == 0) {
            return Math.abs(revdia + dia);
        } else {
            return Math.abs(revdia + dia - mat[size / 2][size / 2]);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // int[][] arr = {
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 }
        // };
        int ans = diagonalSum(arr);
        System.out.println(ans);
    }
}

// Output
// Input: mat = [[1,2,3],
// [4,5,6],
// [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.

// Input: mat = [[5]]
// Output: 5

// Input: mat = [[1,1,1,1],
// [1,1,1,1],
// [1,1,1,1],
// [1,1,1,1]]
// Output: 8