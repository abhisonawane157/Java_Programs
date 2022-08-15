
import java.util.*;

public class LeetCode {
    static String decodeString(String s) {
        s = s.replaceAll("\\p{Punct}", "");
        // System.out.println(s);
        // String[] w = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] w = s.split("(?<=\\D)(?=\\d)");
        String ss = "";
        for (int i = w.length - 1; i >= 0; i--) {
            char c = w[i].charAt(0);
            for (int j = 0; j < Integer.parseInt(String.valueOf(c)); j++) {
                ss = w[i].substring(1) + ss;
            }
        }
        System.out.println(Arrays.toString(w));
        return ss;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        // String s = "2[abc]3[cd]ef";
        // String s = "3[a2[c]]";
        String ans = decodeString(s);

        System.out.println(ans);
    }
}
