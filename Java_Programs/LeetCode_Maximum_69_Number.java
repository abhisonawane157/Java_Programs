
// 1323. Maximum 69 Number : https://leetcode.com/problems/maximum-69-number/
public class LeetCode_Maximum_69_Number {

    static int maximum69Number(int num) {
        int max = 0;
        String sum = "";
        String n = String.valueOf(num);
        for (int i = 0; i < n.length(); i++) {
            sum = "";
            for (int j = 0; j < n.length(); j++) {
                if (j == i) {
                    if (String.valueOf(n.charAt(j)).equals("9")) {
                        // replacing into 6
                        sum = sum + "6";
                    } else {
                        // replacing into 9
                        sum = sum + "9";
                    }
                } else {
                    sum = sum + n.charAt(j);
                }
            }
            max = Math.max(max, Integer.parseInt(sum));
        }
        return Math.max(max, num);
    }

    public static void main(String[] args) {
        int num = 9999;
        int ans = maximum69Number(num);
        System.out.println(ans);
    }
}

// Output
// Input: num = 9669
// Output: 9969
// Explanation:
// Changing the first digit results in 6669.
// Changing the second digit results in 9969.
// Changing the third digit results in 9699.
// Changing the fourth digit results in 9666.
// The maximum number is 9969.

// Input: num = 9996
// Output: 9999
// Explanation: Changing the last digit 6 to 9 results in the maximum number.

// Input: num = 9999
// Output: 9999
// Explanation: It is better not to apply any change.

// Explanation: You are given a positive integer num consisting only of digits 6
// and 9.
// Return the maximum number you can get by changing at most one digit (6
// becomes 9, and 9 becomes 6).