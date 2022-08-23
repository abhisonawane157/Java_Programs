
public class LeetCode_Longest_Palindromic_Substring {
    static String longestPalindrome(String s) {
        StringBuilder stk = new StringBuilder(s);
        stk.reverse();
        String ans = pal(s, stk.toString());
        return ans;
    }

    static String pal(String str, String revstr) {
        if (str.equals(revstr))
            return str;
        int start = 0;
        int end = str.length() - 1;
        String a = "";
        if (((start + 1) <= end) && revstr.contains(str.substring(start + 1))) {
            return str.substring(start + 1, end);
        } else if ((end) >= start && revstr.contains(str.substring(0, end))) {
            return str.substring(0, end);
        } else {
            StringBuilder stk = new StringBuilder(str.substring(start + 1, end));
            System.out.println(stk.toString());
            a = pal(str.substring(start + 1, end), stk.reverse().toString());
        }
        return a;
    }

    public static void main(String[] args) {
        // String s = "abacdfgdcaba";
        String s = "abac";
        String ans = longestPalindrome(s);

        System.out.println(ans);
    }
}
