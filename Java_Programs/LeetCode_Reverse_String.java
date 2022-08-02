
// 344. Reverse String : https://leetcode.com/problems/reverse-string/
public class LeetCode_Reverse_String {
    static void reverseString(char[] s) {
        // String str = String.valueOf(s);
        // String cnt = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // cnt = cnt + str.charAt(i);
        // }
        // s = cnt.toCharArray();
        int first = 0;
        int last = s.length - 1;

        while (first < last) {
            char temp = s[first];
            s[first++] = s[last];
            s[last--] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

    public static void main(String[] args) {
        char[] chars = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(chars);
    }
}

// Output
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]