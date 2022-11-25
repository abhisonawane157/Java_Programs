
// Shreyansh and his bits : https://practice.geeksforgeeks.org/problems/shreyansh-and-his-bits1420/1

class GFG_Shreyansh_and_his_bits {
    static long count(long n) {
        // Code Here
        long ans = 0;
        int setBits = 0;
        for (int i = 0; i < 64; i++) {
            if ((n & 1) == 1) {
                setBits++;
                long csb_res = csb(i, setBits);
                ans = ans + csb_res;
            }
            n = n >> 1;
        }
        return ans;
    }

    public static long csb(long n, long k) {
        if (n == 0 || n < k)
            return 0;
        long result = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        long n = 8;
        long ans = count(n);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 8
// Output: 3
// Explanation:
// Binary representation of 8 : 1000
// So the integers less than 8 with
// same number of set bits are : 4, 2, 1
// Hence, the result is 3.

// Input:
// N = 4
// Output: 2
// Explanation:
// Binary representation of 4 : 100
// So the integers less than 4 with
// same number of set bits are : 2, 1
// So, The result is 2.

// Explanation : Shreyansh has an integer N. He is really curious about the
// binary representation of integers. He sees that any given integer has a
// number of set bits. Now he wants to find out that how many positive integers,
// strictly less than N, have the same number of set bits as N.
// He is a little weak in maths. Help him find the number of integers.
// Note : Since N takes large values, brute force won't work.