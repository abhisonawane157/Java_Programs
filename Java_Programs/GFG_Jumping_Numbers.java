
// Jumping Numbers : https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1
import java.util.*;

public class GFG_Jumping_Numbers {

    static long jumpingNums(long X) {
        // code here
        Queue<Long> queue = new ArrayDeque<>();
        for (long i = 1; i < 10; i++)
            queue.add(i);
        long ans = 0;
        while (true) {
            long x = queue.poll();
            if (x == X)
                return X;
            else if (x > X)
                break;
            long num1 = x * 10 + (x % 10 - 1);
            long num2 = x * 10 + (x % 10 + 1);
            if (x % 10 > 0)
                queue.add(num1);
            if (x % 10 < 9)
                queue.add(num2);
            ans = x;
        }
        return ans;
    }

    public static void main(String[] args) {
        long X = 50;
        long ans = jumpingNums(X);
        System.out.println(ans);
    }
}

// Output
// Input:
// X = 10
// Output:
// 10
// Explanation:
// 10 is the largest Jumping Number
// possible for X = 10.

// Input:
// X = 50
// Output:
// 45
// Explanation:
// 45 is the largest Jumping Number
// possible for X = 50.

// Explanation : Given a positive number X. Find the largest Jumping Number
// which is smaller than or equal to X.
// Jumping Number: A number is called Jumping Number if all adjacent digits in
// it differ by only 1. All single-digit numbers are considered as Jumping
// Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796, 677 and
// 89098 are not.