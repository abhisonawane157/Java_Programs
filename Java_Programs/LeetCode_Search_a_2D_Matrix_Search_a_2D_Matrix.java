
// 74. Search a 2D Matrix : https://leetcode.com/problems/search-a-2d-matrix/
public class LeetCode_Search_a_2D_Matrix_Search_a_2D_Matrix {
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
// 01 03 05 07
// 10 11 16 20
// 23 30 34 60
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// 01 03 05 07
// 10 11 16 20
// 23 30 34 60
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

// Explanation : Write an efficient algorithm that searches for a value target
// in an m x n integer matrix matrix. This matrix has the following properties:
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the
// previous row.