
// 405. Convert a Number to Hexadecimal : https://leetcode.com/problems/convert-a-number-to-hexadecimal/
public class LeetCode_Convert_a_Number_to_Hexadecimal {
    static String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        int n = 26;
        String ans = toHex(n);
        System.out.println(ans);
    }
}

// Output
// Input: num = 26
// Output: "1a"

// Input: num = -1
// Output: "ffffffff"

// Explanation : Given an integer num, return a string representing its
// hexadecimal representation. For negative integers, two’s complement method is
// used.
// All the letters in the answer string should be lowercase characters, and
// there should not be any leading zeros in the answer except for the zero
// itself.
// Note: You are not allowed to use any built-in library method to directly
// solve this problem.