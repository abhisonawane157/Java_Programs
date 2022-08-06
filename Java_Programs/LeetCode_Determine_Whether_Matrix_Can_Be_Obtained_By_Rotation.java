
// 1886. Determine Whether Matrix Can Be Obtained By Rotation : https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
import java.util.*;

public class LeetCode_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    static boolean findRotation(int[][] mat, int[][] target) {
        if (checkk(mat, target))
            return true;
        for (int i = 0; i <= 4; i++) {
            if (checkk(mat, target))
                return true;
            else
                mat = rotate(mat);
        }
        return false;
    }

    static boolean checkk(int[][] mat, int[][] target) {
        if (mat.length == target.length && mat[0].length == target[0].length) {
            for (int i = 0; i < mat.length; i++) {
                if (Arrays.equals(mat[i], target[i])) {

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    static int[][] rotate(int[][] mat) {
        int[][] matt = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                matt[i][j] = mat[mat[0].length - j - 1][i];
            }
        }
        return matt;
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };
        int[][] target = {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        if (findRotation(nums, target))
            System.out.println(true);
        else
            System.out.println(false);

    }
}

// Output
// 00 01 | 01 00
// 01 00 | 00 01
// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

// 00 01 | 01 00
// 01 01 | 00 01
// Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
// Output: false
// Explanation: It is impossible to make mat equal to target by rotating mat.

// 00 00 00 | 01 01 01
// 00 01 00 | 00 01 00
// 01 01 01 | 00 00 00
// Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise two times to make mat
// equal target.

// Explanation : Given two n x n binary matrices mat and target, return true if
// it is possible to make mat equal to target by rotating mat in 90-degree
// increments, or false otherwise.