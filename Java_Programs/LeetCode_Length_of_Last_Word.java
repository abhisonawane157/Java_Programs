
// 58. Length of Last Word : https://leetcode.com/problems/length-of-last-word/
public class LeetCode_Length_of_Last_Word {

    static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        // System.out.println(Arrays.toString(words));
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Input: s = " fly me to the moon "
// Output: 4
// Explanation: The last word is "moon" with length 4.

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

// Explanation : Given a string s consisting of words and spaces, return the
// length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.