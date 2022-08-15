
// 415. Add Strings : https://leetcode.com/problems/add-strings/
import java.math.*;

public class LeetCode_Add_Strings {
    static String addStrings(String num1, String num2) {
        return String.valueOf(new BigInteger(num1).add(new BigInteger(num2)));
    }

    public static void main(String[] args) {
        String num1 = "1123";
        String num2 = "1123";
        String ans = addStrings(num1, num2);
        System.out.println(ans);
    }
}

// Output
// Input: num1 = "11", num2 = "123"
// Output: "134"

// Input: num1 = "456", num2 = "77"
// Output: "533"

// Input: num1 = "0", num2 = "0"
// Output: "0"

// Explanation : Given two non-negative integers, num1 and num2 represented as
// string, return the sum of num1 and num2 as a string.
// You must solve the problem without using any built-in library for handling
// large integers (such as BigInteger). You must also not convert the inputs to
// integers directly.