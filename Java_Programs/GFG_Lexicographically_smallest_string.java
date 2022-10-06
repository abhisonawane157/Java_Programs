
// Lexicographically smallest string : https://practice.geeksforgeeks.org/problems/mila-and-strings0435/1
import java.util.*;

class GFG_Lexicographically_smallest_string {
    static String lexicographicallySmallest(String S, int k) {
        // code here
        if (pow(S.length()))
            k /= 2;
        else
            k *= 2;
        if (k >= S.length())
            return "-1";
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            while (!stk.empty() && count < k && stk.peek() > ch) {
                count++;
                stk.pop();
            }
            stk.push(ch);
        }
        while (stk.size() > S.length() - k) {
            stk.pop();
        }
        StringBuilder ans = new StringBuilder();
        while (!stk.empty()) {
            ans.append(stk.peek());
            stk.pop();
        }
        ans.reverse();
        return ans.toString();

    }

    static boolean pow(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "code";
        int k = 4;
        String ans = lexicographicallySmallest(S, k);
        System.out.println(ans);
    }
}

// Output
// Input: S = "fooland", k = 2
// Output: "and"
// Explanation: As the size of the string = 7
// which is not a power of 2, hence k = 4.
// After removing 4 characters from the given
// string, the lexicographically smallest
// string is "and".

// Input: S = "code", k = 4
// Output: "cd"
// Explanation: As the length of the string = 4,
// which is 2 to the power 2, hence k = 2.
// Hence, lexicographically smallest string after
// removal of 2 characters is "cd".

// Explanation : Given a string S consisting of only lowercase characters. Find
// the lexicographically smallest string after removing exactly k characters
// from the string. But you have to correct the value of k, i.e., if the length
// of the string is a power of 2, reduce k by half, else multiply k by 2. You
// can remove any k character.
// NOTE: If it is not possible to remove k (the value of k after correction)
// characters or if the resulting string is empty return -1.