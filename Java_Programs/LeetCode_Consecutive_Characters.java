
// 1446. Consecutive Characters : https://leetcode.com/problems/consecutive-characters/
public class LeetCode_Consecutive_Characters {
    static int maxPower(String s) {
        int max = 1;
        int current = 0;
        int i = 0;
        char iminus = ' ';
        if (s.length() < 2)
            return s.length();
        while (i < s.length()) {
            if (String.valueOf(s.charAt(i)).equals(String.valueOf(iminus))) {
                current++;
            } else {
                current = 1;
                iminus = s.charAt(i);
            }
            max = Math.max(max, current);
            i++;
        }
        return max;

    }

    public static void main(String[] args) {
        // String str = "leetcode";
        // String str = "ccbccbb";
        String str = "abbcccddddeeeeedcba";
        int ans = maxPower(str);
        System.out.println(ans);
    }
}

// Output
// Input: s = "leetcode"
// Output: 2
// Explanation: The substring "ee" is of length 2 with the character 'e' only.

// Input: s = "abbcccddddeeeeedcba"
// Output: 5
// Explanation: The substring "eeeee" is of length 5 with the character 'e'
// only.

// Explanation: The power of the string is the maximum length of a non-empty
// substring that contains only one unique character.
// Given a string s, return the power of s.