
// 49. Group Anagrams : https://leetcode.com/problems/group-anagrams/description/
import java.util.*;

class LeetCode_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);

        }
        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        String[] strs = { "", "b", "" };
        // String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);
    }
}

// Output
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Input: strs = [""]
// Output: [[""]]

// Input: strs = ["a"]
// Output: [["a"]]

// Explanation : Given an array of strings strs, group the anagrams together.
// You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a
// different word or phrase, typically using all the original letters exactly
// once.