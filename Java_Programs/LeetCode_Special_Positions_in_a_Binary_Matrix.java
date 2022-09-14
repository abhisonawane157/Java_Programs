
// 1582. Special Positions in a Binary Matrix : https://leetcode.com/problems/special-positions-in-a-binary-matrix/
public class LeetCode_Special_Positions_in_a_Binary_Matrix {
    static int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] == 1 && row(mat, i, j))
                    if (col(mat, i, j))
                        count++;
        return count;
    }

    static boolean row(int[][] mat, int a, int b) {
        for (int i = 0; i < mat[0].length; i++) {
            if (i != b && (mat[a][i] == 1))
                return false;
        }
        return true;
    }

    static boolean col(int[][] mat, int a, int b) {
        for (int j = 0; j < mat.length; j++) {
            if (j != a && (mat[j][b] == 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // int[][] mat = {
        // { 1, 0, 0 },
        // { 0, 1, 0 },
        // { 0, 0, 1 }
        // };
        int[][] mat = {
                { 1, 0, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 }
        };
        int ans = numSpecial(mat);
        System.out.println(ans);
    }
}

// Output
// { 1, 0, 0 },
// { 0, 0, 1 },
// { 1, 0, 0 }
// Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
// Output: 1
// Explanation: (1, 2) is a special position because mat[1][2] == 1 and all
// other elements in row 1 and column 2 are 0.

// { 1, 0, 0 },
// { 0, 1, 0 },
// { 0, 0, 1 }
// Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
// Output: 3
// Explanation: (0, 0), (1, 1) and (2, 2) are special positions.

// Explanation : Given an m x n binary matrix mat, return the number of special
// positions in mat.
// A position (i, j) is called special if mat[i][j] == 1 and all other elements
// in row i and column j are 0 (rows and columns are 0-indexed).