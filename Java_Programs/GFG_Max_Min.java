
// Max Min : https://practice.geeksforgeeks.org/problems/max-min/1
public class GFG_Max_Min {
    public static int findSum(int A[], int N) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        return min + max;
    }

    public static void main(String[] args) {
        int A[] = { -2, 1, -4, 5, 3 };
        int N = A.length;
        int ans = findSum(A, N);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 5
// A[] = {-2, 1, -4, 5, 3}
// Output: 1
// Explanation: min = -4, max = 5. Sum = -4 + 5 = 1

// Input:
// N = 4
// A[] = {1, 3, 4, 1}
// Output: 5
// Explanation: min = 1, max = 4. Sum = 1 + 4 = 5

// Explanation : Given an array A of size N of integers. Your task is to find
// the sum of minimum and maximum element in the array.