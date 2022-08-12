import java.util.*;

public class Create_Subsets {

    // Recursive
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            System.out.print(" ");
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

    // Iterator
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int num : arr) {
            int n = list.size();
            for (int i = 0; i < n; i++) {
                List<Integer> in = new ArrayList<>(list.get(i));
                in.add(num);
                list.add(in);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 4 };
        System.out.print("Subsets (FOR Loop): ");
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
        System.out.print("Subsets (Recursive): ");
        subseq("", "abc");
        System.out.println();
        System.out.print("Subsets (Recursive): ");
        System.out.println(subseqRet("", "abc"));
    }
}
