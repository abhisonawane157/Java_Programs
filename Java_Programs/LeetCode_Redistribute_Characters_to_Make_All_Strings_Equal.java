
// 1897. Redistribute Characters to Make All Strings Equal : https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
import java.util.*;

public class LeetCode_Redistribute_Characters_to_Make_All_Strings_Equal {
    static boolean makeEqual(String[] words) {
        HashMap<Character, Integer> maps = new HashMap<>();
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (maps.containsKey(word.charAt(j)))
                    maps.put(word.charAt(j), maps.get(word.charAt(j)) + 1);
                else
                    maps.put(word.charAt(j), 1);
            }
        }
        System.out.println(maps);
        for (Character key : maps.keySet()) {
            if (maps.get(key) % words.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "ab", "a" };
        // String[] words = { "abc", "aabc", "bc" };
        System.out.println(makeEqual(words));
    }
}

// Output
// Input: words = ["abc","aabc","bc"]
// Output: true
// Explanation: Move the first 'a' in words[1] to the front of words[2],
// to make words[1] = "abc" and words[2] = "abc".
// All the strings are now equal to "abc", so return true.

// Input: words = ["ab","a"]
// Output: false
// Explanation: It is impossible to make all the strings equal using the
// operation.

// Explanation : You are given an array of strings words (0-indexed).
// In one operation, pick two distinct indices i and j, where words[i] is a
// non-empty string, and move any character from words[i] to any position in
// words[j].
// Return true if you can make every string in words equal using any number of
// operations, and false otherwise.