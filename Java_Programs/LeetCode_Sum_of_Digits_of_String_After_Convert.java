
// 1945. Sum of Digits of String After Convert : https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
import java.util.*;

public class LeetCode_Sum_of_Digits_of_String_After_Convert {

    static HashMap<Character, Integer> hashalot() {
        HashMap<Character, Integer> maps = new HashMap<>();
        char c = ' ';
        for (int i = 0; i < 26; i++) {
            c = (char) ('a' + (i));
            maps.put(c, i + 1);
        }
        // maps.put('a', 1);
        // maps.put('b', 2);
        // maps.put('c', 3);
        // maps.put('d', 4);
        // maps.put('e', 5);
        // maps.put('f', 6);
        // maps.put('g', 7);
        // maps.put('h', 8);
        // maps.put('i', 9);
        // maps.put('j', 10);
        // maps.put('k', 11);
        // maps.put('l', 12);
        // maps.put('m', 13);
        // maps.put('n', 14);
        // maps.put('o', 15);
        // maps.put('p', 16);
        // maps.put('q', 17);
        // maps.put('r', 18);
        // maps.put('s', 19);
        // maps.put('t', 20);
        // maps.put('u', 21);
        // maps.put('v', 22);
        // maps.put('w', 23);
        // maps.put('x', 24);
        // maps.put('y', 25);
        // maps.put('z', 26);
        return maps;
    }

    static int getLucky(String s, int k) {
        HashMap<Character, Integer> maps = hashalot();
        System.out.println(maps);
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                num = num + maps.get(s.charAt(i));
            }
        }
        int total = 0;
        for (int i = 0; i < k; i++) {
            total = add(num);
            num = String.valueOf(total);
        }
        return (total);
    }

    static int add(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        return sum;
    }

    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;
        int ans = getLucky(s, k);
        System.out.println(ans);
    }
}

// Output
// Input: s = "iiii", k = 1
// Output: 36
// Explanation: The operations are as follows:
// - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
// - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
// Thus the resulting integer is 36.

// Input: s = "leetcode", k = 2
// Output: 6
// Explanation: The operations are as follows:
// - Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝
// 12552031545
// - Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
// - Transform #2: 33 ➝ 3 + 3 ➝ 6
// Thus the resulting integer is 6.

// Input: s = "zbax", k = 2
// Output: 8

// Explanation: You are given a string s consisting of lowercase English
// letters, and an integer k.
// First, convert s into an integer by replacing each letter with its position
// in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
// Then, transform the integer by replacing it with the sum of its digits.
// Repeat the transform operation k times in total.
// For example, if s = "zbax" and k = 2, then the resulting integer would be 8
// by the following operations:
// Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
// Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
// Transform #2: 17 ➝ 1 + 7 ➝ 8
// Return the resulting integer after performing the operations described above.