
// 1768. Merge Strings Alternately : https://leetcode.com/problems/merge-strings-alternately/
public class LeetCode_Merge_Strings_Alternately {
    static String mergeAlternately(String word1, String word2) {
        String fin = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            fin = fin + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }
        if ((word1.length() + word2.length()) == fin.length()) {

        } else {
            while (i < word1.length()) {
                fin = fin + word1.charAt(i);
                i++;
            }
            while (j < word2.length()) {
                fin = fin + word2.charAt(j);
                j++;
            }
        }
        return fin;
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }
}

// Output
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1: a b c
// word2: p q r
// merged: a p b q c r

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1: a b
// word2: p q r s
// merged: a p b q r s

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1: a b c d
// word2: p q
// merged: a p b q c

// Explanation : You are given two strings word1 and word2. Merge the strings by
// adding letters in alternating order, starting with word1. If a string is
// longer than the other, append the additional letters onto the end of the
// merged string.
// Return the merged string.