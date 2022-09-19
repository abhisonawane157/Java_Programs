
// Sum of two large numbers : https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1
import java.math.*;

public class GFG_Sum_of_two_large_numbers {
    static String findSum(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger cc = aa.add(bb);
        return cc.toString();
    }

    public static void main(String[] args) {
        String a = "709396412620629286296078368866266297068421405425244843899898426245063817157711255932243423295811517100838801957742186421740441523535518511718404612557651698950423196258329381762117874254279211732357101259328759749184501645918245187322484251447365937301814839359003461099133981675607708284331451799198213721901661362382936071361";
        String b = "39031371702810453098018578414127242601772955922421455202353987804064231649151415780203758048048457872157064128708940216242047104883098924639621";
        String c = findSum(a, b);
        System.out.println(c);
    }
}

// Output
// Input:
// X = "25", Y = "23"
// Output:
// 48
// Explanation:
// The sum of 25 and 23 is 48.

// Input:
// X = "2500", Y = "23"
// Output:
// 2523
// Explanation:
// The sum of 2500 and 23 is 2523.

// Explanation : Given two strings denoting non-negative numbers X and Y.
// Calculate the sum of X and Y.