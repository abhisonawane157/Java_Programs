
// 2000. Reverse Prefix of Word : https://leetcode.com/problems/reverse-prefix-of-word/
public class LeetCode_Reverse_Prefix_of_Word {
    static String reversePrefix(String word, char ch) {
        if (!(word.contains(String.valueOf(ch))))
            return word;
        StringBuilder stk = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                stk.append(word.substring(0, i + 1));
                break;
            }
        }
        stk.reverse();
        stk.append(word.substring(stk.length(), word.length()));
        return stk.toString();
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'a';
        String ans = reversePrefix(word, ch);
        System.out.println(ans);
    }
}

// Output
// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"
// Explanation: The first occurrence of "d" is at index 3.
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is
// "dcbaefd".

// Input: word = "xyxzxe", ch = "z"
// Output: "zxyxxe"
// Explanation: The first and only occurrence of "z" is at index 3.
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is
// "zxyxxe".

// Input: word = "abcd", ch = "z"
// Output: "abcd"
// Explanation: "z" does not exist in word.
// You should not do any reverse operation, the resulting string is "abcd".

// Explanation : Given a 0-indexed string word and a character ch, reverse the
// segment of word that starts at index 0 and ends at the index of the first
// occurrence of ch (inclusive). If the character ch does not exist in word, do
// nothing.
// For example, if word = "abcdefd" and ch = "d", then you should reverse the
// segment that starts at 0 and ends at 3 (inclusive). The resulting string will
// be "dcbaefd".
// Return the resulting string.