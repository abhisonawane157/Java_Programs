
// 414. Third Maximum Number : https://leetcode.com/problems/third-maximum-number/
import java.util.*;

public class LeetCode_Third_Maximum_Number {

    static int thirdMax(int[] nums) {
        nums = insertionsort(nums);
        // System.out.println(Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        if (list.size() >= 3) {
            // System.out.println(list + " " + list.get(2));
            return list.get(2);
        } else {
            return list.get(0);
        }
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 1, 3, 5, 6, 7, 8 };
        // int[] nums = { 2, 1, 3 };
        int[] nums = { 2, 1 };
        // int[] nums = { 2, 2, 3, 1 };
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned
// instead.