
// 1122. Relative Sort Array : https://leetcode.com/problems/relative-sort-array/
import java.util.*;

public class LeetCode_Relative_Sort_Array {
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int element : arr1) {
            a1.add(element);
        }
        int t = 0;
        for (int element : arr2) {
            while (a1.contains(element)) {
                ans[t] = element;
                a1.remove(Integer.valueOf(element));
                t++;
            }
        }
        Collections.sort(a1);
        for (Integer element : a1) {
            ans[t] = element;
            t++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 28, 6, 22, 8, 44, 17 };
        int[] arr2 = { 22, 28, 8, 6 };
        // int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        // int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] ans = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
// Output: [2,2,2,1,4,3,3,9,6,7,19]

// Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
// Output: [22,28,8,6,17,44]

// Explanation : Given two arrays arr1 and arr2, the elements of arr2 are
// distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1
// are the same as in arr2. Elements that do not appear in arr2 should be placed
// at the end of arr1 in ascending order.