
// 1287. Element Appearing More Than 25% In Sorted Array : https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
import java.math.*;
import java.util.*;

public class LeetCode_Element_Appearing_More_Than_25_P_In_Sorted_Array {
    static int findSpecialInteger(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        HashMap<BigInteger, Integer> maps = new HashMap<>();
        for (int element : arr) {
            if (maps.containsKey(new BigInteger(element + ""))) {
                maps.put(new BigInteger(element + ""), 1 + maps.get(new BigInteger(element + "")));
                if (maps.get(new BigInteger(element + "")) > Double.parseDouble("" + arr.length * (0.25))) {
                    return element;
                }
            } else {
                maps.put(new BigInteger(element + ""), 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        int ans = findSpecialInteger(arr);
        System.out.println(ans);
    }
}

// Output
// Input: arr = [1,2,2,6,6,6,6,7,10]
// Output: 6

// Input: arr = [1,1]
// Output: 1

// Explanation : Given an integer array sorted in non-decreasing order, there is
// exactly one integer in the array that occurs more than 25% of the time,
// return that integer.