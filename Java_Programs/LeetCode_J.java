
import java.util.*;

public class LeetCode_J {
    // static String frequencySort(String s) {
    // ArrayList<Character> list = new ArrayList<>();
    // for (int i = 0; i < s.length(); i++) {
    // list.add(s.charAt(i));
    // }
    // Collections.sort(list, Collections.reverseOrder());
    // System.out.println(list);
    // s = "";
    // for (int i = 0; i < list.size(); i++)
    // s = s + list.get(i);
    // return s;
    // }
    static int[] frequencySort(int[] nums) {
        int max = 1;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i])) {
                maps.put(nums[i], 1 + maps.get(nums[i]));
                max = maps.get(nums[i]);
            } else {
                maps.put(nums[i], 1);
            }
        }
        System.out.println(maps);
        int k = 1;
        String an = "";
        while (k <= max + 1) {
            ArrayList<Integer> m = new ArrayList<>();
            for (Integer key : maps.keySet()) {
                if (maps.containsValue(k)) {
                    if (k == maps.get(key)) {
                        // System.out.println(k + " | " + key);
                        m.add(key);
                    }
                }
            }
            System.out.println(m);
            an = an + ma(m, k);
            m = new ArrayList<>();
            k++;
        }
        an = an.substring(0, an.length() - 1);
        String[] dum = an.split(",");
        System.out.println(Arrays.toString(dum));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(dum[i]);
        }
        return nums;
    }

    static String ma(ArrayList<Integer> m, int k) {
        String temp = "";
        Collections.sort(m, Collections.reverseOrder());
        for (int i = 0; i < m.size(); i++) {
            temp = temp + String.valueOf(m.get(i) + ",").repeat(k);
        }
        return temp;
    }

    public static void main(String[] args) {
        // String s = "tree";
        // String ans = frequencySort(s);
        // System.out.println(ans);
        // int[] nums = { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
        int[] nums = { -4, 31, -12, 29, 40, -7, 3, -12, -12, 20, 23, -4, -12, -41, -9, -41, -7, 31, -9, 22 };
        // int[] nums = { 1, 2, 2, 1, 2, 3 };
        // int[] nums = { -6, -8, -8, -10, -8, -6 };
        int[] ans = frequencySort(nums);
        System.out.println(Arrays.toString(ans));
    }
}
