
// Composite and Prime : https://practice.geeksforgeeks.org/problems/composite-and-prime0359/1
import java.util.*;

public class GFG_Composite_and_Prime {
    static int Count(int L, int R) {
        ArrayList<Integer> comp = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = L; i <= R; i++) {
            if (i <= 1)
                continue;
            if (prime(i))
                primes.add(i);
            else
                comp.add(i);
        }
        return comp.size() - primes.size();
    }

    static boolean prime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int L = 1;
        int R = 24;
        int ans = Count(L, R);
        System.out.println(ans);
    }
}

// Output
// Input: L = 4, R = 6
// Output: 1
// Explanation: Composite no. are 4 and 6.
// And prime is 5.

// Input: L = 4, R = 4
// Output: 1
// Explanation: There is no prime no. in [L,R]

// Explanation :Given two integers L and R find the difference of number of
// composites and primes between the range L and R (both inclusive).