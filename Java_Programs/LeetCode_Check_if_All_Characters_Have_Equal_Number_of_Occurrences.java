
// 1941. Check if All Characters Have Equal Number of Occurrences : https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
import java.util.*;

public class LeetCode_Check_if_All_Characters_Have_Equal_Number_of_Occurrences {
    static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), 1 + maps.get(s.charAt(i)));
            } else {
                maps.put(s.charAt(i), 1);
            }
        }
        int compare = maps.get(s.charAt(0));
        for (Character key : maps.keySet()) {
            if (compare != maps.get(key))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aaa";
        if (areOccurrencesEqual(str))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All
// characters occur 2 times in s.

// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of
// times.

// Explanation : Given a string s, return true if s is a good string, or false
// otherwise.
// A string s is good if all the characters that appear in s have the same
// number of occurrences (i.e., the same frequency).