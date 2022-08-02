
// 917. Reverse Only Letters : https://leetcode.com/problems/reverse-only-letters/

public class LeetCode_Reverse_Only_Letters {
    static String reverseOnlyLetters(String s) {
        String str = s.replaceAll("\\p{Punct}", "");
        str = str.replaceAll("[0-9]", "");
        System.out.println(str);
        String d = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            d = d + str.charAt(i);
        }
        String f = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                f = f + d.charAt(j);
                j++;
            } else {
                f = f + c;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        // String str = "ab-cd";
        // String str = "a-bC-dEf-ghIj";
        String str = "Test1ng-Leet=code-Q!"; // Qedo1ct-eeLg=ntse-T!
        String ans = reverseOnlyLetters(str);
        System.out.println(ans);
    }
}

// Output
// Input: s = "ab-cd"
// Output: "dc-ba"

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"

// Explanation: Given a string s, reverse the string according to the following
// rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.