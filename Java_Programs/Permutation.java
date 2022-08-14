
import java.util.*;

public class Permutation {
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

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

    static ArrayList<String> permutationRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutationRet(f + ch + s, up.substring(1)));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.print("Permutation (Recursive): ");
        permutation("", "abc");
        System.out.println();
        System.out.println();
        System.out.print("Permutation (Recursive): ");
        ArrayList<String> ans = permutationRet("", "abc");
        System.out.print(ans);
        System.out.println();
        System.out.println();
        System.out.print("Subsequence: ");
        subseq("", "ahbgdc");
    }
}
