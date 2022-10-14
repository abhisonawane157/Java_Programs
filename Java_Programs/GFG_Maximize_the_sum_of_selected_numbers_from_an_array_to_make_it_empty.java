
// Maximize the sum of selected numbers from an array to make it empty : https://practice.geeksforgeeks.org/problems/maximize-the-sum-of-selected-numbers-from-an-array-to-make-it-empty0836/1
import java.util.*;

class GFG_Maximize_the_sum_of_selected_numbers_from_an_array_to_make_it_empty {
    public static int maximizeSum(int arr[], int n) {
        // Complete the function
        Map<Integer, Integer> map = new TreeMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (map.containsKey(arr[i])) {
                sum += arr[i];
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                if (map.containsKey(arr[i] - 1)) {
                    map.put(arr[i] - 1, map.get(arr[i] - 1) - 1);
                    if (map.get(arr[i] - 1) == 0)
                        map.remove(arr[i] - 1);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3};
        int[] arr = { 1, 2, 2, 2, 3, 4 };
        int n = arr.length;
        int ans = maximizeSum(arr, n);
        System.out.println(ans);
    }
}

// Output
// Input : arr[] = {1, 2, 2, 2, 3, 4}
// Output : 10
// Explanation:
// We select 4, so 4 and 3 are deleted leaving us with {1,2,2,2}.
// Then we select 2, so 2 & 1 are deleted. We are left with{2,2}.
// We select 2 in next two steps, thus the sum is 4+2+2+2=10.

// Input : arr[ ] = {1, 2, 3}
// Output : 4
// Explanation: We select 3, so 3 and 2 are deleted leaving us with {1}. Then we
// select 1, 0 doesn't exist so we delete 1. thus the sum is 3+1=4.

// Explanation : Given a array of N numbers, we need to maximize the sum of
// selected numbers. At each step, you need to select a number Ai, delete one
// occurrence of Ai-1 (if exists), and Ai each from the array. Repeat these
// steps until the array gets empty. The problem is to maximize the sum of the
// selected numbers.

// Note: Numbers need to be selected from maximum to minimum.