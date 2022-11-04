
// Base Equivalence : https://practice.geeksforgeeks.org/problems/base-equivalence1022/1
public class GFG_Base_Equivalence {
    static String baseEquiv(int n, int m) {
        // code here
        String s = n + "";
        for (int i = 2; i <= 32; i++) {
            String st = Integer.toString(Integer.parseInt(s, 10), i);
            if (st.length() == m)
                return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 3;
        String ans = baseEquiv(n, m);
        System.out.println(ans);
    }
}

// Output
// Input: n = 8, m = 2
// Output: Yes
// Explanation: Possible in base 3 as 8 in base 3 is 22.

// Input: n = 8, m = 3
// Output: No
// Explanation: Not possible in any base.

// Explanation : Given a number (n) and no. of digits (m) to represent the
// number, we have to check if we can represent n using exactly m digits in any
// base from 2 to 32.
