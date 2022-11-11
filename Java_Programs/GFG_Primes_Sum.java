
// Primes sum : https://practice.geeksforgeeks.org/problems/primes-sum5827/1

class GFG_Primes_Sum {
    static String isSumOfTwo(int N) {
        // code here
        for (int i = 0; i <= N; i++) {
            if (isPrime(i) && isPrime(N - i)) {
                return "Yes";
            }
        }
        return "No";
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 34;
        String ans = isSumOfTwo(N);
        System.out.println(ans);
    }
}

// Output
// Input: N = 34
// Output: "Yes"
// Explanation: 34 can be expressed as
// sum of two prime numbers.

// Input: N = 23
// Output: "No"
// Explanation: 23 cannnot be expressed as
// sum of two prime numbers.

// Explanation : Given a number N. Find if it can be expressed as sum of two
// prime numbers.