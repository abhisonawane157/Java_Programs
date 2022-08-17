
// 1331. Rank Transform of an Array : https://leetcode.com/problems/rank-transform-of-an-array/
import java.util.*;

public class LeetCode_Rank_Transform_of_an_Array {
    static int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int element : a) {
            if (!maps.containsKey(element)) {
                maps.put(element, maps.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = maps.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
        // int[] arr = { 100, 100, 100 };
        int[] arr = { 40, 10, 20, 30 };
        int[] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }
}
