
import java.util.*;

public class LeetCode_h {
    static List<Integer> intersection(int[][] nums) {
        List<Integer> w1 = new ArrayList<>();
        for (int[] num : nums) {
            for (int element : num) {
                w1.add((element));
            }
        }
        for (int[] word : nums) {
            w1 = check(word, w1);
        }
        return w1;
    }

    static List<Integer> check(int[] word, List<Integer> w1) {
        String g = "";
        for (int element : word) {
            g = g + element;
        }
        List<Integer> an = new ArrayList<>();
        StringBuilder stk = new StringBuilder(g);
        for (int i = 0; i < w1.size() && i <= stk.length(); i++) {
            if (stk.toString().contains(String.valueOf(w1.get(i)))) {
                for (int j = 0; j < stk.length(); j++) {
                    if (String.valueOf(stk.toString().charAt(j)).equals(String.valueOf(w1.get(i)))) {
                        an.add(w1.get(i));
                    }
                }
            }
        }
        return an;
    }

    public static void main(String[] args) {
        int[][] nums = {
                // { 3, 1, 2, 4, 5 },
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        // int[][] nums = {
        // { 3, 1, 2, 4, 5 },
        // { 1, 2, 3, 4 },
        // { 3, 4, 5, 6 }
        // };
        List<Integer> ans = intersection(nums);
        System.out.println(ans);
    }
}
