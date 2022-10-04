// Count all possible paths from top left to bottom right : https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1

public class GFG_Count_all_possible_paths_from_top_left_to_bottom_right {

    public static int mod = (int) 1e9 + 7;

    static long helper(int m, int n, long[][] dp) {
        if (m < 0 || n < 0)
            return 0;
        if (m == 0 && n == 0)
            return 1;
        if (dp[m][n] != 0)
            return dp[m][n] % mod;
        return dp[m][n] = (helper(m - 1, n, dp) % mod + helper(m, n - 1, dp) % mod) % mod;
    }

    static long numberOfPaths(int m, int n) {
        // code here
        long[][] dp = new long[m][n];
        return helper(m - 1, n - 1, dp);
    }

    public static void main(String[] args) {
        int r = 2;
        int c = 2;
        long ans = numberOfPaths(r, c);
        System.out.println(ans);
    }
}

// Output
// Input: m = 2, n = 2
// Output: 2
// Explanation: Two possible ways are
// RD and DR.

// Input: m = 3, R = 3
// Output: 6
// Explanation: Six possible ways are
// RRDD, DDRR, RDDR, DRRD, RDRD, DRDR.

// Explanation : The task is to count all the possible paths from top left to
// bottom right of a m X n matrix with the constraints that from each cell you
// can either move only to right or down.