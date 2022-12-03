
// Aggressive Cows : https://practice.geeksforgeeks.org/problems/aggressive-cows/1
import java.util.*;

class GFG_Aggressive_Cows {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int ans = -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, stalls[i]);
            max = Math.max(max, stalls[i]);
        }
        int low = 0;
        int high = max - min;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (iValid(stalls, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    static boolean iValid(int[] stalls, int n, int cow, int mid) {
        int cowCount = 1, position = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - position >= mid) {
                cowCount++;
                if (cowCount == cow)
                    return true;
                position = stalls[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] stalls = { 1, 2, 4, 8, 9 };
        int n = stalls.length;
        int k = 3;
        int ans = solve(n, k, stalls);
        System.out.println(ans);
    }
}

// Output
// Input:
// n=5
// k=3
// stalls = [1 2 4 8 9]
// Output:
// 3
// Explanation:
// The first cow can be placed at stalls[0],
// the second cow can be placed at stalls[2] and
// the third cow can be placed at stalls[3].
// The minimum distance between cows, in this case, is 3,
// which also is the largest among all possible ways.

// Input:
// n=5
// k=3
// stalls = [10 1 2 7 5]
// Output:
// 4
// Explanation:
// The first cow can be placed at stalls[0],
// the second cow can be placed at stalls[1] and
// the third cow can be placed at stalls[4].
// The minimum distance between cows, in this case, is 4,
// which also is the largest among all possible ways.

// Explanation : You are given an array consisting of n integers which denote
// the position of a stall. You are also given an integer k which denotes the
// number of aggressive cows. You are given the task of assigning stalls to k
// cows such that the minimum distance between any two of them is the maximum
// possible.
// The first line of input contains two space-separated integers n and k.
// The second line contains n space-separated integers denoting the position of
// the stalls.