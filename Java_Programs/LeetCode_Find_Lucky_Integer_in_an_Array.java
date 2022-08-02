
// 1394. Find Lucky Integer in an Array : https://leetcode.com/problems/find-lucky-integer-in-an-array/
import java.util.*;

public class LeetCode_Find_Lucky_Integer_in_an_Array {
    static int findLucky(int[] arr) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int element : arr) {
            if (maps.containsKey(element)) {
                maps.put(element, 1 + maps.get(element));
            } else {
                maps.put(element, 1);
            }
        }
        int max = 0;
        List<Integer> fina = new ArrayList<>();
        for (Integer key : maps.keySet()) {
            if (key == maps.get(key)) {
                fina.add(key);
            }
        }
        if (fina.size() == 0)
            return -1;
        for (Integer element : fina) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 2, 2, 3, 3 };
        // int[] arr = { 1, 2, 2, 3, 3, 3 };
        // int[] arr = { 2, 2, 3, 4 };
        int[] arr = { 1, 13, 1, 5, 14, 1, 18, 20, 20, 15, 2, 1, 3, 6, 2, 19, 13, 3, 18, 16, 18, 2, 1, 10, 9, 2, 19, 12,
                5, 19, 7, 4, 4, 6, 19, 2, 3, 13, 18, 18, 16, 18, 16, 16, 9, 2, 17, 11, 2, 4, 7, 18, 13, 14, 4, 15, 14,
                10, 17, 11, 14, 1, 7, 10, 12, 10, 9, 1, 11 };
        int ans = findLucky(arr);
        System.out.println(ans);
    }
}

// Output
// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] ==
// 2.

// Input: arr = [1,2,2,3,3,3]
// Output: 3
// Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

// Input: arr = [2,2,2,3,3]
// Output: -1
// Explanation: There are no lucky numbers in the array.

// Explanation: Given an array of integers arr, a lucky integer is an integer
// that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer
// return -1.