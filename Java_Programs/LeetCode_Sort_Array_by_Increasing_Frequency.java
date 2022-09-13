
// 1636. Sort Array by Increasing Frequency : https://leetcode.com/problems/sort-array-by-increasing-frequency/
import java.util.*;

public class LeetCode_Sort_Array_by_Increasing_Frequency {
    static int max(HashMap<Integer, Integer> maps) {
        int maxx = 0;
        for (Integer key : maps.keySet())
            maxx = Math.max(maxx, maps.get(key));
        return maxx;
    }

    static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num))
                maps.put(num, 1 + maps.get(num));
            else
                maps.put(num, 1);

        }
        int maxi = max(maps);
        int k = 1;
        String an = "";
        while (k <= maxi) {
            ArrayList<Integer> m = new ArrayList<>();
            for (Integer key : maps.keySet()) {
                if (maps.containsValue(k)) {
                    if (k == maps.get(key)) {
                        m.add(key);
                    }
                }
            }
            an = an + ma(m, k);
            m = new ArrayList<>();
            k++;
        }
        an = an.substring(0, an.length() - 1);
        String[] dum = an.split(",");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(dum[i]);
        }
        return nums;
    }

    static String ma(ArrayList<Integer> m, int k) {
        String temp = "";
        Collections.sort(m, Collections.reverseOrder());
        for (Integer element : m) {
            temp = temp + String.valueOf(element + ",").repeat(k);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = { -6, -8, -8, -10, -8, -6 };
        int[] ans = frequencySort(nums);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has
// a frequency of 3.

// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in
// decreasing order.

// Input: nums = [-1,1,-6,4,5,-6,1,4,1]
// Output: [5,-1,4,4,-6,-6,1,1,1]

// Explanation : Given an array of integers nums, sort the array in increasing
// order based on the frequency of the values. If multiple values have the same
// frequency, sort them in decreasing order.
// Return the sorted array.