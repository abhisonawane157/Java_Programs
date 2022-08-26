import java.util.*;

public class LeetCode_Permu {
    public static List<List<Integer>> ans = new ArrayList<>();

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            System.out.print(" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    // static List<List<Integer>>

    public static void main(String[] args) {
        permutation("", "123");
    }
}
