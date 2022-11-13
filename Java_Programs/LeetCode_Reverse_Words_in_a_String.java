
// 151. Reverse Words in a String : https://leetcode.com/problems/reverse-words-in-a-string/description/
import java.util.*;

class LeetCode_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        s = s.trim();
        int j = 0;
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                str += c;
            }
            if (!str.isEmpty() && (c == ' ' || j == s.length() - 1)) {
                list.add(str.trim());
                str = "";
            }
            j++;
        }
        str = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                str += list.get(i);
            } else {
                str += list.get(i) + " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        // String s = "a good example";
        String s = "EPY2giL";
        // String s = " hello world ";
        // String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Input: s = " hello world "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing
// spaces.

// Input: s = "a good example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single
// space in the reversed string.

// Explanation : Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will
// be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between
// two words. The returned string should only have a single space separating the
// words. Do not include any extra spaces.