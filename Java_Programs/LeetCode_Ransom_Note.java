
// 383. Ransom Note : https://leetcode.com/problems/ransom-note/
import java.util.*;

public class LeetCode_Ransom_Note {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> maps1 = new HashMap<>();
        HashMap<String, Integer> maps2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            maps1.put(ransomNote.charAt(i) + "", maps1.getOrDefault(ransomNote.charAt(i) + "", 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            maps2.put(magazine.charAt(i) + "", maps2.getOrDefault(magazine.charAt(i) + "", 0) + 1);
        }
        System.out.println(maps1);
        System.out.println(maps2);
        for (String key : maps1.keySet()) {
            if (maps2.containsKey(key)) {
                if (!(maps1.get(key) <= maps2.get(key)))
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "baa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}

// Output
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

// Explanation : Given two strings ransomNote and magazine, return true if
// ransomNote can be constructed by using the letters from magazine and false
// otherwise.
// Each letter in magazine can only be used once in ransomNote.