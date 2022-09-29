
// Reverse array in groups : https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions
import java.util.*;

public class GFG_Reverse_array_in_groups {
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for (int i = 0; i < n; i = i + k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            while (start < end) {
                Collections.swap(arr, start, end);
                start++;
                end--;
                //
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int n = arr.size();
        int k = 3;
        reverseInGroups(arr, n, k);
    }
}
