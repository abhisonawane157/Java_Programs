
// Median in a row-wise sorted Matrix : https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
import java.util.*;

public class GFG_Median_in_a_row_wise_sorted_Matrix {
    static int median(int matrix[][], int R, int C) {
        // code here
        int k = 0;
        int[] arr = new int[R * C];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[k++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        int m = arr.length;
        if (m % 2 != 0)
            return arr[m / 2];
        return (arr[(m - 1) / 2] + arr[m / 2]) / 2;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1 },
                { 2 },
                { 3 }
        };
        // int[][] matrix = {
        // { 1, 3, 5 },
        // { 2, 6, 9 },
        // { 3, 6, 9 }
        // };
        int R = matrix.length;
        int C = matrix[0].length;
        int ans = median(matrix, R, C);
        System.out.println(ans);
    }
}

// Output
// Input:
// R = 3, C = 3
// M = [[1, 3, 5],
// [2, 6, 9],
// [3, 6, 9]]
// Output: 5
// Explanation: Sorting matrix elements gives
// us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median.

// Input:
// R = 3, C = 1
// M = [[1], [2], [3]]
// Output: 2
// Explanation: Sorting matrix elements gives
// us {1,2,3}. Hence, 2 is median.

// Explanation : Given a row wise sorted matrix of size R*C where R and C are
// always odd, find the median of the matrix.