
// 290. Word Pattern : https://leetcode.com/problems/word-pattern/
import java.util.HashMap;

public class LeetCode_Word_Pattern {

    static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String value = map.get(c);
                if (!value.equals(arr[i])) {
                    return false;
                }
            } else if (map.containsValue(arr[i])) {
                return false;
            }
            map.put(c, arr[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        // String pattern = "abba";
        // String pattern = "abca";
        String pattern = "abc";
        // String str = "dog cat cat dog";
        // String str = "abc";
        // String str = "dog cat dog";
        String str = "b c a";
        // String str = "dog dog dog dog";
        if (wordPattern(pattern, str))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

// Explanation: Given a pattern and a string s, find if s follows the same
// pattern.
// Here follow means a full match, such that there is a bijection between a
// letter in pattern and a non-empty word in s.