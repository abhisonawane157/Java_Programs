
// 1796. Second Largest Digit in a String : https://leetcode.com/problems/second-largest-digit-in-a-string/
import java.util.HashMap;

public class LeetCode_Second_Largest_Digit_in_a_String {

    static int secondHighest(String s) {
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (maps.containsKey(s.charAt(i))) {
                    maps.put(s.charAt(i), 1 + maps.get(s.charAt(i)));
                } else {
                    maps.put(s.charAt(i), 1);
                }
            }
        }
        // System.out.println(maps);
        if (maps.size() > 1) {
            return Integer.parseInt(String.valueOf(max(maps)));
        }
        return -1;
    }

    static Character max(HashMap<Character, Integer> maps) {
        char n = ' ';
        int i = 1;
        for (Character key : maps.keySet()) {
            if ((i + 1) == maps.size()) {
                n = key;
                i++;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // String str = "dfa12677721afd";
        // String str = "abc1111";
        String str = "url15";
        int ans = secondHighest(str);
        System.out.println(ans);
    }
}

// Output
// Input: s = "dfa12321afd"
// Output: 2
// Explanation: The digits that appear in s are [1, 2, 3]. The second largest
// digit is 2.

// Input: s = "abc1111"
// Output: -1
// Explanation: The digits that appear in s are [1]. There is no second largest
// digit.

// Explanation : Given an alphanumeric string s, return the second largest
// numerical digit that appears in s, or -1 if it does not exist.
// An alphanumeric string is a string consisting of lowercase English letters
// and digits.