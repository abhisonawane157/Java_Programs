
// 1935. Maximum Number of Words You Can Type : https://leetcode.com/problems/maximum-number-of-words-you-can-type/
public class LeetCode_Maximum_Number_of_Words_You_Can_Type {
    static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] w = text.split(" ");
        for (String element : w) {
            int a = 0;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if ((element.contains(String.valueOf(brokenLetters.charAt(j))))) {
                    break;
                } else {
                    a++;
                }
            }
            if (a == brokenLetters.length())
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "leet code";
        String brokenLetters = "e";
        int ans = canBeTypedWords(text, brokenLetters);
        System.out.println(ans);
    }
}

// Output
// Input: text = "hello world", brokenLetters = "ad"
// Output: 1
// Explanation: We cannot type "world" because the 'd' key is broken.

// Input: text = "leet code", brokenLetters = "lt"
// Output: 1
// Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.

// Input: text = "leet code", brokenLetters = "e"
// Output: 0
// Explanation: We cannot type either word because the 'e' key is broken.

// Explanation : There is a malfunctioning keyboard where some letter keys do
// not work. All other keys on the keyboard work properly.
// Given a string text of words separated by a single space (no leading or
// trailing spaces) and a string brokenLetters of all distinct letter keys that
// are broken, return the number of words in text you can fully type using this
// keyboard.