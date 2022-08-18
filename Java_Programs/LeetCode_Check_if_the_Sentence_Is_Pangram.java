
// 1832. Check if the Sentence Is Pangram : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class LeetCode_Check_if_the_Sentence_Is_Pangram {
    static boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.contains(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}

// Output
// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English
// alphabet.

// Input: sentence = "leetcode"
// Output: false

// Explanation : A pangram is a sentence where every letter of the English
// alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return
// true if sentence is a pangram, or false otherwise.