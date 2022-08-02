
// 412. Fizz Buzz : https://leetcode.com/problems/fizz-buzz/
import java.util.*;

public class LeetCode_Fizz_Buzz {
    static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else
                list.add(String.valueOf(i));

        }
        return list;
    }

    public static void main(String[] args) {
        int num = 15;
        List<String> arr = fizzBuzz(num);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}

// Output
// Input: n = 3
// Output: ["1","2","Fizz"]

// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]

// Input: n = 15
// Output:
// ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

// Explanation: Given an integer n, return a string array answer (1-indexed)
// where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.