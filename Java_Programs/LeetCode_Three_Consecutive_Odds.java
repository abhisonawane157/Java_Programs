
// 1550. Three Consecutive Odds : https://leetcode.com/problems/three-consecutive-odds/
public class LeetCode_Three_Consecutive_Odds {
    static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3)
            return false;
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3 };
        // int[] arr = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        System.out.println(threeConsecutiveOdds(arr));
    }
}

// Output
// Input: arr = [2,6,4,1]
// Output: false
// Explanation: There are no three consecutive odds.

// Input: arr = [1,2,34,3,4,5,7,23,12]
// Output: true
// Explanation: [5,7,23] are three consecutive odds.

// Explanation : Given an integer array arr, return true if there are three
// consecutive odd numbers in the array. Otherwise, return false.