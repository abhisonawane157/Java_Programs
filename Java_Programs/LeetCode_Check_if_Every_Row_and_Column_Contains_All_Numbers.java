
// 2133. Check if Every Row and Column Contains All Numbers : https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/submissions/
import java.util.*;

public class LeetCode_Check_if_Every_Row_and_Column_Contains_All_Numbers {
    static boolean checkValid(int[][] matrix) {
        HashSet<Integer> set = new HashSet<>();
        // row
        for (int[] element : matrix) {
            set = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                if (set.contains(element[j]))
                    return false;
                else
                    set.add(element[j]);
            }
        }
        // col
        for (int i = 0; i < matrix.length; i++) {
            set = new HashSet<>();
            for (int[] element : matrix) {
                if (set.contains(element[i]))
                    return false;
                else
                    set.add(element[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 3, 1, 2 },
                { 2, 3, 1 }
        };
        if (checkValid(mat))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// 1 2 3
// 3 1 2
// 2 3 1
// Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
// Output: true
// Explanation: In this case, n = 3, and every row and column contains the
// numbers 1, 2, and 3.
// Hence, we return true.

// 1 1 1
// 1 2 3
// 1 2 3
// Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
// Output: false
// Explanation: In this case, n = 3, but the first row and the first column do
// not contain the numbers 2 or 3.
// Hence, we return false.

// Explanation : An n x n matrix is valid if every row and every column contains
// all the integers from 1 to n (inclusive).
// Given an n x n integer matrix matrix, return true if the matrix is valid.
// Otherwise, return false.