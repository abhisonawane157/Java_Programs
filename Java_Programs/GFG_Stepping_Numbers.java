
// Stepping Numbers : https://practice.geeksforgeeks.org/problems/stepping-numberswrong-output1813/1
import java.util.*;

public class GFG_Stepping_Numbers {
    static int countSteppingNumbers(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        if (x < 0)
            return 0;
        if (x < 10)
            return x + 1;
        for (int i = 1; i < 10; i++)
            queue.add(i);
        int count = 1;
        while (queue.isEmpty() == false) {
            int num = queue.poll();
            count++;
            int num1 = num * 10 + (num % 10 + 1);
            int num2 = num * 10 + (num % 10 - 1);
            if (num % 10 == 0) {
                if (num1 <= x)
                    queue.add(num1);
            } else if (num % 10 == 9) {
                if (num2 <= x)
                    queue.add(num2);
            } else {
                if (num1 <= x)
                    queue.add(num1);
                if (num2 <= x)
                    queue.add(num2);
            }
        }
        return count;
    }

    static int steppingNumbers(int n, int m) {
        // code here
        return countSteppingNumbers(m) - countSteppingNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 100;
        int m = 150;
        int ans = steppingNumbers(n, m);
        System.out.println(ans);
    }
}

// Output
// Input: n = 0, m = 21
// Output: 13
// Explanation: Stepping no's are 0 1 2 3 4 5
// 6 7 8 9 10 12 21

// Input: n = 10, m = 15
// Output: 2
// Explanation: Stepping no's are 10, 12

// A number is called a stepping number if all adjacent digits have an absolute
// difference of 1, e.g. '321' is a Stepping Number while 421 is not. Given two
// integers n and m, find the count of all the stepping numbers in the range [n,
// m].