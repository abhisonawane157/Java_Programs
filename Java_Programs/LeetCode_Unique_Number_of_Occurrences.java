
// 1207. Unique Number of Occurrences : https://leetcode.com/problems/unique-number-of-occurrences/
import java.util.*;

public class LeetCode_Unique_Number_of_Occurrences {
    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (maps.containsKey(arr[i]))
                maps.put(arr[i], 1 + maps.get(arr[i]));
            else
                maps.put(arr[i], 1);
        }
        System.out.println(maps);
        ArrayList<Integer> map = new ArrayList<>();
        for (Integer key : maps.keySet()) {
            if (!(map.contains(maps.get(key)))) {
                map.add(maps.get(key));
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        // int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrences(arr));
    }
}

// Output
// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two
// values have the same number of occurrences.

// Input: arr = [1,2]
// Output: false

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true

// Explanation : Given an array of integers arr, return true if the number of
// occurrences of each value in the array is unique, or false otherwise.