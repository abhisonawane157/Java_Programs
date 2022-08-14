
// 338. Counting Bits : https://leetcode.com/problems/counting-bits/
import java.util.*;

public class LeetCode_Counting_Bits {
    static int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = sum(Integer.toBinaryString(i));
        }
        return arr;
    }

    static int sum(String num) {
        int ad = 0;
        for (int i = 0; i < num.length(); i++) {
            ad += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return ad;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10

// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101

// Explanation : Given an integer n, return an array ans of length n + 1 such
// that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary
// representation of i.