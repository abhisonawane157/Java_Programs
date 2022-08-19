
// 520. Detect Capital : https://leetcode.com/problems/detect-capital/
public class LeetCode_Detect_Capital {
    static boolean detectCapitalUse(String word) {
        if (cap(word))
            return true;
        else if (low(word))
            return true;
        else if (sentence(word))
            return true;
        else
            return false;
    }

    static boolean cap(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                return false;
            }
        }
        return true;
    }

    static boolean sentence(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
                return false;
            } else if (i > 0 && !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                return false;
            } else {
            }
        }
        return true;
    }

    static boolean low(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "USD";
        System.out.println(detectCapitalUse(word));
    }
}

// Output
// Input: word = "USA"
// Output: true

// Input: word = "FlaG"
// Output: false

// Explanation : We define the usage of capitals in a word to be right when one
// of the following cases holds:
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.