
// Print Diagonally : https://practice.geeksforgeeks.org/problems/print-diagonally4331/1
import java.util.*;

public class GFG_Print_Diagonally {
    static ArrayList<Integer> downwardDigonal(int N, int A[][]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for (int sum = 0; sum <= (N - 1) * 2; sum++)
            for (int i = 0; sum - i >= 0; i++)
                if (i < N && sum - i < N)
                    al.add(A[i][sum - i]);
        return al;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // int[][] A = {
        // { 1, 2 },
        // { 3, 4 }
        // };
        int N = A.length;
        ArrayList<Integer> ans = downwardDigonal(N, A);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 2
// A = [[1, 2],
// [3, 4]]
// Output:
// 1 2 3 4
// Explanation:

// Hence, elements will be returned in the
// order {1, 2, 3, 4}.

// Input:
// N = 3
// A = [[1, 2, 3],
// [4, 5, 6],
// [7, 8, 9]]
// Output:
// 1 2 4 3 5 7 6 8 9
// Explanation:

// Hence, elements will be returned in
// the order {1, 2, 4, 3, 5, 7, 6, 8, 9}.

// Explanation : Give a N * N square matrix A, return all the elements of its
// anti-diagonals from top to bottom.