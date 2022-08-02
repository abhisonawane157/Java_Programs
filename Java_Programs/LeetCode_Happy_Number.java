
// 202. Happy Number : https://leetcode.com/problems/happy-number/
public class LeetCode_Happy_Number {

    static boolean isHappy(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int nn = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum = sum + (nn * nn);
        }
        if (n == 1) {
            return true;
        } else {
            if (n >= 0 && n <= 4)
                return false;
            boolean b = isHappy(sum);
            return b;
        }
    }

    public static void main(String[] args) {
        int num = 7;
        if (isHappy(num))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// Output
// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

// Input: n = 2
// Output: false