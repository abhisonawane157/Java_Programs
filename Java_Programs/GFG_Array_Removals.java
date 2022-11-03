
// Array Removals : https://practice.geeksforgeeks.org/problems/array-removals/1
import java.util.*;

public class GFG_Array_Removals {
    static int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = 0, mR = 0;
        while (j < n) {
            if (arr[j] - arr[i] <= k)
                j++;
            else if (i < j)
                i++;
            mR = Math.max(mR, j - i);
        }
        return n - mR;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 9, 10, 11, 12, 17, 20 };
        int n = arr.length;
        int k = 4;
        int ans = removals(arr, n, k);
        System.out.println(ans);
    }
}

// Output
// Input: N = 9, K = 4
// arr[] = {1,3,4,9,10,11,12,17,20}
// Output: 5
// Explanation: Remove 1, 3, 4 from beginning
// and 17, 20 from the end.

// Input: N = 5, K = 2
// arr[] = {1, 5, 6, 2, 8}
// Output: 3
// Explanation: There are multiple ways to
// remove elements in this case.
// One among them is to remove 5, 6, 8.
// The other is to remove 1, 2, 5

// Explanation : Given an array arr[] of size N and an integer K. The task is to
// find the minimum number of elements that should be removed, such that
// Amax-Amin<=K. After the removal of elements, Amax and Amin is considered
// among the remaining elements.

// Note: Can you solve the probelm without using any extra space and O(N*log(N))
// time complexity?