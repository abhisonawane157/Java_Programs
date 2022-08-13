
// 28. Implement strStr() : https://leetcode.com/problems/implement-strstr/
public class LeetCode_Implement_strStr {
    static int strStr(String haystack, String needle) {
        if (needle == "")
            return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }
}

// Output
// Input: haystack = "hello", needle = "ll"
// Output: 2

// Input: haystack = "aaaaa", needle = "bba"
// Output: -1

// Explanation : Implement strStr().
// Given two strings needle and haystack, return the index of the first
// occurrence of needle in haystack, or -1 if needle is not part of haystack.
// Clarification:
// What should we return when needle is an empty string? This is a great
// question to ask during an interview.
// For the purpose of this problem, we will return 0 when needle is an empty
// string. This is consistent to C's strstr() and Java's indexOf().