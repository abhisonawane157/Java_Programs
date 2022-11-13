
// Fill up buckets : https://practice.geeksforgeeks.org/problems/fill-up-buckets3500/1

import java.util.*;

class GFG_Fill_up_buckets {
    public static int totalWays(int n, int[] capacity) {
        // code here
        Arrays.sort(capacity);
        long d = 0;
        long ans = 1;
        for (int x : capacity) {
            if (x - d <= 0)
                return 0;
            ans *= (x - d);
            ans = ans % 1000000007;
            d++;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] capacity = { 5, 8 };
        int n = capacity.length;
        int ans = totalWays(n, capacity);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 1
// capacity = [6]
// Output: 6
// Explanation: Since there is only one
// bucket. It may hold any number of balls
// ranging from 1 to 6.

// Input:
// n = 2
// capacity = [5, 8]
// Output: 35
// Explanation: If the first bucket has 1
// ball in it then the second bucket cant have 1
// ball, so the second bucket has 8-1 = 7 choices.
// So the first bucket has 5 choices and for each
// choice second bucket has 7 choices.
// So total there are 35 ways.

// Explanation : Given n buckets and infinite number of balls. The maximum
// capacity of each bucket is given in an array capacity[]. Find the number of
// ways to fill the buckets with balls such that each bucket has atleast 1 ball
// and all the buckets have distinct number of balls in them.
// Note: Since the answer may be very large, calculate the answer modulo 10^9+7.