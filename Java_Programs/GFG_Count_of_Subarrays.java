
// Count of Subarrays : https://practice.geeksforgeeks.org/problems/count-of-subarrays5922/1
class GFG_Count_of_Subarrays {
    static long countSubarray(int arr[], int n, int k) {
        // code here
        int pre = -1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                ans++;
                int left = i - (pre + 1);
                ans += left;
                int right = n - 1 - i;
                ans += right;
                int center = (left * right);
                ans += center;
                pre = i;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        int n = arr.length;
        int k = 2;
        long ans = countSubarray(arr, n, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 3, K = 2
// Arr[] = {3, 2, 1}
// Output: 3
// Explanation: The subarrays having value
// strictly greater than K are: [3], [3, 2]
// and [3, 2, 1]. Thus there are 3 such
// subarrays.

// Input:
// N = 4, K = 1
// Arr[] = {1, 2, 3, 4}
// Output: 9
// Explanation: There are 9 subarrays having
// value strictly greater than K.

// Explanation : Given an array of N positive integers Arr1, Arr2 ............
// Arrn. The value of each contiguous subarray of given array is the maximum
// element present in that subarray. The task is to return the number of
// subarrays having value strictly greater than K.