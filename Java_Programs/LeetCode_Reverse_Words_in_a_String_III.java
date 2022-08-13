
// 557. Reverse Words in a String III : https://leetcode.com/problems/reverse-words-in-a-string-iii/
// import java.util.*;

public class LeetCode_Reverse_Words_in_a_String_III {
    static String reverseWords(String s) {
        String[] words = s.split(" ");
        s = "";
        // StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                s = s + reverse(words[i].toCharArray());
                // str.append(words[i]);
                // s = s + str.reverse();
                // str.setLength(0);
            } else {
                s = s + reverse(words[i].toCharArray()) + " ";
                // str.append(words[i]);
                // s = s + str.reverse() + " ";
                // str.setLength(0);
            }
        }
        return s;
    }

    static String reverse(char[] ar) {
        int i = 0;
        while (i <= (ar.length - 1) / 2) {
            char temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
            i++;
        }
        return new String(ar);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        // String s = "God Ding";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Input: s = "God Ding"
// Output: "doG gniD"

// Explanation : Given a string s, reverse the order of characters in each word
// within a sentence while still preserving whitespace and initial word order.