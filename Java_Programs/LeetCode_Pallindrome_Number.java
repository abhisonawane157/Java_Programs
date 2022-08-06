
// 9. Palindrome Number : https://leetcode.com/problems/palindrome-number/
class LeetCode_Pallindrome_Number {
    public boolean isPalindrome(int x) {

        // Method -01
        int temp = x;
        int s = 0;
        if (x >= 0) {
            while (x != 0) {
                int y = x % 10;
                s = s * 10 + y;
                x = x / 10;
            }
            if (s == temp) {
                return true;
            } else {
                return false;
            }
        } else
            return false;

        // Method -02
        // String num = String.valueOf(x);
        // int start = 0;
        // int end = num.length() - 1;
        // while (start <= end) {
        // if (num.charAt(start) != num.charAt(end)) {
        // return false;
        // } else {
        // start++;
        // end--;
        // }
        // }
        // return true;

        // Method -03
        // StringBuilder builder = new StringBuilder();
        // builder.append(x);
        // builder.reverse();
        // return String.valueOf(x).equals(builder.toString());
    }

    public static void main(String args[]) {
        LeetCode_Pallindrome_Number ss = new LeetCode_Pallindrome_Number();
        int num = 1213;
        if (ss.isPalindrome(num)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Output
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it
// becomes 121-. Therefore it is not a palindrome.

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

// Explanation : Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same backward as forward.
// For example, 121 is a palindrome while 123 is not.