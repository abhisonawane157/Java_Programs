
// 9. Palindrome Number : https://leetcode.com/problems/palindrome-number/
class LeetCode_Pallindrome_Number {
    public boolean isPalindrome(int x) {
        int temp = x;
        int s = 0;
        if (x >= 0) {
            while (x != 0) {
                int y = x % 10;
                s = s * 10 + y;
                x = x / 10;
            }
            if (s == temp) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }

    public static void main(String args[]) {
        LeetCode_Pallindrome_Number ss = new LeetCode_Pallindrome_Number();
        int num = 121;
        if (ss.isPalindrome(num)) {
            System.out.println(num + " is Pallindrome");
        } else {
            System.out.println(num + " is not a  Pallindrome");
        }
    }
}

// Output
// 121 is Pallindrome;