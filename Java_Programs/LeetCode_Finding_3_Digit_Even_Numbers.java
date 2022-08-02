
// 2094. Finding 3-Digit Even Numbers : https://leetcode.com/problems/finding-3-digit-even-numbers/
import java.util.*;

public class LeetCode_Finding_3_Digit_Even_Numbers {
    static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        Arrays.sort(digits);
        int p = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && k != i) {
                        String num = String.valueOf(digits[i]) + String.valueOf(digits[j]) +
                                String.valueOf(digits[k]);
                        if (Integer.parseInt(num) % 2 == 0 && num.length() == 3 && digits[i] != 0) {
                            // System.out.println(digits[i] + " | " + digits[j] + " | " + digits[k]);
                            maps.put(Integer.parseInt(num), 1);
                            p++;
                        }
                    }
                }
            }
        }
        int[] arr = new int[maps.size()];
        int i = 0;
        for (Integer key : maps.keySet()) {
            arr[i] = key;
            i++;
        }
        Arrays.sort(arr);
        if (p == 0)
            return new int[0];
        else
            return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 8, 8, 2 };
        // int[] arr = { 2, 1, 3, 0 };
        // int[] arr = { 3, 7, 5 };
        // int[] arr = { 0, 5, 8, 6, 1, 5, 1, 2, 6, 7, 6, 5, 4, 3, 4, 4, 2, 7, 4, 2, 0,
        // 4, 7, 4, 7, 6, 0, 2, 5, 5, 0, 5, 9,
        // 4, 0, 6, 2, 3, 1, 9, 7, 1, 5, 5, 8, 1, 1, 6, 7, 6, 9, 1, 1, 9, 3, 9, 7, 3, 2,
        // 2, 5, 0, 8, 4, 0, 5, 8, 4,
        // 4, 9, 2, 4, 2, 4, 8, 7, 3, 7, 0, 1, 3, 4, 8, 6, 6, 9, 3, 5, 3, 6, 6, 6, 8, 6,
        // 0, 9, 8, 2, 6, 8 }; //Not Submitted due to this input
        int[] ans = findEvenNumbers(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

// Output
// Input: digits = [2,1,3,0]
// Output: [102,120,130,132,210,230,302,310,312,320]
// Explanation: All the possible integers that follow the requirements are in
// the output array.
// Notice that there are no odd integers or integers with leading zeros.

// Input: digits = [2,2,8,8,2]
// Output: [222,228,282,288,822,828,882]
// Explanation: The same digit can be used as many times as it appears in
// digits.
// In this example, the digit 8 is used twice each time in 288, 828, and 882.

// Input: digits = [3,7,5]
// Output: []
// Explanation: No even integers can be formed using the given digits.