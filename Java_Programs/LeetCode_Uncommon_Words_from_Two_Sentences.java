
// 884. Uncommon Words from Two Sentences : https://leetcode.com/problems/uncommon-words-from-two-sentences/
import java.util.*;

public class LeetCode_Uncommon_Words_from_Two_Sentences {
    static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> maps = new HashMap<>();
        for (String word : s1.split(" ")) {
            if (maps.containsKey(word))
                maps.put(word, 1 + maps.get(word));
            else
                maps.put(word, 1);
        }
        for (String word : s2.split(" ")) {
            if (maps.containsKey(word))
                maps.put(word, 1 + maps.get(word));
            else
                maps.put(word, 1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for (String key : maps.keySet()) {
            if (maps.get(key) == 1)
                ans.add(key);
        }
        String[] an = new String[ans.size()];
        return ans.toArray(an);
    }

    public static void main(String[] args) {
        String s1 = "s z z z s";
        String s2 = "s z sour";
        // String s1 = "this apple is sweet";
        // String s2 = "this apple is sour";
        String[] ans = uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: s1 = "this apple is sweet", s2 = "this apple is sour"
// Output: ["sweet","sour"]

// Input: s1 = "apple apple", s2 = "banana"
// Output: ["banana"]

// Explanation : A sentence is a string of single-space separated words where
// each word consists only of lowercase letters.
// A word is uncommon if it appears exactly once in one of the sentences, and
// does not appear in the other sentence.
// Given two sentences s1 and s2, return a list of all the uncommon words. You
// may return the answer in any order.