
// 14. Longest Common Prefix : https://leetcode.com/problems/longest-common-prefix/
public class LeetCode_Longest_Common_Prefix {
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            if (strs[0].length() > 0) {
                return String.valueOf(strs[0].charAt(0));
            } else {
                return "";
            }
        }
        String pref = "";
        String dum = "";
        for (int k = 0; k < strs[0].length(); k++) {
            dum = pref;
            pref = pref + String.valueOf(strs[0].charAt(k));
            for (String str : strs) {
                for (int j = 0; j < 1; j++) {
                    if (str.startsWith(pref)) {
                        // if (i == 0)
                        // continue;
                    } else {
                        return dum;
                    }
                }
            }
        }
        return pref;
    }

    public static void main(String[] args) {
        // String[] words = { "flower", "flow", "flight" };
        // String[] words = { "dog", "racecar", "car" };
        // String[] words = { "" };
        String[] words = { "flower", "flower", "flower", "flower" };
        String prefix = longestCommonPrefix(words);
        System.out.println(prefix);
    }
}

// Output
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.