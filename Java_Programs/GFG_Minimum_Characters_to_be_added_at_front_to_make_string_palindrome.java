// Minimum characters to be added at front to make string palindrome : https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1

public class GFG_Minimum_Characters_to_be_added_at_front_to_make_string_palindrome {
    static int minChar(String str) {
        // Write your code here
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            int end = i;
            int start = 0;
            while (start < end) {
                if (str.charAt(start) == str.charAt(end) && (end - start == 1))
                    return n - 1 - i;
                if (str.charAt(start) != str.charAt(end))
                    break;
                start++;
                end--;
            }
            if (start == end)
                return n - i - 1;
        }
        return n - 1;
    }

    public static void main(String[] args) {
        String str = "aacecaaa";
        int ans = minChar(str);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "abc"
// Output: 2
// Explanation:
// Add 'b' and 'c' at front of above string to make it
// palindrome : "cbabc"

// Input:
// S = "aacecaaa"
// Output: 1
// Explanation: Add 'a' at front of above string
// to make it palindrome : "aaacecaaa"

// Explanation : Given string str of length N. The task is to find the minimum
// characters to be added at the front to make string palindrome.
// Note: A palindrome is a word which reads the same backward as forward.
// Example: "madam".