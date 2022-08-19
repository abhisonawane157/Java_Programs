
// 2309. Greatest English Letter in Upper and Lower Case : https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
public class LeetCode_Greatest_English_Letter_in_Upper_and_Lower_Case {
    static String greatestLetter(String s) {
        String ans = "";
        String str = "";
        char a = ' ';
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (s.contains(String.valueOf(a).toUpperCase()) && s.contains(String.valueOf(a).toLowerCase())) {
                str = str + String.valueOf(a).toUpperCase();
            }
        }
        if (!str.isEmpty())
            ans = String.valueOf(maxAlpha(str));
        return ans;
    }

    static Character maxAlpha(String s) {
        char max = 'A';
        for (int i = 0; i < s.length(); i++) {
            max = (char) Math.max((int) max, (int) s.charAt(i));
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        // String s = "arRAzFif";
        String ans = greatestLetter(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "lEeTcOdE"
// Output: "E"
// Explanation:
// The letter 'E' is the only letter to appear in both lower and upper case.

// Input: s = "arRAzFif"
// Output: "R"
// Explanation:
// The letter 'R' is the greatest letter to appear in both lower and upper case.
// Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is
// greater than 'F' or 'A'.

// Input: s = "AbCdEfGhIjK"
// Output: ""
// Explanation:
// There is no letter that appears in both lower and upper case.

// Explanation : Given a string of English letters s, return the greatest
// English letter which occurs as both a lowercase and uppercase letter in s.
// The returned letter should be in uppercase. If no such letter exists, return
// an empty string.
// An English letter b is greater than another letter a if b appears after a in
// the English alphabet.