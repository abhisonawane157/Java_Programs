
// 258. Add Digits : https://leetcode.com/problems/add-digits/
public class LeetCode_Add_Digits {
    static int addDigits(int num) {
        int sum = su(num);
        System.out.println(num);
        return sum;
    }

    static int su(int n) {
        int s = 0;
        if (String.valueOf(n).length() == 1)
            return n;
        else {
            int u = 0;
            for (int i = 0; i < String.valueOf(n).length(); i++) {
                u = u + (Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i))));
            }
            s = su(u);
        }
        return s;
    }

    public static void main(String[] args) {
        int nums = Integer.MAX_VALUE;
        int ans = addDigits(nums);
        System.out.println(ans);
    }
}

// Output

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2
// Since 2 has only one digit, return it.

// Input: num = 0
// Output: 0

// Explanation: Given an integer num, repeatedly add all its digits until the
// result has only one digit, and return it.