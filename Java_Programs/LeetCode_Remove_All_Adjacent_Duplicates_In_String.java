
// 1047. Remove All Adjacent Duplicates In String : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class LeetCode_Remove_All_Adjacent_Duplicates_In_String {
    static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.isEmpty()) {
                sb.append(c);
            } else if (c == sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }
}

// Output
// Input: s = "abbaca"
// Output: "ca"
// Explanation:
// For example, in "abbaca" we could remove "bb" since the letters are adjacent
// and equal, and this is the only possible move. The result of this move is
// that the string is "aaca", of which only "aa" is possible, so the final
// string is "ca".

// Input: s = "azxxzy"
// Output: "ay"

// Explanation : You are given a string s consisting of lowercase English
// letters. A duplicate removal consists of choosing two adjacent and equal
// letters and removing them.
// We repeatedly make duplicate removals on s until we no longer can.
// Return the final string after all such duplicate removals have been made. It
// can be proven that the answer is unique.