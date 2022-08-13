
// 67. Add Binary : https://leetcode.com/problems/add-binary/
import java.math.*;

public class LeetCode_Add_Binary {

    static String addBinary(String a, String b) {
        BigInteger aa = new BigInteger(a, 2);
        BigInteger bb = new BigInteger(b, 2);
        BigInteger sum = aa.add(bb);
        return "" + sum.toString(2);
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        // String a =
        // "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        // String b =
        // "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String ans = addBinary(a, b);
        System.out.println(ans);
    }
}

// Output
// Input: a = "11", b = "1"
// Output: "100"

// Input: a = "1010", b = "1011"
// Output: "10101"

// Explanation : Given two binary strings a and b, return their sum as a binary
// string.