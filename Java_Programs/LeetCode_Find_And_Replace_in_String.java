
// 833. Find And Replace in String : https://leetcode.com/problems/find-and-replace-in-string/
import java.util.*;

public class LeetCode_Find_And_Replace_in_String {
    static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            if (s.startsWith(sources[i], indices[i]))
                map.put(indices[i], i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (map.containsKey(i)) {
                sb.append(targets[map.get(i)]);
                i += sources[map.get(i)].length();
            } else
                sb.append(s.charAt(i++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "fvokzonyhukpwbnkomdianhirsvdulhsfseaqzktupyeverfsd";
        int[] indices = { 26, 30, 38, 2, 41, 10, 8, 44, 19, 4, 13, 28, 21, 35, 23, 16 };
        String[] sources = { "vd", "hsfs", "ktu", "ok", "pye", "kp", "hu", "verfs", "ia", "zon", "bnk", "ul", "nh",
                "aqz", "irs", "om" };
        String[] targets = { "h", "gdlf", "nl", "sr", "xhn", "ax", "arf", "ifuax", "a", "mk", "vwqe", "fdl", "n",
                "miyr", "ibh", "den" };
        String ans = findReplaceString(s, indices, sources, targets);
        System.out.println(ans);
    }
}

// Output
// Input: s = "abcd", indices = [0, 2], sources = ["a", "cd"], targets = ["eee",
// "ffff"]
// Output: "eeebffff"
// Explanation:
// "a" occurs at index 0 in s, so we replace it with "eee".
// "cd" occurs at index 2 in s, so we replace it with "ffff".

// Input: s = "abcd", indices = [0, 2], sources = ["ab","ec"], targets =
// ["eee","ffff"]
// Output: "eeecd"
// Explanation:
// "ab" occurs at index 0 in s, so we replace it with "eee".
// "ec" does not occur at index 2 in s, so we do nothing.

// Explanation : You are given a 0-indexed string s that you must perform k
// replacement operations on. The replacement operations are given as three
// 0-indexed parallel arrays, indices, sources, and targets, all of length k.
// To complete the ith replacement operation:
// Check if the substring sources[i] occurs at index indices[i] in the original
// string s.
// If it does not occur, do nothing.
// Otherwise if it does occur, replace that substring with targets[i].
// For example, if s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i]
// = "eee", then the result of this replacement will be "eeecd".
// All replacement operations must occur simultaneously, meaning the replacement
// operations should not affect the indexing of each other. The testcases will
// be generated such that the replacements will not overlap.
// For example, a testcase with s = "abc", indices = [0, 1], and sources =
// ["ab","bc"] will not be generated because the "ab" and "bc" replacements
// overlap.
// Return the resulting string after performing all replacement operations on s.
// A substring is a contiguous sequence of characters in a string.