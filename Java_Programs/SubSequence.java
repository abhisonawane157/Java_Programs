
import java.util.*;

public class SubSequence {
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        subseq("", "3124");
        System.out.println();
        ArrayList<String> ans = subseqRet("", "4451");
        System.out.println(ans);
    }
}
