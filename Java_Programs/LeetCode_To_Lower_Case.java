
// 709. To Lower Case : https://leetcode.com/problems/to-lower-case/
public class LeetCode_To_Lower_Case {
    static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "aBcD";
        String ans = toLowerCase(str);
        System.out.println(ans);
    }
}

// Output
// Input: s = "Hello"
// Output: "hello"

// Input: s = "here"
// Output: "here"

// Input: s = "LOVELY"
// Output: "lovely"