
// Maximum Sum LCM : https://practice.geeksforgeeks.org/problems/maximum-sum-lcm3025/1
class GFG_Maximum_Sum_LCM {
    static long maxSumLCM(int n) {
        // code here
        long ans = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    ans += i;
                else {
                    ans += i;
                    ans += n / i;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        long ans = maxSumLCM(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 2
// Output: 3
// Explanation: The distinct numbers you can have are
// just 1 and 2 and their sum is equal to 3.

// Input: n = 5
// Output: 6
// Explanation: The distinct numbers you can have
// are just 1 and 5 and their sum is equal to 6.

// Explanation : Given a positive number n. You need to write a program to find
// the maximum sum of distinct numbers such that the LCM of all these numbers is
// equal to n.