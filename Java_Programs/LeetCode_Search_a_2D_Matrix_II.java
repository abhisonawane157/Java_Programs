
// 240. Search a 2D Matrix II : https://leetcode.com/problems/search-a-2d-matrix-ii/
public class LeetCode_Search_a_2D_Matrix_II {
    static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] element : matrix) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (element[j] >= target) {
                    if (element[j] == target)
                        return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[][] num = {
        // { 1, 3, 5, 7 },
        // { 10, 11, 16, 20 },
        // { 23, 30, 34, 60 }
        // };
        int[][] num = {
                { 1, 3 }
        };
        int target = 3;
        if (searchMatrix(num, target))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// 01 04 07 11 15
// 02 05 08 12 19
// 03 06 09 16 22
// 10 13 14 17 24
// 18 21 23 26 30
// Input: matrix =
// [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],
// target = 5
// Output: true

// 01 04 07 11 15
// 02 05 08 12 19
// 03 06 09 16 22
// 10 13 14 17 24
// 18 21 23 26 30
// Input: matrix =
// [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],
// target = 20
// Output: false

// Explanation : Write an efficient algorithm that searches for a value target
// in an m x n integer matrix matrix. This matrix has the following properties:
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.