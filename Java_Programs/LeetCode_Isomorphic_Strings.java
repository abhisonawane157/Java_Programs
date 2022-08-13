
// 205. Isomorphic Strings : https://leetcode.com/problems/isomorphic-strings/
import java.util.*;

public class LeetCode_Isomorphic_Strings {
    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                if (maps.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (!maps.containsValue(t.charAt(i)))
                    maps.put(s.charAt(i), t.charAt(i));
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "boo";
        if (isIsomorphic(s, t))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: s = "egg", t = "add"
// Output: true

// Input: s = "foo", t = "bar"
// Output: false

// Input: s = "paper", t = "title"
// Output: true

// Explanation : Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to
// get t.
// All occurrences of a character must be replaced with another character while
// preserving the order of characters. No two characters may map to the same
// character, but a character may map to itself.