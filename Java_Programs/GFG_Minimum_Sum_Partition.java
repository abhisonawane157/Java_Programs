
// Minimum sum partition : https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1

class GFG_Minimum_Sum_Partition {
    public static int minDifference(int arr[], int n) {
        // Your code goes here
        int sum = arr[0];
        for (int i = 1; i < n; i++)
            sum += arr[i];
        boolean dp[] = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j > 0; j--) {
                if (j - arr[i] >= 0 && dp[j - arr[i]])
                    dp[j] = true;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= sum; i++) {
            if (dp[i] == true)
                res = Math.min(res, Math.abs(sum - 2 * i));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4 };
        int n = arr.length;
        int ans = minDifference(arr, n);
        System.out.println(ans);
    }
}

// Output
// Input: N = 4, arr[] = {1, 6, 11, 5}
// Output: 1
// Explanation:
// Subset1 = {1, 5, 6}, sum of Subset1 = 12
// Subset2 = {11}, sum of Subset2 = 11

// Input: N = 2, arr[] = {1, 4}
// Output: 3
// Explanation:
// Subset1 = {1}, sum of Subset1 = 1
// Subset2 = {4}, sum of Subset2 = 4

// Explanation : Given an array arr of size n containing non-negative integers,
// the task is to divide it into two sets S1 and S2 such that the absolute
// difference between their sums is minimum and find the minimum difference