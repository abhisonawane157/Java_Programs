
import java.util.*;

public class GFG_IPL_2021_Match_Day_2 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        // for (int i = 0; i <= (n - k); i++) {
        // int max = Integer.MIN_VALUE;
        // for (int j = i; j < (i + k); j++) {
        // System.out.print(arr[j] + ", ");
        // max = Math.max(max, arr[j]);
        // }
        // ans.add(max);
        // System.out.println();
        // }
        int max = 0;
        for (int i = 0; i < k; i++)
            max = Math.max(max, arr[i]);
        for (int i = k; i < n + 1; i++) {
            max = Math.max(arr[i - 1], max);
            if (i - k - 1 >= 0 && max == arr[i - k - 1]) {
                max = 0;
                for (int j = i - k; j < i; j++)
                    max = Math.max(max, arr[j]);
            }
            ans.add(max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int n = 10;
        int k = 4;
        ArrayList<Integer> ans = max_of_subarrays(arr, n, k);
        System.out.println(ans);
    }
}
