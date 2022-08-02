
// 1523. Count Odd Numbers in an Interval Range : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class LeetCode_Count_Odd_Numbers_in_an_Interval_Range {
    static int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 == 0 && high % 2 == 0) {
            count = (high - low) / 2;
        } else if ((low % 2 == 1 && high % 2 == 0) || (low % 2 == 0 && high % 2 == 1)
                || (low % 2 == 1 && high % 2 == 1)) {
            count = ((high - low) / 2) + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int low = 4;
        int high = 20;
        int ans = countOdds(low, high);
        System.out.println(ans);
    }
}

// Output
// Input: low = 3, high = 7
// Output: 3
// Explanation: The odd numbers between 3 and 7 are [3,5,7].

// Input: low = 8, high = 10
// Output: 1
// Explanation: The odd numbers between 8 and 10 are [9].

// Explanation: Given two non-negative integers low and high. Return the count
// of odd numbers between low and high (inclusive).