
// 392. Is Subsequence : https://leetcode.com/problems/is-subsequence/
public class LeetCode_Is_Subsequence {
    static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;
        if (s.isBlank()) {
            return true;
        }
        int letter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(letter) == t.charAt(i)) {
                letter++;
                if (letter == s.length())
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(
                isSubsequence("bba", "aaaaa"));
    }
}

// Output

// Input: s = "abc", t = "ahbgdc"
// Output: true

// Input: s = "axc", t = "ahbgdc"
// Output: false

// Explanation : Given two strings s and t, return true if s is a subsequence of
// t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original
// string by deleting some (can be none) of the characters without disturbing
// the relative positions of the remaining characters. (i.e., "ace" is a
// subsequence of "abcde" while "aec" is not).