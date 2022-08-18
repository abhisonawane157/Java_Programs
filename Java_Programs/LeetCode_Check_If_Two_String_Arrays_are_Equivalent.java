
// 1662. Check If Two String Arrays are Equivalent : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class LeetCode_Check_If_Two_String_Arrays_are_Equivalent {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String match1 = "";
        String match2 = "";
        for (String element : word1) {
            match1 = match1 + element;
        }
        for (String element : word2) {
            match2 = match2 + element;
        }
        return match1.equals(match2);
    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}

// Output
// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.

// Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
// Output: false

// Input: word1 = ["abc", "d", "defg"], word2 = ["abcddefg"]
// Output: true

// Explanation : Given two string arrays word1 and word2, return true if the two
// arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in
// order forms the string.