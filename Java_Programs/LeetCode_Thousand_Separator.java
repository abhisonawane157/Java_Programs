
// 1556. Thousand Separator : https://leetcode.com/problems/thousand-separator/
public class LeetCode_Thousand_Separator {
    static String thousandSeparator(int n) {
        char[] arr = ("" + n).toCharArray();
        StringBuilder stb = new StringBuilder();
        for (int i = arr.length - 1, x = 0; i >= 0; i--, x++) {
            if (x != 0 && x % 3 == 0) {
                stb.append("." + arr[i]);
            } else {
                stb.append(arr[i]);
            }
        }
        return stb.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 134566725;
        String ans = thousandSeparator(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 987
// Output: "987"

// Input: n = 1234
// Output: "1.234"

// Explanation : Given an integer n, add a dot (".") as the thousands separator
// and return it in string format.