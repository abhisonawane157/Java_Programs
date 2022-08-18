
// 1684. Count the Number of Consistent Strings : https://leetcode.com/problems/count-the-number-of-consistent-strings/

public class LeetCode_Count_the_Number_of_Consistent_Strings {
    static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String w : words) {
            int num = 0;
            for (int j = 0; j < w.length(); j++) {
                if (allowed.contains(String.valueOf(w.charAt(j))))
                    num++;
                else
                    break;
            }
            if (num == w.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // String allowed = "abc";
        // String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        String allowed = "cad";
        String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
        // String allowed = "ab";
        // String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int ans = countConsistentStrings(allowed, words);
        System.out.println(ans);
    }
}

// Output
// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
// Output: 2
// Explanation: Strings "aaab" and "baa" are consistent since they only contain
// characters 'a' and 'b'.

// Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
// Output: 7
// Explanation: All strings are consistent.

// Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
// Output: 4
// Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

// Explanation : You are given a string allowed consisting of distinct
// characters and an array of strings words. A string is consistent if all
// characters in the string appear in the string allowed.
// Return the number of consistent strings in the array words.