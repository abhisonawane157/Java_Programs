//  Help Ishaan : https://practice.geeksforgeeks.org/problems/help-ishaan5837/1

public class GFG_Help_Ishaan {
    public static int NthTerm(int N) {
        // code here
        if (N == 1)
            return 1;
        if (!isPrime(N)) {
            int addPri = addPrime(N) - N;
            int subPri = N - subPrime(N);
            System.out.println(addPri + " - " + subPri);
            return (addPri < subPri) ? addPri : subPri;
        }
        return 0;
    }

    static int addPrime(int anum) {
        while (!isPrime(anum)) {
            anum++;
        }
        return anum;
    }

    static int subPrime(int anum) {
        while (!isPrime(anum)) {
            anum--;
        }
        return anum;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 2;
        int ans = NthTerm(N);
        System.out.println(ans);
    }
}

// Output
// Input: N = 10
// Output: 1
// Explanation: Closest prime to 10 is 11.

// Input: N = 7
// Output: 0
// Explanation: Closest prime to 7 is 7.

// Explanation : Ishaan has been given a task by his teacher. He needs to find
// the Nth term of a series. His teacher gives him some examples to help him out
// (Refer examples below). He is a bit weak in pattern searching so to help him
// his teacher told him that the Nth term is related to prime numbers. The Nth
// term is the difference of N and the closest prime number to N. Help him find
// the Nth term for a given N.