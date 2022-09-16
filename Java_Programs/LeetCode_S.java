
import java.lang.reflect.Array;
import java.util.*;

public class LeetCode_S {
    // static List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> ans = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // ArrayList<Integer> a = new ArrayList<>();
    // a.add(nums[i]);
    // a.add(nums[j]);
    // a.add(nums[k]);
    // Collections.sort(a);
    // if (!ans.contains(a))
    // ans.add(a);
    // }
    // }
    // }
    // }
    // return ans;
    // }
    static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (maps.containsKey(nums[i]))
                maps.put(nums[i], 1 + maps.get(nums[i]));
            else
                maps.put(nums[i], 1);
        int max = 0;
        int ke = 0;
        for (Integer key : maps.keySet()) {
            max = Math.max(max, maps.get(key));
        }
        for (Integer key : maps.keySet()) {
            if (max == maps.get(key)) {
                ke = key;
                break;
            }
        }
        return ke;
    }

    public static void main(String[] args) {
        // int[] nums = { -1, 0, 1, 2, -1, -4 };
        // List<List<Integer>> ans = threeSum(nums);
        // System.out.println(ans);
        int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
        // int k = 3;
        int ans = findShortestSubArray(nums);
        System.out.println(ans);
    }
}
