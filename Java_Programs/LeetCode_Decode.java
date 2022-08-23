
// 880. Decoded String at Index : https://leetcode.com/problems/decoded-string-at-index/solution/
public class LeetCode_Decode {
    static String decodeAtIndex(String s, int k) {
        int i = 0;
        String n = "";
        while (i <= (k - 1) && i <= s.length() - 1) {
            if (Character.isDigit(s.charAt(i))) {
                n = n.repeat(Integer.parseInt(String.valueOf(s.charAt(i))));
                System.out.println(i + "i" + n);
                // s = n;
                // i = 0;
            } else {
                n = n + s.charAt(i);

            }
            i++;
            // System.out.println(s);
        }
        return n.charAt(k - 1) + "";
    }

    public static void main(String[] args) {
        // String s = "leet2code3";
        // String s = "a2345678999999999999999";
        // String s = "ha22";
        // String s =
        // "yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej";
        // int k = 123365626;
        // String ans = decodeAtIndex(s, k);
        // System.out.println(ans);
    }
}
