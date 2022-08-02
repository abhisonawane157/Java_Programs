
// 125. Valid Palindrome : leetcode.com/problems/valid-palindrome/
public class LeetCode_Valid_Palindrome {
    static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        String palindrome = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                palindrome = palindrome + s.charAt(i);
            }
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                palindrome = palindrome + s.charAt(i);
            }
        }
        String check = "";
        System.out.println(palindrome);
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            check = check + palindrome.charAt(i);
        }
        System.out.println(check);
        return palindrome.equals(check);
    }

    public static void main(String[] args) {
        String str = "1b1";
        if (isPalindrome(str))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// Output
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.