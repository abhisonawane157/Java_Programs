
// 2124. Check if All A's Appears Before All B's : https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
public class LeetCode_Check_if_All_As_Appears_Before_All_Bs {
    static boolean checkString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (!(s.charAt(i) <= s.charAt(i + 1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bbbbbbbb";
        System.out.println(checkString(s));
    }
}

// Output
// Input: s = "aaabbb"
// Output: true
// Explanation:
// The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and
// 5.
// Hence, every 'a' appears before every 'b' and we return true.

// Input: s = "abab"
// Output: false
// Explanation:
// There is an 'a' at index 2 and a 'b' at index 1.
// Hence, not every 'a' appears before every 'b' and we return false.

// Input: s = "bbb"
// Output: true
// Explanation:
// There are no 'a's, hence, every 'a' appears before every 'b' and we return
// true.

// Explanation : Given a string s consisting of only the characters 'a' and 'b',
// return true if every 'a' appears before every 'b' in the string. Otherwise,
// return false.