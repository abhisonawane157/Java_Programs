
// 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence : https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
public class LeetCode_Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int index = 1;
        for (String s : words) {
            if (s.startsWith(searchWord))
                return index;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int ans = isPrefixOfWord(sentence, searchWord);
        System.out.println(ans);
    }
}

// Output
// Input: sentence = "i love eating burger", searchWord = "burg"
// Output: 4
// Explanation: "burg" is prefix of "burger" which is the 4th word in the
// sentence.

// Input: sentence = "this problem is an easy problem", searchWord = "pro"
// Output: 2
// Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word
// in the sentence, but we return 2 as it's the minimal index.

// Input: sentence = "i am tired", searchWord = "you"
// Output: -1
// Explanation: "you" is not a prefix of any word in the sentence.

// Explanation : Given a sentence that consists of some words separated by a
// single space, and a searchWord, check if searchWord is a prefix of any word
// in sentence.
// Return the index of the word in sentence (1-indexed) where searchWord is a
// prefix of this word. If searchWord is a prefix of more than one word, return
// the index of the first word (minimum index). If there is no such word return
// -1.
// A prefix of a string s is any leading contiguous substring of s.