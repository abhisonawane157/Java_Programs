
// 2119. A Number After a Double Reversal : https://leetcode.com/problems/a-number-after-a-double-reversal/
public class LeetCode_A_Number_After_a_Double_Reversal {
    static boolean isSameAfterReversals(int num) {
        if (Math.abs(num) == 0)
            return true;
        return !String.valueOf(num).endsWith("0");
    }

    public static void main(String[] args) {
        int num = 180004;
        System.out.println(isSameAfterReversals(num));
    }
}

// Output
// Input: num = 526
// Output: true
// Explanation: Reverse num to get 625, then reverse 625 to get 526, which
// equals num.

// Input: num = 1800
// Output: false
// Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not
// equal num.

// Input: num = 0
// Output: true
// Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.

// Explanation : Reversing an integer means to reverse all its digits.
// For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the
// leading zeros are not retained.
// Given an integer num, reverse num to get reversed1, then reverse reversed1 to
// get reversed2. Return true if reversed2 equals num. Otherwise return false.