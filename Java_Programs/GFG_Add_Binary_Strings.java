
// Add Binary Strings : https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1

class GFG_Add_Binary_Strings {
    static String addBinary(String A, String B) {
        // code
        return new java.math.BigInteger(A, 2).add(new java.math.BigInteger(B, 2)).toString(2);
    }

    public static void main(String[] args) {
        String A = "10";
        String B = "01";
        String ans = addBinary(A, B);
        System.out.println(ans);
    }
}

// Output
// Input:
// A = "10", B = "01"
// Output: 11
// Explanation:
// 10
// + 01
// 11

// Input:
// A = "1101", B = "111"
// Output: 10100
// Explanation:
// 1101
// + 111
// 10100

// Explanation : Given two binary strings A and B consisting of only 0s and 1s.
// Find the resultant string after adding the two Binary Strings.
// Note: The input strings may contain leading zeros but the output string
// should not have any leading zeros.