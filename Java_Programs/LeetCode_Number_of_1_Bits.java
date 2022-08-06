
// 191. Number of 1 Bits : https://leetcode.com/problems/number-of-1-bits/
public class LeetCode_Number_of_1_Bits {

    static int hammingWeight(int num) {
        int ctr = 0;
        while (num != 0) {
            num = num & (num - 1);
            ctr++;
        }
        return ctr;
    }

    public static void main(String[] args) {
        int num = 00000000000000000000000000001011;
        int ans = hammingWeight(num);
        System.out.println(ans);
    }
}

// Output
// Input: n = 00000000000000000000000000001011
// Output: 3
// Explanation: The input binary string 00000000000000000000000000001011 has a
// total of three '1' bits.

// Input: n = 00000000000000000000000010000000
// Output: 1
// Explanation: The input binary string 00000000000000000000000010000000 has a
// total of one '1' bit.

// Input: n = 11111111111111111111111111111101
// Output: 31
// Explanation: The input binary string 11111111111111111111111111111101 has a
// total of thirty one '1' bits.

// Explanation : Write a function that takes an unsigned integer and returns the
// number of '1' bits it has (also known as the Hamming weight).
// Note:
// Note that in some languages, such as Java, there is no unsigned integer type.
// In this case, the input will be given as a signed integer type. It should not
// affect your implementation, as the integer's internal binary representation
// is the same, whether it is signed or unsigned.
// In Java, the compiler represents the signed integers using 2's complement
// notation. Therefore, in Example 3, the input represents the signed integer.
// -3.