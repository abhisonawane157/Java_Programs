
// 1822. Sign of the Product of an Array : https://leetcode.com/problems/sign-of-the-product-of-an-array/
import java.math.*;

public class LeetCode_Sign_of_the_Product_of_an_Array {

    static int arraySign(int[] arr) {
        BigInteger prod = new BigInteger("1");
        for (int element : arr) {
            BigInteger num = new BigInteger(String.valueOf(element));
            prod = prod.multiply(num);
        }
        return signFunc(prod);
    }

    static int signFunc(BigInteger prod) {
        int com = prod.compareTo(new BigInteger("0"));
        if (com == 0)
            return 0;
        else {
            com = prod.compareTo(new BigInteger("1"));
            return com;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 72, 34, 29, -49, -22, -10, -17, -66, -75, -44, -30, -24 };
        int ans = arraySign(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144)
// = 1

// Input: nums = [1,5,0,2,-3]
// Output: 0
// Explanation: The product of all values in the array is 0, and signFunc(0) = 0

// Input: nums = [-1,1,-1,1,-1]
// Output: -1
// Explanation: The product of all values in the array is -1, and signFunc(-1) =
// -1

// Explanation: There is a function signFunc(x) that returns:
// 1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// You are given an integer array nums. Let product be the product of all values
// in the array nums.
// Return signFunc(product).