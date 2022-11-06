
// Minimum number of Coins : https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
import java.util.*;

class GFG_Minimum_Number_Of_Coins {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int[] curr = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int sum = 0;
        while (sum != N) {
            for (int i = curr.length - 1; i >= 0; i--) {
                if (sum != N && !(sum > N) && !(sum + curr[i] > N)) {
                    ans.add(curr[i]);
                    sum += curr[i];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 1000;
        List<Integer> ans = minPartition(N);
        System.out.println(ans);
    }
}

// Output
// Input: N = 43
// Output: 20 20 2 1
// Explanation:
// Minimum number of coins and notes needed
// to make 43.

// Input: N = 1000
// Output: 500 500
// Explanation: minimum possible notes
// is 2 notes of 500.

// Explanation : Given an infinite supply of each denomination of Indian
// currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
// Find the minimum number of coins and/or notes needed to make the change for
// Rs N. You must return the list containing the value of coins required.