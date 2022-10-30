
// Satisfy the equation : https://practice.geeksforgeeks.org/problems/satisfy-the-equation5847/1
import java.util.*;

class GFG_Satisfy_the_equation {
    public static int[] satisfyEqn(int[] A, int N) {
        // code here
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                arr[i][j] = A[i] + A[j];
            }
        }
        int ans[] = { -1, -1, -1, -1 };
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (i == k || j == l || i == l || j == k)
                            continue;
                        if (arr[i][j] == arr[k][l]) {
                            ans[0] = i;
                            ans[1] = j;
                            ans[2] = k;
                            ans[3] = l;
                            return ans;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, 7, 1, 2, 9, 8 };
        int N = A.length;
        int[] ans = satisfyEqn(A, N);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input:
// N = 7
// A[] = {3, 4, 7, 1, 2, 9, 8}
// Output:
// 0 2 3 5
// Explanation:
// A[0] + A[2] = 3+7 = 10
// A[3] + A[5] = 1+9 = 10

// Input:
// N = 4
// A[] = {424, 12, 31, 7}
// Output:
// -1 -1 -1 -1
// Explanation:
// There are no pairs satisfying the equation.

// Explanation : Given an array A[ ] of N of integers, find the index of values
// that satisfy A + B = C + D where A,B,C & D are integers values in the array.
// Note: As there may be multiple pairs satisfying the equation return
// lexicographically smallest order of A, B, C and D and return all as -1 if
// there are no pairs satisfying the equation.