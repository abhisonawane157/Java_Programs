
// 1498. Number of Subsequences That Satisfy the Given Sum Condition : https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
import java.util.*;

public class LeetCode_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition {
    public static int count = 0;

    static void subseq(String p, String up, int target) {
        if (up.isEmpty()) {
            // System.out.println(p);
            if (sumCond(p, target)) {
                count++;
            }
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1), target);
        subseq(p, up.substring(1), target);
    }

    static boolean sumCond(String num, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            a.add(Integer.parseInt("" + num.charAt(i)));
        }
        Collections.sort(a);
        int min = 0;
        int max = 0;
        if (a.size() > 0) {
            min = a.get(0);
            max = a.get(a.size() - 1);
        } else {
            return false;
        }

        return ((min + max) <= target);
    }

    static int numSubseq(int[] nums, int target) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str = str + nums[i];
        }
        subseq("", str, target);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 6, 8 };
        // int[] nums = { 3, 5, 6, 7 };
        int target = 10;
        int ans = numSubseq(nums, target);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [3,5,6,7], target = 9
// Output: 4
// Explanation: There are 4 subsequences that satisfy the condition.
// [3] -> Min value + max value <= target (3 + 3 <= 9)
// [3,5] -> (3 + 5 <= 9)
// [3,5,6] -> (3 + 6 <= 9)
// [3,6] -> (3 + 6 <= 9)

// Input: nums = [3,3,6,8], target = 10
// Output: 6
// Explanation: There are 6 subsequences that satisfy the condition. (nums can
// have repeated numbers).
// [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]

// Input: nums = [2,3,3,4,6,7], target = 12
// Output: 61
// Explanation: There are 63 non-empty subsequences, two of them do not satisfy
// the condition ([6,7], [7]).
// Number of valid subsequences (63 - 2 = 61).

// Explanation : You are given an array of integers nums and an integer target.
// Return the number of non-empty subsequences of nums such that the sum of the
// minimum and maximum element on it is less or equal to target. Since the
// answer may be too large, return it modulo 10^9 + 7.