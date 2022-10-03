// Modified Numbers and Queries : https://practice.geeksforgeeks.org/problems/modified-numbers-and-queries0904/1

public class GFG_Modified_Numbers_and_Queries {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int factor(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    static int sumOfAll(int l, int r) {
        // code here
        int ans = 0;
        for (int i = l; i <= r; i++) {
            if (i == 1) {
                ans += 1;
            } else {
                ans += factor(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int l = 4;
        int r = 13;
        int ans = sumOfAll(l, r);
        System.out.println(ans);
    }
}

// Output
// Input: l = 1, r = 2
// Output: 3
// Explanation: 1->1, 2->2 and 1+2=3.

// Input: l = 1, r = 6
// Output: 18
// Explanation: 1->1, 2->2, 3->3, 4->2
// 5->5, 6->2+3=5, 1+2+3+2+5+5 = 18.

// Explanation : Find the sum of all the numbers between the range l and r. Here
// each number is represented by the sum of its prime factors.
// Note : For example, 6 is represented by 5 because 6 has two prime factors 2
// and 3 and 2 + 3 = 5.