
// Minimum Cost of ropes : https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
import java.util.*;

class GFG_Minimum_Cost_of_ropes {
    static long minCost(long arr[], int n) {
        // your code here
        long ans = 0;
        PriorityQueue<Long> que = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
            que.add(arr[i]);
        while (que.size() > 1) {
            long a1 = que.poll();
            long a2 = que.poll();
            que.add(a1 + a2);
            ans += a1 + a2;
        }
        return ans;
    }

    public static void main(String[] args) {
        // long arr[] = { 4, 3, 2, 6 };
        // long arr[] = { 4, 2, 7, 6, 9 };
        long arr[] = { 9, 19, 77, 14, 77, 90, 15, 28, 22, 17, 100, 26, 29, 18, 38,
                89, 66, 45, 31, 9, 45, 83, 48, 52,
                68, 77, 64, 30, 91, 55, 14, 14, 77, 36 };
        int n = arr.length;
        long ans = minCost(arr, n);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 4
// arr[] = {4, 3, 2, 6}
// Output:
// 29
// Explanation:
// We can connect the ropes in following ways.
// 1) First connect ropes of lengths 2 and 3.
// Which makes the array {4, 5, 6}. Cost of
// this operation 2+3 = 5.
// 2) Now connect ropes of lengths 4 and 5.
// Which makes the array {9, 6}. Cost of
// this operation 4+5 = 9.
// 3) Finally connect the two ropes and all
// ropes have connected. Cost of this
// operation 9+6 =15
// Total cost for connecting all ropes is 5
// + 9 + 15 = 29. This is the optimized cost
// for connecting ropes.
// Other ways of connecting ropes would always
// have same or more cost. For example, if we
// connect 4 and 6 first (we get three rope of 3,
// 2 and 10), then connect 10 and 3 (we get
// two rope of 13 and 2). Finally we
// connect 13 and 2. Total cost in this way
// is 10 + 13 + 15 = 38.

// Input:
// n = 5
// arr[] = {4, 2, 7, 6, 9}
// Output:
// 62
// Explanation:
// First, connect ropes 4 and 2, which makes
// the array {6,7,6,9}. Cost of
// this operation 4+2 = 6. Next, add ropes
// 6 and 6, which results in {12,7,9}.
// Cost of this operation 6+6 = 12.
// Then, add 7 and 9, which makes the array {12,16}.
// Cost of this operation 7+9 = 16. And
// finally, add these two which gives {28}.
// Hence, the total cost is 6 + 12 + 16 +
// 28 = 62.

// Explanation : There are given N ropes of different lengths, we need to
// connect these ropes into one rope. The cost to connect two ropes is equal to
// sum of their lengths. The task is to connect the ropes with minimum cost.
// Given N size array arr[] contains the lengths of the ropes.