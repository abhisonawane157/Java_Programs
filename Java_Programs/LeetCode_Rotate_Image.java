
// 48. Rotate Image : https://leetcode.com/problems/rotate-image/
public class LeetCode_Rotate_Image {
    static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j);
            }
        }
        for (int[] rowWise : matrix) {
            reverse(rowWise, 0, col - 1);
        }
        for (int ii = 0; ii < matrix.length; ii++) {
            for (int ij = 0; ij < matrix.length; ij++) {
                System.out.print(matrix[ii][ij] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        // int[][] mat = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };
        int[][] mat = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };
        rotate(mat);
    }
}

// (0,0) || (0,1) || (0,2)
// (1,0) || (1,1) || (1,2)
// (2,0) || (2,1) || (2,2)

// Output
// 05 01 09 11 - 15 13 02 05
// 02 04 08 10 - 14 03 04 01
// 13 03 06 07 - 12 06 08 09
// 15 14 12 16 - 16 07 10 11

// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

// 1 2 3 - 7 4 1
// 4 5 6 - 8 5 2
// 7 8 9 - 9 6 3
// Input:matrix=[[1,2,3],[4,5,6],[7,8,9]]
// Output:[[7,4,1],[8,5,2],[9,6,3]]

// Explanation: You are given an n x n 2D matrix representing an image, rotate
// the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the
// input 2D matrix directly. DO NOT allocate another 2D matrix and do the
// rotation.