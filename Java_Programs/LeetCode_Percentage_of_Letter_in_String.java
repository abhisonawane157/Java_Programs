
// 2278. Percentage of Letter in String : https://leetcode.com/problems/percentage-of-letter-in-string/

public class LeetCode_Percentage_of_Letter_in_String {

    static int percentageLetter(String s, char letter) {
        if (s.contains(String.valueOf(letter))) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == letter)
                    count++;
            }
            return (count * 100) / s.length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int ans = percentageLetter(s, letter);
        System.out.println(ans);
    }
}

// Output
// Input: s = "foobar", letter = "o"
// Output: 33
// Explanation:
// The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% =
// 33% when rounded down, so we return 33.

// Input: s = "jjjj", letter = "k"
// Output: 0
// Explanation:
// The percentage of characters in s that equal the letter 'k' is 0%, so we
// return 0.

// Explanation : Given a string s and a character letter, return the percentage
// of characters in s that equal letter rounded down to the nearest whole
// percent.