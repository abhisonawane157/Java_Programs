
// 2007. Find Original Array From Doubled Array : https://leetcode.com/problems/find-original-array-from-doubled-array/
import java.util.*;

class LeetCode_Find_Original_Array_From_Doubled_Array {
    static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0)
            return new int[] {};
        int[] ans = new int[changed.length / 2];
        Arrays.sort(changed);
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int element : changed)
            maps.put(element, maps.getOrDefault(element, 0) + 1);
        int i = 0, k = 0;
        while (i < (changed.length - 1)) {
            if (changed[i] == (2 * changed[i]) && maps.get(changed[i]) == 1) {
                return new int[] {};
            } else if (maps.containsKey(changed[i]) && maps.get(changed[i]) > 0) {
                if (maps.containsKey(changed[i] * 2) && maps.get(changed[i] * 2) > 0) {
                    ans[k++] = changed[i];
                    maps.put(changed[i], maps.get(changed[i]) - 1);
                    maps.put(changed[i] * 2, maps.get(changed[i] * 2) - 1);
                } else {
                    return new int[] {};
                }
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] changed = { 1, 3, 4, 2, 6, 8 };
        // int[] changed = { 1 };
        int[] changed = { 6, 3, 0, 1 };
        int[] ans = findOriginalArray(changed);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: changed = [1,3,4,2,6,8]
// Output: [1,3,4]
// Explanation: One possible original array could be [1,3,4]:
// - Twice the value of 1 is 1 * 2 = 2.
// - Twice the value of 3 is 3 * 2 = 6.
// - Twice the value of 4 is 4 * 2 = 8.
// Other original arrays could be [4,3,1] or [3,1,4].

// Input: changed = [6,3,0,1]
// Output: []
// Explanation: changed is not a doubled array.

// Input: changed = [1]
// Output: []
// Explanation: changed is not a doubled array.

// Explanation : An integer array original is transformed into a doubled array
// changed by appending twice the value of every element in original, and then
// randomly shuffling the resulting array.
// Given an array changed, return original if changed is a doubled array. If
// changed is not a doubled array, return an empty array. The elements in
// original may be returned in any order.