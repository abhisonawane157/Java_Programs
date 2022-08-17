
// 2185. Counting Words With a Given Prefix : https://leetcode.com/problems/counting-words-with-a-given-prefix/submissions/
public class LeetCode_Counting_Words_With_a_Given_Prefix {
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String s : words) {
            if (s.startsWith(pref))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = { "pay", "attention", "practice", "attend" };
        String searchWord = "at";
        int ans = prefixCount(words, searchWord);
        System.out.println(ans);
    }
}

// Output
// Input: words = ["pay","attention","practice","attend"], pref = "at"
// Output: 2
// Explanation: The 2 strings that contain "at" as a prefix are: "attention" and
// "attend".

// Input: words = ["leetcode","win","loops","success"], pref = "code"
// Output: 0
// Explanation: There are no strings that contain "code" as a prefix.

// Explanation : You are given an array of strings words and a string pref.
// Return the number of strings in words that contain pref as a prefix.
// A prefix of a string s is any leading contiguous substring of s.