
// 476. Number Complement : https://leetcode.com/problems/number-complement/
public class LeetCode_Number_Complement {
    static int findComplement(int num) {
        if (num == 1)
            return 0;
        StringBuilder stb = new StringBuilder("");
        String a = Integer.toBinaryString(num);
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == (char) '1')
                stb.append('0');
            else
                stb.append('1');
        }
        return Integer.parseInt(stb.toString(), 2);
    }

    public static void main(String[] args) {
        int a = 10;
        int ans = findComplement(a);
        System.out.println(ans);
    }
}

// Output
// Input: num = 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits),
// and its complement is 010. So you need to output 2.

// Input: num = 1
// Output: 0
// Explanation: The binary representation of 1 is 1 (no leading zero bits), and
// its complement is 0. So you need to output 0.

// Explanation : The complement of an integer is the integer you get when you
// flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// For example, The integer 5 is "101" in binary and its complement is "010"
// which is the integer 2.
// Given an integer num, return its complement.