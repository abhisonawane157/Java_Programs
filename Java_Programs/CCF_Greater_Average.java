
// Greater Average : https://www.codechef.com/submit/AVGPROBLEM
import java.util.*;

public class CCF_Greater_Average {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float ans = (a + b) / 2;
            if (ans > c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

// Input
// 5
// 5 9 6
// 5 8 6
// 5 7 6
// 4 9 8
// 3 7 2

// Output
// YES
// YES
// NO
// NO
// YES

// Explanation:
// Test case 1: The average value of 5 and 9 is 7 which is strictly greater than
// 6.

// Test case 2: The average value of 5 and 8 is 6.5 which is strictly greater
// than 6.

// Test case 3: The average value of 5 and 7 is 6 which is not strictly greater
// than 6.

// Test case 4: The average value of 4 and 9 is 6.5 which is not strictly
// greater than 8.

// Test case 5: The average value of 3 and 7 is 55 which is strictly greater
// than 2.

// Explanation : You are given 3 numbers A, B and C.
// Determine whether the average of A and B is strictly greater than C or not?
// NOTE: Average of A and B is defined as {(A+B)}/{2}. For example, average of 5
// and 9 is 7, average of 5 and 8 is 6.5.