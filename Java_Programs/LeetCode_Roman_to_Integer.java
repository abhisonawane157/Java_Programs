
// 13. Roman to Integer : https://leetcode.com/problems/roman-to-integer/
import java.util.HashMap;

public class LeetCode_Roman_to_Integer {
    static int romanToInt(String s) {
        int num = 0;
        if (s == null || s.length() == 0)
            return -1;
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("I", 1);
        maps.put("V", 5);
        maps.put("X", 10);
        maps.put("L", 50);
        maps.put("C", 100);
        maps.put("D", 500);
        maps.put("M", 1000);
        num = maps.get(String.valueOf(s.charAt(s.length() - 1)));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (maps.get(String.valueOf(s.charAt(i))) >= maps.get(String.valueOf(s.charAt(i + 1)))) {
                num = num + maps.get(String.valueOf(s.charAt(i)));
            } else {
                num = num - maps.get(String.valueOf(s.charAt(i)));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        // String str = "III";
        // String str = "MCMXCIV";
        int ans = romanToInt(str);
        System.out.println(ans);
    }
}

// Symbol Value
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000

// For example, 2 is written as II in Roman numeral, just two ones added
// together. 12 is written as XII, which is simply X + II. The number 27 is
// written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII. Instead, the number four is
// written as IV. Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX. There
// are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// Output
// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.