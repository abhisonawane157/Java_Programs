
// 438. Find All Anagrams in a String : https://leetcode.com/problems/find-all-anagrams-in-a-string/
import java.util.*;

public class LeetCode_Find_All_Anagrams_in_a_String {
    static List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>() {
            };
        }
        List<Integer> ans = new ArrayList<>();
        int size = p.length();
        for (int i = 0; i <= s.length() - size; i++) {
            if (ana(p, s.substring(i, i + size))) {
                // System.out.println(s.substring(i, i + size));
                ans.add(i);
            }
        }
        return ans;
    }

    static boolean ana(String str1, String str2) {
        int sub = 0;
        if (str1.length() == str2.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (map.containsKey(str1.charAt(i)))
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                else
                    map.put(str1.charAt(i), 1);
            }
            // System.out.println(str2);
            // System.out.println(map);
            for (int j = 0; j < str1.length(); j++) {
                if (map.containsKey((str2.charAt(0)))) {
                    if (map.get(str2.charAt(0)) > 1) {
                        map.put(str2.charAt(0), map.get(str2.charAt(0)) - 1);
                    } else {
                        map.remove(str2.charAt(0));
                    }
                    sub = sub + 1;
                    if (str2.length() != 1)
                        str2 = str2.substring(1);
                } else {
                    return false;
                }
            }
            if (str1.length() == sub) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }
}

// Output
// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".

// Explanation : Given two strings s and p, return an array of all the start
// indices of p's anagrams in s. You may return the answer in any order.
// An Anagram is a word or phrase formed by rearranging the letters of a
// different word or phrase, typically using all the original letters exactly
// once.