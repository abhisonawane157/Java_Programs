
// 1408. String Matching in an Array : https://leetcode.com/problems/string-matching-in-an-array/
import java.util.*;

public class LeetCode_String_Matching_in_an_Array {
    static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            for (String word2 : words) {
                if (word.contains(word2) && word != word2) {
                    if (!list.contains(word2)) {
                        list.add(word2);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // String[] words = { "mass", "as", "hero", "superhero" };
        String[] words = { "blue", "et", "ed" };
        List<String> ans = stringMatching(words);
        System.out.println(ans);
    }
}

// Output
// Input: words = ["mass","as","hero","superhero"]
// Output: ["as","hero"]
// Explanation: "as" is substring of "mass" and "hero" is substring of
// "superhero".
// ["hero","as"] is also a valid answer.

// Input: words = ["leetcode","et","code"]
// Output: ["et","code"]
// Explanation: "et", "code" are substring of "leetcode".

// Input: words = ["blue","green","bu"]
// Output: []

// Explanation : Given an array of string words. Return all strings in words
// which is substring of another word in any order.
// String words[i] is substring of words[j], if can be obtained removing some
// characters to left and/or right side of words[j].