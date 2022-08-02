
// 441. Arranging Coins : https://leetcode.com/problems/arranging-coins/
public class LeetCode_Arranging_Coins {

    static int arrangeCoins(int n) {
        int level = 0, coin = 1;
        while (n >= coin) {
            n -= coin;
            coin++;
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        // int num = 846930886; // 2147483647
        int num = 2147483647;
        int ans = arrangeCoins(num);
        System.out.println();
        System.out.println(ans);
    }
}

// Output:
// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.

// Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.

// Explanation: You have n coins and you want to build a staircase with these
// coins. The staircase consists of k rows where the ith row has exactly i
// coins. The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you
// will build.