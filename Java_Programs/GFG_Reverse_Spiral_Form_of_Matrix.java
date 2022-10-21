
// Reverse Spiral Form of Matrix : https://practice.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1
import java.util.*;

class GFG_Reverse_Spiral_Form_of_Matrix {

    static int[] reverseSpiral(int R, int C, int[][] a) {
        // code here
        int ans[] = new int[R * C];
        int kk = R * C - 1;
        int top = 0, left = 0, bottom = R - 1, right = C - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                ans[kk--] = a[top][i];
            top++;
            for (int i = top; i <= bottom; i++)
                ans[kk--] = a[i][right];
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans[kk--] = a[bottom][i];
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans[kk--] = a[i][left];
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 },
        };
        int R = a.length;
        int C = a.length;
        int[] ans = reverseSpiral(R, C, a);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: R = 3, C = 3
// a = {{9, 8, 7},
// {6, 5, 4},
// {3, 2, 1}}
// Output: 5 6 3 2 1 4 7 8 9
// Explanation: Spiral form of the matrix
// in reverse order starts from the centre
// and goes outward.

// Input: R = 4, C = 4
// a = {{1, 2, 3, 4},
// {5, 6, 7, 8},
// {9, 10, 11, 12},
// {13, 14, 15, 16}}
// Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1

// Explanation : Given a matrix as 2D array. Find the reverse spiral traversal
// of the matrix.